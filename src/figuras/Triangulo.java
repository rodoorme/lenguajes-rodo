
package figuras;


public class Triangulo {
 
 private float base;
 private float largo;
 private float anchode;   
    public void setAncho(float ancho){
     this.base=base; 
 }
 public void setLargo(float largo){
     this.largo=largo;    
    
}
 public void setAnchode(float anchode){
     this.base=base; 
 }
 public float  getBase(){
    return base;
    }
    public float getLargo(){
    return largo;
    }
    public float getAnchode(){
    return anchode;
    }
    
    public void Calular_Area(){
float area=(largo*base*anchode)/2;
System.out.println("El area de la figura es : " + area);

 
} 
}
