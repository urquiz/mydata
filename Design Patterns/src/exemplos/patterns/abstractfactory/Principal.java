package exemplos.patterns.abstractfactory;

/**
 *
 * Ricardo Urquiz Brasil
 */
public class Principal {

    public static void main(String[] args) {
        Carro carro = produzirCarro("po");
        System.out.println(carro);
    }

    private static Carro produzirCarro(String tipo) {
        CarroFactory cf = new CarroPopularFactory();
        if("top".equals(tipo)){
            cf = new CarroTopFactory();
        }
        Carro carro = new Carro();
        carro.setRoda(cf.montarRoda());
        carro.setSom(cf.montarSom());
        return carro;
    }
    
}
