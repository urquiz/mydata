/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lojaveiculos;

/**
 *
 * Ricardo Urquiz Brasil
 */
public class Main {

    /**
     * @param args the command line arguments
     */


    public static void main(String[] args)  {
       Carros carro1 = new Carros("Gol");
       Carros carro2 = new Carros("Uno");
       Carros carro3 = new Carros("Smart");
       carro1.setModelo("Gol");
       carro2.setModelo("Uno");
       carro3.setModelo("Smart");

       System.out.println(carro1.getModelo());
       System.out.println(carro1.abastecer());
       System.out.println(carro1.acelerar());
       System.out.println(carro1.TransportarPassageiros("cinco"));
       System.out.println(carro2.getModelo());
       System.out.println(carro2.abastecer());
       System.out.println(carro2.acelerar());
       System.out.println(carro2.TransportarPassageiros("cinco"));
       System.out.println(carro3.getModelo());
       System.out.println(carro3.abastecer());
       System.out.println(carro3.acelerar());
       System.out.println(carro3.TransportarPassageiros("duas"));
}
}
