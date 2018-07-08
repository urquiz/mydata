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
public class Notebook extends Computador {

    private int qtdAutoFalantes;
    private boolean possuiTouchPad;

    public Notebook(int velocidadeProcessador, int quantidadeMemoria, String fabicanteProcessador) {
        super(velocidadeProcessador, quantidadeMemoria, fabicanteProcessador);
    }

    public Notebook(int qtdAutoFalantes, boolean possuiTouchPad, int velocidadeProcessador, int quantidadeMemoria, String fabicanteProcessador) {
        super(velocidadeProcessador, quantidadeMemoria, fabicanteProcessador);
        this.qtdAutoFalantes = qtdAutoFalantes;
        this.possuiTouchPad = possuiTouchPad;
    }

    public int getQtdAutoFalantes() {
        return qtdAutoFalantes;
    }

    public boolean isPossuiTouchPad() {
        return possuiTouchPad;
    }

    public String dizerInformacoesCompletas() {
        return "Sou um notebook. Meu processador " + super.getFabicanteProcessador()
                + "trabalha a uma velocidade de " + super.getFabicanteProcessador() + ". Possuo " + super.getQuantidadeMemoria()
                + " MB de memória. Tenho um total de " + this.qtdAutoFalantes + " autofalantes.";
    }

}
