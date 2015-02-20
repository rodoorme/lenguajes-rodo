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
public class Cuadrado {
    

 private float lado;
  public void setLargo(float lado) throws NumeroNoNegativoException{
     ValidarValorNoNegativo.validar(lado);
     this.lado=lado;    
 }
    
    public float getLargo(){
    return lado;
    }     public float Calular_Area(){
float area=lado*lado;
System.out.println("El area de la figura es : " + area);

     return area;
 


}

    void setlado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}