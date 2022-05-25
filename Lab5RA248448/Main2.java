import java.util.HashSet;
import java.util.TreeSet;

import base.Carta;

public class Main2 {
	public static void main(String[] args) {
		HashSet<Carta> hash = new HashSet<Carta>();
		TreeSet<Carta> tree = new TreeSet<Carta>();
		RandomStringGen generator = new RandomStringGen(8);
		
		for (int i = 0; i < 10000; i++) {
			Carta novaCarta = new Carta(generator.nextString(), 8);
			hash.add(novaCarta);
			tree.add(novaCarta);
		}
		
		long s = System.nanoTime();
		
		for (Carta teste: hash) {
			if (!hash.contains(teste))
				System.out.println("Item não encontrado!");
		}
		
		System.out.println("A operacao com HashSet demorou " + ((System.nanoTime() - s) /1000000) + " ms");

		long s2 = System.nanoTime();
		
		for (Carta teste: tree) {
			if (!tree.contains(teste))
				System.out.println("Item não encontrado!");
		}
		
		System.out.println("A operacao com TreeSet demorou " + ((System.nanoTime() - s2) /1000000) + " ms");
		
		// Colecoes HashSet e TreeSet nao podem armazenar Objetos Iguais, pois um objeto eh guardado em uma posicao especifica de acordo com seus atributos, e Objetos iguais teriam os mesmos atributos tendo que ser armazenados na mesma posicao o que nao eh possivel

	}
}