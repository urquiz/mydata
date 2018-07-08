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
public class Gerente extends Funcionario {

    @Override
    public double calcularPArticipacaoNosLucros() {
        return super.getSalario() * 0.5;
    }

}
