package exemplos.patterns.strategy.exemplo1;

/**
 *
 * @author RicardoBrasil
 */
public class Gol extends Carro{
    
    public Gol(){
        super(new Transportar5Pessoas(),"Gol");
    }
}
