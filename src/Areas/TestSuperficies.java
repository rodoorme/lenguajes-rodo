/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Areas;


public class TestSuperficies {
    

public static void main(String arg[])throws Exception {
for(Superficies s:GeneralSuperficie.ObtenerFiguras() ){
System.out.println(s.CalcularArea());

}

}
}