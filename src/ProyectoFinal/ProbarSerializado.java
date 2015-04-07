/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoFinal;

/**
 *
 * @author T-107
 */
public class ProbarSerializado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Usuario u=new Usuario();
        u.setEmail("rapido@hotmail.com");
        u.setNombre("juan carlos");
        u.setSueldo(30000);
        PersistenciaUsuario pre= new PersistenciaUsuario();
        try{
            pre.guardar(u);
            System.out.println("usuario guardado ");
                    }catch (Exception ex){
                    System.out.println(ex.getMessage());
                    
                    }
    }
    
}
