package Lab4RA248448.base;

import java.util.UUID;

public class Carta {
    private UUID id;
    private String nome;
    private int custoMana;

    public Carta(String nome, int custoMana) {
        this.nome = nome;
        this.custoMana = custoMana;
        this.id = UUID.randomUUID();
    }

    public String toString() {
        String out = getNome() + "(ID: " + getID() + ")\n" ;
        out = out + "Custo de Mana = "+ getCustoMana() + "\n" ;
        return out;
    }

    public void usar(Carta alvo) {

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public int getCustoMana() {
        return custoMana;
    }
    
    public void setCustoMana( int custoMana ) {
        this.custoMana = custoMana;
    }

    public UUID getID() {
        return this.id;
    }
}
