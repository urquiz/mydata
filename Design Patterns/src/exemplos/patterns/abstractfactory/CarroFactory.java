package exemplos.patterns.abstractfactory;

/**
 *
 * Ricardo Urquiz Brasil
 */
public interface CarroFactory {
    
    public Roda montarRoda();
    
    public Som montarSom();
    
     public Carro montarCarro();
    
}
