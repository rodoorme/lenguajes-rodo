/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package septimo.java.cap1;

/**
 *
 * @author T-107
 */
public class Imc {
 private   float estatura;
    private  float peso;
    public void setPeso(float peso ){
    this.peso=peso;
    }
    public void setEstatura(float estatura ){
    this.estatura=estatura;
    }
    public float calcular( ){
    
   return  peso/(estatura*estatura);
  
    
    
    }
}
