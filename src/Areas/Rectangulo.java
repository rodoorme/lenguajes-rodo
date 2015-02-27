
package Areas;

import figuras.*;


public class Rectangulo  implements Superficies {
    

private float ancho;
 private float largo;
 private String figura;
 
 public void setAncho(float ancho){
     this.ancho=ancho; 
 }
 public void setLargo(float largo){
     this.largo=largo;    
 }
    public float getAncho(){
    return ancho;
    }
    public float getLargo(){
    return largo;
    }
    
    public void  setFigura(String figura){
        this.figura=figura;
    
    }

    public Rectangulo(float ancho, float largo) {
        this.ancho = ancho;
        this.largo = largo;
    }
    public String getFigura(){
    return figura;
    }
  

   
    public float CalcularArea() {
        float area=largo*ancho;
System.out.print("El area del rectangulo es : " );
    return area;
    }
}