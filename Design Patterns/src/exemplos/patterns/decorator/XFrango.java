package exemplos.patterns.decorator;

/**
 *
 * @author RicardoBrasil
 */
public class XFrango extends Lanche{
    
    public XFrango(){
        super.setNome("X-Frango");
    }

    public double getPreco() {
        return 2.5;
    }
    
}
