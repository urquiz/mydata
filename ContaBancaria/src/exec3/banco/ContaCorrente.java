/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exec3.banco;

/**
 *
 * Ricardo Urquiz Brasil
 */
public final class ContaCorrente extends ContaBancaria {

    private boolean contaEspecial;

    public ContaCorrente(double saldo, double limite) {
        super(saldo, limite);
    }

    public void mudarParaEspecial() {
        this.contaEspecial = true;
    }

    public void mudarParaNormal() {
        this.contaEspecial = false;
    }

    public String dizerTipoDeConta() {
        return (this.contaEspecial ? "Especial" : "Normal");
    }

    public void sacar(double valor) throws ContaException {
        super.sacar(valor);
    }

    public void depositar(double valor) throws ContaException {
        super.depositar(valor);
    }
}
