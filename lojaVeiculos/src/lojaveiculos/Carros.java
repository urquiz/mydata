/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lojaveiculos;

/**
 *
 * Ricardo Urquiz Brasil
 */
public class Carros implements Carros2{

  private String modelo;
  

  public Carros(String modelo)
                {
      modelo=this.modelo;
    }

  
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String abastecer() {
          return "Abastecendo...";
  }


    public String acelerar() {
         return "Acelerando...";

    }

    public String TransportarPassageiros(String quantidadePessoas) {
        if (quantidadePessoas=="duas")
        {
            return "Transportando duas pessoas";
        }else{
            return "Transportando cinco pessoas";
        }
    }

    @Override
    public String toString() {
        return "Carros{" + "modelo=" + modelo + '}';
    }




}
