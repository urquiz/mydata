package exemplos.patterns.decorator;

/**
 *
 * @author RicardoBrasil
 */
public abstract class IngredienteDecorador extends Lanche{
    
    private Lanche lanche;
    
    public IngredienteDecorador(Lanche lanche){
        this.lanche = lanche;
        super.setNome(lanche.getNome());
    }

    public Lanche getLanche() {
        return lanche;
    }
    
}
