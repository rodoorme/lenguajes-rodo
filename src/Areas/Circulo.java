/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Areas;


public class Circulo implements Superficies  {

    public float getRadio() {
        return radio;
    }

    public Circulo(float radio) {
        this.radio = radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }
    
private float radio;

public float CalcularArea(){

 float areas=  3.1416f*(radio*radio);
return areas;
}
}
