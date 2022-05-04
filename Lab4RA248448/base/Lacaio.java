/***********************************************************
Classe em java que representa o objeto de uma Carta do tipo
Lacaio, com seus atributos e metodos usados para setar ou re-
tornar os mesmo.

Criado por: Pedro Rosa
Em: 26/04/2022
************************************************************/
package Lab4RA248448.base;

public class Lacaio extends Carta {

    private int ataque;
    private int vidaAtual;
    private int vidaMaxima ;
        
    public Lacaio(String nome, int ataque, int vida, int mana) {
        super(nome, mana);
        this.ataque = ataque;
        this.vidaAtual = vida;
        this.vidaMaxima = vida;
    }

    public void usar(Carta alvo) {
        Lacaio aux = (Lacaio) alvo;
        int vida = aux.getVidaAtual() - this.ataque;

        aux.setVidaAtual(vida < 0 ? 0 : vida);
    }

    public String toString() {
        String out = super.toString();
        out = out + "Ataque = " + getAtaque() + "\n" ;
        out = out + "Vida Atual = " + getVidaAtual() + "\n" ;
        out = out + "Vida Maxima = " + getVidaMaxima() + "\n" ;
        return out;
    }

    public int getAtaque() {
        return ataque;
    }
    
    public void setAtaque( int ataque ) {
        this.ataque = ataque;
    }

    public int getVidaAtual() {
        return vidaAtual;
    }
    
    public void setVidaAtual( int vidaAtual ) {
        this.vidaAtual = vidaAtual;
    }

    public int getVidaMaxima() {
        return vidaMaxima;
    }
    
    public void setVidaMaxima( int vidaMaxima ) {
        this.vidaMaxima = vidaMaxima;
    }
}