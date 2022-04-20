package Lab3RA248448.base;

import java.util.ArrayList;
import java.util.Collections;

import Lab3RA248448.util.Util;

public class BaralhoArrayList{
    private ArrayList<CartaLacaio> vetorCartas;

    public BaralhoArrayList() {
        vetorCartas = new ArrayList<CartaLacaio>();
    }

    public void adicionarCarta(CartaLacaio card) {
        if (vetorCartas.size() < Util.MAX_CARDS) {
            vetorCartas.add(card);
        }
    }

    public CartaLacaio comprarCarta() {
        int index = (vetorCartas.size() - 1);
        CartaLacaio card = vetorCartas.get(index);
        vetorCartas.remove(index);
        return card;
    }

    public void embaralhar() {
        
        Collections.shuffle(vetorCartas);

        Collections.reverse(vetorCartas);

        for(int k = 0; k < vetorCartas.size(); k++) {
            System.out.println(vetorCartas.get(k));
        }

        Collections.reverse(vetorCartas);
    }
    
}
