/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exec2.exercicios.excecao.contas;

/**
 *
 * Ricardo Urquiz Brasil
 */
public class ContaBancaria {

    private double saldo;
    private double limite;

    public ContaBancaria(double saldo, double limite) {
        this.saldo = saldo;
        this.limite = limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }

    public double getSaldoComLimite() {
        return this.getSaldo() + this.getLimite();
    }

    public void sacar(double valor) throws ContaException {
        if(valor > this.saldo + this.limite){
            throw new ContaException("Saldo insuficiente!");
        }
        if(valor>=500){
            throw new ContaException("Valor de saque não permitido!");
        }
        this.saldo -= valor;
    }

    public void depositar(double valor) throws ContaException {
        if(valor>=1000){
            throw new ContaException("Valor de depósito não permitido!");
        }
        this.saldo += valor;
    }

}
