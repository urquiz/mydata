package exemplos.patterns.strategy.exemplo1;

/**
 *
 * @author RicardoBrasil
 */
public class Uno  extends Carro{

    public Uno() {
        super(new Transportar5Pessoas(),"Uno");
    }
   
}
