/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoFinal;
import java.io.*;
/**
 *
 * @author T-107
 */
public class PersistenciaUsuario {
    public void guardar(Usuario  u)throws Exception{
    
    File file = new File ("D:\\archivaldo.yo");
    //paso 2 sacar y escribir en el
    FileOutputStream fos = new FileOutputStream(file);
    // paso3 llenado
    ObjectOutputStream oos=new ObjectOutputStream(fos);
    oos.writeObject(u);
    oos.close();
    
    }
    public Usuario  leer()throws Exception{
    
    File file = new File ("D:\\archivaldo.yo");
    FileInputStream fis=new FileInputStream(file);
    ObjectInputStream ois= new ObjectInputStream(fis);
    Usuario u=new Usuario();
    u = (Usuario)ois.readObject();
   return u;
    } 
}
