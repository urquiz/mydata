package exemplos.patterns.observer;

/**
 *
 * @author RicardoBrasil
 */
public class Aluno implements Observer{

    private int nota;
    private Siga siga;
    private String nome;

    public Aluno(Siga siga, String nome) {
        this.siga = siga;
        this.nome = nome;
    }
 
    @Override
    public void notificar() {
        System.out.println("Eu sou " + this.nome +" vou olhar o sistema...");
        this.nota = this.siga.getNota();
        System.out.println("Minha nova nota é... " + this.nota);
    }
    
}
