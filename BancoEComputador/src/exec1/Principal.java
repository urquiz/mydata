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
public class Principal {
    
    public static void main(String[] args) {
        Computador comp = new Computador(3400, 2048, "Intel");
        Notebook note = new Notebook(2, true, 3200, 2048, "AMD");
        Desktop desk = new Desktop( "Preto", 4000, 3200, 2048, "AMD");
        System.out.println(comp.dizerInformacoes());
        System.out.println(note.dizerInformacoesCompletas());
        System.out.println(desk.dizerInformacoesCompletas());
    }
    
}
