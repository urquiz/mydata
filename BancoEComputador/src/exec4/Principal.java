/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exec4;

/**
 *
 * Ricardo Urquiz Brasil
 */
public class Principal {
    
    public static void main(String[] args) {
        Funcionario carlos = new Gerente();
        carlos.setSalario(10000);
        Funcionario amanda = new Secretaria();
        amanda.setSalario(5000);
        System.out.println("Carlos = " + carlos.calcularPArticipacaoNosLucros());
        System.out.println("Amanda = " + amanda.calcularPArticipacaoNosLucros());
    }
    
}
