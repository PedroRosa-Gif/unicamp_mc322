/***********************************************************
Classe em java que representa o objeto de uma Carta do tipo
Lacaio, com seus atributos e metodos usados para setar ou re-
tornar os mesmo.

Criado por: Pedro Rosa
Em: 29/03/2022
************************************************************/
package Lab3RA248448.base;

public class CartaLacaio {
        
    private int ID ;
    private String nome ;
    private int ataque ;
    private int vidaAtual;
    private int vidaMaxima ;
    private int custoMana ;
        
    public CartaLacaio(int ID, String nome, int ataque, int vida, int mana) {
        this.ID = ID;
        this.nome = nome;
        this.ataque = ataque;
        this.vidaAtual = vida;
        this.vidaMaxima = vida;
        this.custoMana = mana;
    }

    public CartaLacaio(int ID, String nome, int mana) {
        this.ID = ID;
        this.nome = nome;
        this.custoMana = mana;
    }

    public CartaLacaio(CartaLacaio origem) {
        this.ID = origem.ID;
        this.nome = origem.nome;
        this.ataque = origem.ataque;
        this.vidaAtual = origem.vidaAtual;
        this.vidaMaxima = origem.vidaMaxima;
        this.custoMana = origem.custoMana;
    }

    public String toString() {
        String out = getNome() + "(ID: " + getID() + ")\n" ;
        out = out + "Ataque = " + getAtaque() + "\n" ;
        out = out + "Vida Atual = " + getVidaAtual() + "\n" ;
        out = out + "Vida Maxima = " + getVidaMaxima() + "\n" ;
        out = out + "Custo de Mana = "+ getCustoMana() + "\n" ;
        return out;
    }

    public int getID() {
        return ID;
    }
    
    public void setID( int ID ) {
        this.ID = ID ;
    }

    public String getNome() {
        return nome;
    }
    
    public void setNome( String nome ) {
        this.nome = nome;
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

    public int getCustoMana() {
        return custoMana;
    }
    
    public void setCustoMana( int custoMana ) {
        this.custoMana = custoMana;
    }
}