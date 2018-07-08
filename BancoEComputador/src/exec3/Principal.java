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
public class Principal {
    
    public static void main(String[] args) {
        Animal zebra = new Zebra(343, 876.4, "Zuzu");
        Animal elefante = new Elefante(3.4, 6500, "Baloo");
        qualOSeuNome(zebra);
        qualOSeuNome(elefante);
    }
    
    private static void qualOSeuNome(Animal animal){
        animal.dizerNomeEEspecie();
    }
    
}
