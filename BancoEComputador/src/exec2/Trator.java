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
public class Trator extends Veiculo{
    
    private double cargaMaxima;

    public Trator(double cargaMaxima, int qtdRodas, String combustivel) {
        super(qtdRodas, combustivel);
        this.cargaMaxima = cargaMaxima;
    }

    public double getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(double cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }
    
    
    
}
