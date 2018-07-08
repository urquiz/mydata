package exemplos.patterns.strategy.exemplo1;

/**
 *
 * @author RicardoBrasil
 */
public class Smart extends Carro{
    
    public Smart(){
        super(new Trnasportar2Pessoas(),"Smart");
    }
    
}
