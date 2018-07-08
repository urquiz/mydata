package exemplos.patterns.decorator;

/**
 *
 * @author RicardoBrasil
 */
public class Tomate extends IngredienteDecorador{

    public Tomate(Lanche lanche) {
        super(lanche);
    }
    
    public double getPreco() {
        return this.getLanche().getPreco() + 0.8 ;
    }
    
}
