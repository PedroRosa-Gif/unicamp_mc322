import java.util.ArrayList;

public class Estrategia {
	public ArrayList<Jogada> jogadas;
	public Mesa mesa;
	public ArrayList<Carta> mao;
	public boolean primeiroJogador;
	
	public Estrategia(ArrayList<Jogada> jogadas, Mesa mesa, ArrayList<Carta> mao, boolean primeiroJogador) {
		this.jogadas = jogadas;
		this.mesa = mesa;
		this.mao = mao;
		this.primeiroJogador = primeiroJogador;
	}
	
	public ArrayList<Jogada> letal() {
		ArrayList<CartaLacaio> lacaios = primeiroJogador ? mesa.getLacaiosJog1() : mesa.getLacaiosJog2();
		for (CartaLacaio lacaio: lacaios) {
			if (primeiroJogador) {
				mesa.setVidaHeroi2(mesa.getVidaHeroi2() - lacaio.getAtaque());
				jogadas.add(new Jogada(TipoJogada.ATAQUE, null, null));
				System.out.println("Jogada: Decidi atacar o heroi inimigo com o lacaio:"+ lacaio);
				if (mesa.getVidaHeroi2() <= 0)
					break;
			} else {
				mesa.setVidaHeroi1(mesa.getVidaHeroi1() - lacaio.getAtaque());
				jogadas.add(new Jogada(TipoJogada.ATAQUE, null, null));
				System.out.println("Jogada: Decidi atacar o heroi inimigo com o lacaio:"+ lacaio);
				if (mesa.getVidaHeroi1() <= 0)
					break;
			}
		}
		
		return jogadas;
	}
	
	public ArrayList<Jogada> melhorJogada() {

		return jogadas;
	}
	
	
}
