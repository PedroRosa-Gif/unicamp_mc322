package base;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

import util.Util;

public class Baralho{
    private ArrayList<Carta> vetorCartas;

    public Baralho() {
        vetorCartas = new ArrayList<Carta>();
    }

    @Override
    public boolean equals(Object obj) {
    	if (this == obj) 
    		return true;
    	if (!(obj instanceof Carta))
    		return false;
    	
    	Baralho baralho = (Baralho) obj;
        if (baralho.vetorCartas != null && this.vetorCartas != null) {
            for (int i = 0; i < this.vetorCartas.size(); i++) {
                if (baralho.vetorCartas.get(i) != this.vetorCartas.get(i)) {
                    return false;
                }
            }
            return true;
        }
        return false;      
    }
    
    @Override
    public int hashCode() {
    	return Objects.hash(vetorCartas);
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
