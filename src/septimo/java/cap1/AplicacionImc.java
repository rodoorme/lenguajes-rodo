
package septimo.java.cap1;

/**
 *
 * @author T-107 rodoorme
 */
public class AplicacionImc {

    
    public static void main(String[] args) {
        Imc uno=new Imc();
       float result= uno.calcular(1.83f, 87);
        System.out.println("TU IMC ES\t"+result);
    }
    
}
