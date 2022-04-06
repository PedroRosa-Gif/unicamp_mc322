/***********************************************************
Classe em java que representa o objeto de uma Carta do tipo
Magia, com seus atributos e metodos usados para setar ou re-
tornar os mesmo.

Criado por: Pedro Rosa
Em: 29/03/2022
************************************************************/
package Lab2RA248448;

public class CartaMagia {
    
    private int ID;
    public String nome;
    private int dano;
    private Boolean area;
    private int custoMana;


    public CartaMagia(int ID, String nome, int dano, boolean area, int custoMana) {
        this.ID = ID;
        this.nome = nome;
        this.dano = dano;
        this.area = area;
        this.custoMana = custoMana;
    }

    /*
    public String toString() {
        String out = getNome() + "( ID : " + getID() + ")\n";
        out = out + "Dano = " + getDano() + "\n";
        out = out + "Area = " + getArea() + "\n";
        out = out + "Custo de Mana = "+ getCustoMana() + "\n";
        return out;
    }
    */
    
    public int getID() {
        return ID;
    }
    
    public void setID( int ID ) {
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }
    
    public void setNome( String nome ) {
        this.nome = nome;
    }

    public int getDano() {
        return dano;
    }
    
    public void setDano( int dano ) {
        this.dano = dano;
    }

    public Boolean getArea() {
        return area;
    }
    
    public void setArea( Boolean area ) {
        this.area = area;
    }

    public int getCustoMana() {
        return custoMana;
    }
    
    public void setCustoMana( int custoMana ) {
        this.custoMana = custoMana;
    }
}
