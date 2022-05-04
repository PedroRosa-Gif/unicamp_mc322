package Lab4RA248448.base;

import java.util.ArrayList;
import java.util.Collections;

import Lab4RA248448.util.Util;

public class Baralho{
    private ArrayList<Carta> vetorCartas;

    public Baralho() {
        vetorCartas = new ArrayList<Carta>();
    }

    public void adicionarCarta(Carta card) {
        if (vetorCartas.size() < Util.MAX_CARDS) {
            vetorCartas.add(card);
        }
    }

    public Carta comprarCarta() {
        int index = (vetorCartas.size() - 1);
        Carta card = vetorCartas.get(index);
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
