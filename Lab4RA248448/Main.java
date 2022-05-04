package Lab4RA248448;
import Lab4RA248448.base.*;

public class Main {
    public static void main(String[] args) {
        Lacaio lac1 = new Lacaio("Frodo Bolseiro", 2, 1, 1);
		Lacaio lac2 = new Lacaio("Aragorn", 5, 7, 6);
		Lacaio lac3 = new Lacaio("Legolas", 8, 4, 6);
        Magia mag1 = new Magia("Cause 4 de dano", "Bola de Fogo", 4);
        Baralho baralho = new Baralho();

        baralho.adicionarCarta(lac1);
        baralho.adicionarCarta(lac2);
        baralho.adicionarCarta(lac3);
        baralho.adicionarCarta(mag1);

        baralho.embaralhar();
    }
}
