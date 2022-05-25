package base;

import java.util.Objects;
import java.util.UUID;

public class Carta implements Comparable<Carta> {
    private UUID id;
    private String nome;
    private int custoMana;

    public Carta(String nome, int custoMana) {
        this.nome = nome;
        this.custoMana = custoMana;
        this.id = UUID.randomUUID();
    }

    @Override
    public boolean equals(Object obj) {
    	if (this == obj) 
    		return true;
    	if (!(obj instanceof Carta))
    		return false;
    	
    	Carta carta = (Carta) obj;
        if (carta.id != null && this.id != null)
            return carta.id == this.id && carta.nome == this.nome && carta.custoMana == this.custoMana;
        else
            return false;
    }
    
    @Override
    public int hashCode() {
    	return Objects.hash(nome, custoMana, id);
    }

    @Override
    public int compareTo(Carta o) {
        if (this.equals(o))
            return 0;
        if (this.nome.equals(o.nome)) {
            if (this.id.compareTo(o.id) == -1)
                return -1;
            else
                return 1;
        }
        return this.nome.compareTo(o.nome);
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
