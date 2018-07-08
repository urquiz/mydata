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
public class Zebra extends Animal{
    
    private int quantidadeDeListras;
    private double peso;

    public Zebra(int quantidadeDeListras, double peso, String nome) {
        super(nome);
        this.quantidadeDeListras = quantidadeDeListras;
        this.peso = peso;
    }

    public int getQuantidadeDeListras() {
        return quantidadeDeListras;
    }

    public void setQuantidadeDeListras(int quantidadeDeListras) {
        this.quantidadeDeListras = quantidadeDeListras;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public void dizerNomeEEspecie() {
        System.out.println("Meu nome é " + super.getNome() + " sou uma zebra.");
    }
    
    
    
}
