package exemplos.patterns.strategy.exemplo1;

/**
 *
 * @author RicardoBrasil
 */
public class Trnasportar2Pessoas implements FormaTransporte{

    @Override
    public String moverSe() {
        return "Trnasportando duas pessoas !";
    }
    
}
