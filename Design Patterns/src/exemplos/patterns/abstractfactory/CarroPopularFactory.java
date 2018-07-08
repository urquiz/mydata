package exemplos.patterns.abstractfactory;

/**
 *
 * Ricardo Urquiz Brasil
 */
public class CarroPopularFactory implements CarroFactory{

    @Override
    public Roda montarRoda() {
        return new RodaDeFerro();
    }

    @Override
    public Som montarSom() {
        return new CDPlayer();
    }

    @Override
    public Carro montarCarro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
