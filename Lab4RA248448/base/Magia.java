/***********************************************************
Classe em java que representa o objeto de uma Carta do tipo
Magia, com seus atributos e metodos usados para setar ou re-
tornar os mesmo.

Criado por: Pedro Rosa
Em: 26/04/2022
************************************************************/
package Lab4RA248448.base;

public class Magia extends Carta{
    
    private String descricao;

    public Magia(String descricao, String nome, int custoMana) {
        super(nome, custoMana);
        this.descricao = descricao;
    }	

    public String toString() {
        String out = super.toString();
        out = out + "Descricao = " + getDescricao() + "\n";

        return out;
    }
    
    public String getDescricao() {
        return this.descricao;
    }
    
    public void setDescricao( String descricao ) {
        this.descricao = descricao;
    }

}
