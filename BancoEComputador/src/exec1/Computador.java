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
public class Computador {
    
    private int velocidadeProcessador;
    private int quantidadeMemoria;
    private String fabicanteProcessador;

    public Computador(int velocidadeProcessador, int quantidadeMemoria, String fabicanteProcessador) {
        this.velocidadeProcessador = velocidadeProcessador;
        this.quantidadeMemoria = quantidadeMemoria;
        this.fabicanteProcessador = fabicanteProcessador;
    }

    public int getVelocidadeProcessador() {
        return velocidadeProcessador;
    }

    public int getQuantidadeMemoria() {
        return quantidadeMemoria;
    }

    public String getFabicanteProcessador() {
        return fabicanteProcessador;
    }
    
    public String dizerInformacoes(){
        return "Sou um computador. Meu processador " + this.fabicanteProcessador + 
                "trabalha a uma velocidade de " + velocidadeProcessador + ". Possuo " + quantidadeMemoria + 
                " MB de memória";
    }
    
}
