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
public class Principal {

    public static void main(String[] args) {
        ContaBancaria conta = new ContaCorrente(1000, 500);
        try {
            conta.depositar(700);
            conta.sacar(350);
            System.out.println("SALDO = "+ conta.getSaldoComLimite());
            conta.depositar(1001);
        } catch (ContaException ex) {
            System.out.println("Erro: " + ex.getMessage());
            System.out.println("\tSALDO = "+ conta.getSaldo());
            System.out.println("\tLIMITE = "+ conta.getLimite());
        }

    }

}
