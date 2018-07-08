/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplos.patterns.abstractfactory.exercicio;

/**
 *
 * Ricardo Urquiz Brasil
 */
public class PizzaioloItaliano implements Pizzaiolo{

    @Override
    public Pizza montarPizza() {
        return new PizzaCalabreza();
    }
    
}
