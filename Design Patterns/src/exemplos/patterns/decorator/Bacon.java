package exemplos.patterns.decorator;

/**
 *
 * @author RicardoBrasil
 */
public class Bacon extends IngredienteDecorador{
    
    public Bacon(Lanche lanche) {
        super(lanche);
    }

    public double getPreco() {
        return this.getLanche().getPreco() + 1.2;
    }

}
