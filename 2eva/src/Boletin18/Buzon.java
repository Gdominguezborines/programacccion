 
package Boletin18;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 * @author cambes
 */
public class Buzon {
    
    static ArrayList <Correo> Correos = new ArrayList();
    
    public static int numeroDeCorreos(){
        
        JOptionPane.showMessageDialog(null, "Tienes "+Correos.size()+" correos");
        return Correos.size();
    }
    
    public static void añadir(Correo c){
        Correos.add(c);
    }
    
    public static boolean porLeer(){
        
        Iterator it=Correos.iterator();
        int correoSinLeer = 0;
        Correo correo = null;
        while(it.hasNext()){
            correo=(Correo) it.next();
            if(correo.getCorreoLeido()== false){
            correoSinLeer++;
            }
        }
        JOptionPane.showMessageDialog(null,"Hay "+correoSinLeer+" correos sin leer");
        if(correoSinLeer != 0){
            return false;
    
        }else
            return true;
        
    }
    
    public static String mostrarElPrimerNoLeido(){
        ArrayList <Correo> correosNoLeidos= new ArrayList();
        
        Iterator it = Correos.iterator();
        Correo correo = null;
        while(it.hasNext()){
            correo= (Correo) it.next();
            if(correo.getCorreoLeido()==false){
                correosNoLeidos.add(correo);
            }
        }
        return correosNoLeidos.get(0).getContenido();
        
    }
    
    public static void eliminar(int k){
        Correos.remove(k);
        
    }

    static void mostrar(int k) {
        JOptionPane.showMessageDialog(null, "El contenido de tu correo es: "+Correos.get(k).getContenido());
    }

    
}
    