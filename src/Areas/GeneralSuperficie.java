/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Areas;
 import java.util.*;

public class GeneralSuperficie {
    public  static ArrayList<Superficies>  ObtenerFiguras ()throws Exception {
    
    ArrayList<Superficies>figuras=new ArrayList<Superficies>();
    Cuadrado cu1=new Cuadrado(12);
            Cuadrado cu2=new Cuadrado(13);
            Cuadrado cu3=new Cuadrado(14);
            Rectangulo r1=new Rectangulo(12,13);
             Triangulo t1=new Triangulo(11,11);
            Triangulo t2=new Triangulo(11,16);
            Circulo ci1=new Circulo(12);
            Circulo ci2=new Circulo(12);
            figuras.add(cu1);
            figuras.add(cu2);
            figuras.add(cu3);
            figuras.add(r1);
            figuras.add(t1);
            figuras.add(t2);
             figuras.add(ci1);
             figuras.add(ci2);
             return figuras;
            
    }
}
