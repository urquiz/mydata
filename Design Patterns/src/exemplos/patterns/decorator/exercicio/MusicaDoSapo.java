package exemplos.patterns.decorator.exercicio;

/**
 *
 * @author RicardoBrasil
 */
public class MusicaDoSapo implements MusicaInfantil {

    private String letra  = "O sapo não lava o pe...";

    @Override
    public String retonarMusica() {
        return letra;
    }

}
