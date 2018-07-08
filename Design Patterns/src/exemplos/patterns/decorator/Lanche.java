package exemplos.patterns.decorator;

/**
 *
 * @author RicardoBrasil
 */
public abstract class Lanche {
    
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public abstract double getPreco();
    
}
