 
package Boletin17.boletin17.com.gabriel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import javax.swing.JOptionPane;
/**
 * @author cambes
 */
public class Metodos {
    
    public static void engadirLibro(ArrayList<Libro> listaLibros)throws NullPointerException{
        
        Libro ele = pedirLibro("Libro a engadir :");
            if((ele.getTitulo().isEmpty()||ele.getTitulo()==null) || (ele.getAutor().isEmpty()||ele.getAutor()==null)||(ele.getISBN().isEmpty()||ele.getISBN()==null) || ele.getPrezo()<0 ||ele.getNunidades()<0 ){
           
                throw new NullPointerException(" El valor de alguno de los campos es null o no es valido");
            }else{
               listaLibros.add(ele);
            }            
    }

    public static Libro pedirLibro(String mensaxe)throws NullPointerException{
        String titulo=JOptionPane.showInputDialog(" titulo :");
        String autor =JOptionPane.showInputDialog(" autor :");
        String ISBN =JOptionPane.showInputDialog(" ISBN :");
        float prezo = Float.parseFloat(JOptionPane.showInputDialog(" prezo :"));
        int Nunidades = Integer.parseInt(JOptionPane.showInputDialog(" Nunidades :"));
        Libro libro = new Libro(titulo,autor,ISBN,prezo,Nunidades);
        
        return libro;
    }
    
    public static void eliminarLibro(ArrayList<Libro> listaLibros)throws NullPointerException{
         boolean atopado=false;
         String titulo=JOptionPane.showInputDialog("titulo");
         Iterator it=listaLibros.iterator();
             while(it.hasNext()){
                Libro libro=(Libro) it.next();
                    if(libro.getTitulo().equalsIgnoreCase(titulo)){
                    it.remove();
                     atopado=true;
                    }
             }
         if(atopado==false){
             System.out.println("non está na lista");
         } 
    }
    
   
         public static void consultarLibros(ArrayList<Libro> listaLibros)throws NullPointerException{
         boolean atopado=false;
        String titulo=JOptionPane.showInputDialog(" titulo :");
        
        for(int i=0;i<listaLibros.size();i++){
            if(titulo.equalsIgnoreCase(listaLibros.get(i).getTitulo())){
              System.out.println( "titulo: "+listaLibros.get(i).getTitulo()+"\n autor: "+listaLibros.get(i).getAutor()+"\n ISBN: "+listaLibros.get(i).getISBN()+"\n prezo: "+listaLibros.get(i).getPrezo()+"\n Nunidades: "+listaLibros.get(i).getNunidades());
              atopado=true;
            }
        }
            if(!atopado){
               System.out.println(" o libro non esta na lista");
            }
       }
         
         
         public static void amosar(ArrayList<Libro> listaLibros)throws NullPointerException{
            for(int i=0;i<listaLibros.size();i++){
              System.out.println("titulo: "+listaLibros.get(i).getTitulo()+"\n autor: "+listaLibros.get(i).getAutor()+"\n ISBN: "+listaLibros.get(i).getISBN()+"\n prezo: "+listaLibros.get(i).getPrezo()+"\n Nunidades: "+listaLibros.get(i).getNunidades()+"\n ********************");
            }
        }
         
         public static void ordenarAmosar(ArrayList<Libro> listaLibros)throws NullPointerException{
             
            Collections.sort(listaLibros);
         }  
}