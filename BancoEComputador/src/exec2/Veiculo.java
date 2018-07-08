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
public class Veiculo {
    
    private int qtdRodas;
    private String combustivel;

    public Veiculo(int qtdRodas, String combustivel) {
        this.qtdRodas = qtdRodas;
        this.combustivel = combustivel;
    }

    public int getQtdRodas() {
        return qtdRodas;
    }

    public String getCombustivel() {
        return combustivel;
    }
    
    
    
}
