/***********************************************************
Programa em Java que cria objetos de outras classes e chama
alguns de seus metodos, e mostrando na tela seus atributos.

Criado por: Pedro Rosa
Em: 29/03/2022
************************************************************/
package Lab2RA248448;

public class Main{
	public static void main(String[] args) {
		CartaLacaio lac1 = new CartaLacaio(1, "Frodo Bolseiro", 2, 1, 1);
		CartaLacaio lac2 = new CartaLacaio(2, "Aragorn", 5, 7, 6);
		CartaLacaio lac3 = new CartaLacaio(3, "Legolas", 8, 4, 6);
		CartaLacaio lac4 = new CartaLacaio(3, "Legolas", 6);
        CartaLacaio lac5 = new CartaLacaio(lac2);
		CartaMagia mag1 =  new CartaMagia(4, "You shall not pass", 4, true, 7);
		CartaMagia mag2 =  new CartaMagia(5, "Telecinese", 3, false, 2);

        lac1.setAtaque(lac3.getAtaque());

        System.out.print("----------Questão 2----------\n");
        System.out.print("Ataque: " + lac1.getAtaque());
        System.out.print("\n");

        System.out.print("----------Questão 4----------\n");
        System.out.print("Lacaio 2:\n");
        System.out.print(lac2);
        System.out.print("Lacaio 5:\n");
        System.out.print(lac5);
        System.out.print("\n");

        System.out.print("----------Questão 5----------\n");
        System.out.println(mag1.nome);
        System.out.println(mag1.getNome());
        System.out.print("\n");


        lac2.buffar(2);
        lac2.buffar(-2);

        lac5.buffar(2, 4);
        lac5.buffar(-2, -4);

        System.out.print("----------Questão 6----------\n");
        System.out.print("Lacaio 2:\n");
        System.out.print(lac2);
        System.out.print("\n");
        System.out.print("Lacaio 5:\n");
        System.out.print(lac5);

	}
}