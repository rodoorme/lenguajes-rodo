/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

/**
 *
 * @author usuario
 */
public class CalcularArea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Cuadrado cuadrado=new Cuadrado();
       cuadrado.setlado();
   cuadrado.Calular_Area();
    
      Triangulo escaleno=new Triangulo();
    escaleno.setAncho(6);
    escaleno.setLargo(7);
    escaleno.setAnchode(8);    
    escaleno.Calular_Area();
    }
    
}
