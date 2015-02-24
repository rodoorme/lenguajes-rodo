
package Areas;

import figuras.*;


public class Triangulo  implements Superficies {
 
 private float base;
 private float largo;

    Triangulo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
    public void setAncho(float ancho){
     this.base=base; 
 }
 public void setLargo(float largo){
     this.largo=largo;    
    
}

    public Triangulo(float base, float largo) {
        this.base = base;
        this.largo = largo;
    }
 
 public float  getBase(){
    return base;
    }
    public float getLargo(){
    return largo;
    }
    
    

    public float CalcularArea() {
       float are=largo*base/2;
        return are; 
    }

    void CalularArea() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
