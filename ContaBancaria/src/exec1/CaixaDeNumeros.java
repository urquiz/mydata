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
public class CaixaDeNumeros {
    
    private int[] numeros = new int[10];
    private int posicao = -1;
    
    public void adicionarValor(int num){
        this.numeros[++posicao] = num;
    }
    
    public void imprimirElementosEmTela(){
        for (int i = 0; i <= posicao; i++) {
            System.out.print(this.numeros[i] + " ,");
        }
    }
    
}
