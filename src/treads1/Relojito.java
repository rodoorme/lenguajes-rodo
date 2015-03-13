/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treads1;

/**
 *
 * @author T-301
 */
import java.util.*;

public class Relojito extends Thread {
    
    public void run(){
        try{
                Thread.sleep(1000);

        
        Calendar cal= Calendar.getInstance();
       int hora=cal.get(Calendar.HOUR_OF_DAY);
       int minuto=cal.get(Calendar.MINUTE);
       int segundo=cal.get(Calendar.SECOND);
       System.out.println("La hora es:"+hora+":"+minuto+":"+segundo);
        }catch(InterruptedException e){}
    }
    
}
