package Lab3RA248448.base;

import java.util.Random;

public class Baralho {

    private CartaLacaio vetorCartas[];
    private int nCartas;
    private static Random gerador = new Random();


    public Baralho() {
        vetorCartas = new CartaLacaio[10];
        nCartas = 0;
    }

    public void adicionarCarta(CartaLacaio card) {
        vetorCartas[nCartas] = card;
        nCartas++;
    }

    public CartaLacaio comprarCarta() {
        nCartas--;
        return vetorCartas[nCartas];
    }

    public void embaralhar() {
        int i, j;

        for (i = 0; i < nCartas; i++) {
            j = gerador.nextInt(i+1);

            if (j != i) {
                CartaLacaio a = vetorCartas[i];
                CartaLacaio b = vetorCartas[j];
                vetorCartas[i] = b;
                vetorCartas[j] = a;
            }
        }

        for(int k = nCartas - 1; k >= 0; k--) {
            System.out.println(vetorCartas[k]);
        }
    }
}
