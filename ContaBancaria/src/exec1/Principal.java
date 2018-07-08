/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exec1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * Ricardo Urquiz Brasil
 */
public class Principal {

    public static void main(String[] args) {
        CaixaDeNumeros caixa = new CaixaDeNumeros();
        Scanner teclado = new Scanner(System.in);
        int numero = 0;
        try {
            do {
                System.out.println("Digite um número..: ");
                try {
                    numero = teclado.nextInt();
                    caixa.adicionarValor(numero);
                } catch (InputMismatchException e) {
                    System.out.println("Valor digitado não corresponte a um número");
                    teclado.next();
                    numero = -1;
                }
            } while (numero != 0);
            caixa.imprimirElementosEmTela();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Estouro do vetor!");
        }

    }

}
