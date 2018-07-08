package exemplos.patterns.decorator.exercicio;

/**
 *
 * @author RicardoBrasil
 */
public class Principal {
    
    
    public static void main(String[] args) {
        MusicaInfantil musica = new MusicaCiranda();
        musica = new MusicaDecoratorLetraE(musica);
        System.out.println(musica.retonarMusica());
    }
    
}
