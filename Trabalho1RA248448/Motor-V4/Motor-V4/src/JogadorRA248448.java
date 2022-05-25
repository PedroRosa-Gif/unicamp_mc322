import java.util.ArrayList;
import java.util.Random;

/**
* Esta classe representa um Jogador aleatório (realiza jogadas de maneira aleatória) para o jogo LaMa (Lacaios & Magias).
* @see java.lang.Object
* @author Rafael Arakaki - MC302
*/
public class JogadorRA248448 extends Jogador {
	private ArrayList<CartaLacaio> lacaios;
	private ArrayList<CartaLacaio> lacaiosOponente;
	
	/**
	  * O método construtor do JogadorAleatorio.
	  * 
	  * @param maoInicial Contém a mão inicial do jogador. Deve conter o número de cartas correto dependendo se esta classe Jogador que está sendo construída é o primeiro ou o segundo jogador da partida. 
	  * @param primeiro   Informa se esta classe Jogador que está sendo construída é o primeiro jogador a iniciar nesta jogada (true) ou se é o segundo jogador (false).
	  */
	public JogadorRA248448(ArrayList<Carta> maoInicial, boolean primeiro){
		primeiroJogador = primeiro;
		
		mao = maoInicial;
		lacaios = new ArrayList<CartaLacaio>();
		lacaiosOponente = new ArrayList<CartaLacaio>();
		
		// Mensagens de depuração:
		System.out.println("*Classe JogadorRAxxxxxx* Sou o " + (primeiro?"primeiro":"segundo") + " jogador (classe: JogadorAleatorio)");
		System.out.println("Mao inicial:");
		for(int i = 0; i < mao.size(); i++)
			System.out.println("ID " + mao.get(i).getID() + ": " + mao.get(i));
	}
	
	public boolean ehLetal(Mesa mesa, Carta cartaComprada) {
		int letal = primeiroJogador ? mesa.getVidaHeroi1() : mesa.getVidaHeroi2();
		int manaAtual = primeiroJogador ? mesa.getManaJog1() : mesa.getManaJog2();
		int danoTotal = 0;
		ArrayList<CartaLacaio> lacaios = primeiroJogador ? mesa.getLacaiosJog1() : mesa.getLacaiosJog2();
		
		for (CartaLacaio lacaio: lacaios)
			danoTotal += lacaio.getAtaque();
		
		if (danoTotal >= letal)
			return true;
		
		for (Carta carta: mao) {
			if (carta instanceof CartaMagia && carta.getMana() <= manaAtual) {
				CartaMagia magia = (CartaMagia) carta;
				
				if (danoTotal + magia.getMagiaDano() >= letal)
					return true;
			}
		}
		
		return false;
	}
	
	public int verificarEstrategia(Mesa mesa, Carta cartaComprada, ArrayList<Jogada> jogadasOponente) {
		if (ehLetal(mesa, cartaComprada)) {
			return 0;
		} else {
			return 1;
		}
	}
	
	/**
	  * Um método que processa o turno de cada jogador. Este método deve retornar as jogadas do Jogador decididas para o turno atual (ArrayList de Jogada).
	  * 
	  * @param mesa   O "estado do jogo" imediatamente antes do início do turno corrente. Este objeto de mesa contém todas as informações 'públicas' do jogo (lacaios vivos e suas vidas, vida dos heróis, etc).
	  * @param cartaComprada   A carta que o Jogador recebeu neste turno (comprada do Baralho). Obs: pode ser null se o Baralho estiver vazio ou o Jogador possuir mais de 10 cartas na mão.
	  * @param jogadasOponente   Um ArrayList de Jogada que foram os movimentos utilizados pelo oponente no último turno, em ordem.
	  * @return            um ArrayList com as Jogadas decididas
	  */
	public ArrayList<Jogada> processarTurno (Mesa mesa, Carta cartaComprada, ArrayList<Jogada> jogadasOponente){
		int minhaMana, minhaVida;
		int estilo;
		if(cartaComprada != null)
			mao.add(cartaComprada);
		if(primeiroJogador){
			minhaMana = mesa.getManaJog1();
			minhaVida = mesa.getVidaHeroi1();
			lacaios = mesa.getLacaiosJog1();
			lacaiosOponente = mesa.getLacaiosJog2();
			//System.out.println("--------------------------------- Começo de turno pro jogador1");
			estilo = verificarEstrategia(mesa, cartaComprada, jogadasOponente);
		}
		else{
			minhaMana = mesa.getManaJog2();
			minhaVida = mesa.getVidaHeroi2();
			lacaios = mesa.getLacaiosJog2();
			lacaiosOponente = mesa.getLacaiosJog1();
			//System.out.println("--------------------------------- Começo de turno pro jogador2");
			estilo = verificarEstrategia(mesa, cartaComprada, jogadasOponente);
		}
		
		ArrayList<Jogada> minhasJogadas = new ArrayList<Jogada>();
		
		if (estilo == 0) {
			Estrategia letal = new Estrategia(minhasJogadas, mesa, mao, primeiroJogador);
			minhasJogadas = letal.letal();
		} else {
			Agro agro = new Agro(minhasJogadas, mesa, mao, primeiroJogador);
			
		}
		
		// O laço abaixo cria jogas de baixar lacaios da mão para a mesa se houver mana disponível.
		/*
		for(int i = 0; i < mao.size(); i++){
			Carta card = mao.get(i);
			if(card instanceof CartaLacaio && card.getMana() <= minhaMana){
				Jogada lac = new Jogada(TipoJogada.LACAIO, card, null);
				minhasJogadas.add(lac);
				minhaMana -= card.getMana();
				System.out.println("Jogada: Decidi uma jogada de baixar o lacaio: "+ card);
				mao.remove(i);
				i--;
			}
		}
		*/
		
		
		
		
		return minhasJogadas;
	}
}