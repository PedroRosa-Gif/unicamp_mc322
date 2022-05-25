import java.util.ArrayList;
import java.util.LinkedList;

import base.Carta;

public class Main {
    
    public static void main(String[] args) {

        RandomStringGen generator = new RandomStringGen(8);
        ArrayList<Carta> array = new ArrayList<Carta>();
        LinkedList<Carta> listaLigada = new LinkedList<Carta>();

        for (int i = 0; i < 10000; i++) {
            Carta novaCarta = new Carta(generator.nextString(), 6);
            array.add(novaCarta);
            listaLigada.add(novaCarta);
        }
        long s = System.nanoTime();
        
        for (int j = 0; j < 10000; j++) {
        	array.get(j);
        }

        System.out.println("A operacao com ArrayList demorou " + ((System.nanoTime() - s) /1000000) + " ms");
        
        s = System.nanoTime();
        
        for (int j = 0; j < 10000; j++) {
        	listaLigada.get(j);
        }
        
        System.out.println("A operacao com LinkedList demorou " + ((System.nanoTime() - s) /1000000) + " ms");

        // Em ArrayList e LinkedList eh possivel armazenar objetos iguais, uma vez que cada objeto tem sua posicao
    }
}
