/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumeraciones;

import static enumeraciones.EstadoDeMaquina.LINEA;

/**
 *
 * @author T-301 RODO
 */
public class PruebaEnumeraciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
      MaquinaBuena maquinita  =new MaquinaBuena();
      maquinita.setEstado(EstadoDeMaquina.ATASCADA);
       System.out.println("el estado de la maquina es:"+maquinita.getEstado());
    }
    
}
