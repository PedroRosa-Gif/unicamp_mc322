package Lab3RA248448;

import Lab3RA248448.base.CartaLacaio;
import Lab3RA248448.util.Util;
import Lab3RA248448.base.Baralho;
import Lab3RA248448.base.BaralhoArrayList;

public class Main {
    public static void main(String[] args) {
        CartaLacaio lac1 = new CartaLacaio(1, "Frodo Bolseiro", 2, 1, 1);
		CartaLacaio lac2 = new CartaLacaio(2, "Aragorn", 5, 7, 6);
		CartaLacaio lac3 = new CartaLacaio(3, "Legolas", 8, 4, 6);
        Baralho baralho1 = new Baralho();
        BaralhoArrayList baralho2 = new BaralhoArrayList();

        System.out.println("-------------------- Baralho 1 ----------------------");

        baralho1.adicionarCarta(lac1);
        baralho1.adicionarCarta(lac2);
        baralho1.adicionarCarta(lac3);

        baralho1.embaralhar();

        System.out.println("-------------------- Baralho 2 ----------------------");

        baralho2.adicionarCarta(lac1);
        baralho2.adicionarCarta(lac2);
        baralho2.adicionarCarta(lac3);

        baralho2.embaralhar();

        CartaLacaio card = baralho2.comprarCarta();
        System.out.println("----------------------------- Carta Comprada -----------------------------");
        System.out.println(card);

        Util.buffar(lac1, 5);
        Util.buffar(lac2, 3, 2);

        System.out.println("----------------------------- Cartas Buffadas -----------------------------");
        System.out.println(lac1);
        System.out.println(lac2);
    }
}
