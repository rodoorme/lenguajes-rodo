
package Areas;
public class Cuadrado  implements Superficies{
    private float lado;

    
    public Cuadrado(){
    
    }
    
    public Cuadrado(float lado){
        this.lado=lado;
    }
    
    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }
    
    public float CalcularArea(){
       System.out.print("el area del cuadrado es:");
       float area=lado*lado;
        return area;
    }
}
