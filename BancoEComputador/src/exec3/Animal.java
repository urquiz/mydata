/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exec3;

/**
 *
 * Ricardo Urquiz Brasil
 */
public abstract class Animal {
    
    private String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    
    public abstract void dizerNomeEEspecie();
    
}
