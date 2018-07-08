/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exec2;

/**
 *
 * Ricardo Urquiz Brasil
 */
public class Celta extends Veiculo{
    
    private int lotacaoPassageiros;

    public Celta(int lotacaoPassageiros, int qtdRodas, String combustivel) {
        super(qtdRodas, combustivel);
        this.lotacaoPassageiros = lotacaoPassageiros;
    }

    
    public int getLotacaoPassageiros() {
        return lotacaoPassageiros;
    }

    public void setLotacaoPassageiros(int lotacaoPassageiros) {
        this.lotacaoPassageiros = lotacaoPassageiros;
    }
    
    
    
}
