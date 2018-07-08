/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exec1;

/**
 *
 * Ricardo Urquiz Brasil
 */
public class Desktop extends Computador{
    
    private String corGabinete;
    private int potenciaFonteEnergia;

    public Desktop(String corGabinete, int potenciaFonteEnergia, int velocidadeProcessador, int quantidadeMemoria, String fabicanteProcessador) {
        super(velocidadeProcessador, quantidadeMemoria, fabicanteProcessador);
        this.corGabinete = corGabinete;
        this.potenciaFonteEnergia = potenciaFonteEnergia;
    }

    public Desktop(int velocidadeProcessador, int quantidadeMemoria, String fabicanteProcessador) {
        super(velocidadeProcessador, quantidadeMemoria, fabicanteProcessador);
    }

    public String getCorGabinete() {
        return corGabinete;
    }

    public int getPotenciaFonteEnergia() {
        return potenciaFonteEnergia;
    }
    
       
    public String dizerInformacoesCompletas(){
        return "Sou um desktop. Meu processador " + super.getFabicanteProcessador() + 
                "trabalha a uma velocidade de " + super.getFabicanteProcessador() + ". Possuo " + super.getQuantidadeMemoria() + 
                " MB de memória. Meu gabinete é da cor " + this.corGabinete ;
    }
    
    
}
