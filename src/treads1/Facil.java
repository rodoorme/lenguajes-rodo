
package treads1;

/**
 *
 * @author T-301
 */
public class Facil extends Thread {
    
    public void run(){
        try{
            Thread.sleep(3000);
    System.out.println("soy un therads facil");
    String nombre=Thread.currentThread().getName();
  
   System.out.println("soy un therads facil me llamo"+nombre);
   
    }catch(InterruptedException e){}
    
    }
    }
    
    
    
