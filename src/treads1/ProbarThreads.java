
package treads1;

/*
  * @author rodo
 */
public class ProbarThreads {

    
    public static void main(String[] args) {
       System.out.println("probar threads");
        Facil t1=new Facil();
          Facil t11=new Facil();
        Regular r1=new Regular();
        Thread t2=new Thread(r1);
       
        Thread t3 = new Thread(
                new  Runnable(){
                    
                    @Override
                    public void run() {
                        System.out.println("soy un Thread dificil");
                    }
                    
                    
                    
                });
        
                
    t1.setName("petra");
     t1.start(); 
      t11.start();   
     t2.start();
     t3.start();
    }
    }
    

