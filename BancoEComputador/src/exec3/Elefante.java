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
public class Elefante extends Animal{
    
    private double tamanhoDaTromba;
    private double peso;

    public Elefante(double tamanhoDaTromba, double peso, String nome) {
        super(nome);
        this.tamanhoDaTromba = tamanhoDaTromba;
        this.peso = peso;
    }

    public double getTamanhoDaTromba() {
        return tamanhoDaTromba;
    }

    public void setTamanhoDaTromba(double tamanhoDaTromba) {
        this.tamanhoDaTromba = tamanhoDaTromba;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public void dizerNomeEEspecie() {
        System.out.println("Meu nome é " + super.getNome() + " sou um elefante");
    }
    
    
    
}
