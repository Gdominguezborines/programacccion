/**
 * Realiza un programa para levar o mantemento dunha librería. Para iso :
1.	Realiza un diagrama de clases que reflicta as relación entre as clases  e logo implementa o programa tendo en conta :
Cada libro de levar : título , autor , ISBN (String ) , prezo , e  numero de unidades.
O programa debe :
•	engadir libros
•	vender ( borrar ) libros 
o	amosar  os libros que temos  ( Os libros deben estar ordenados polo campo titulo )
•	dar de baixa os libros con numero de unidades =0
•	consultar un libro determinado
Nos métodos vender, amosar, baixas e consultar debes comprobar que o array recibido non é null. No caso contrario lanza una excepción.
Para a clase aplicación utiliza un paquete e para as demais outro paquete.
Na aplicación do programa utiliza un menú con todas as opción .

 */
package Boletin17.boletin17;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import Boletin17.boletin17.com.gabriel.*;
/**
 * @author cambes
 */
public class Aplicaccion {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        try{
            
        
            ArrayList <Libro> lista= new ArrayList();
            String opcion;
          do{
             opcion =  JOptionPane.showInputDialog(" *** MENU ***\n 1-->ENGADIR\n 2-->AMOSAR\n 3-->CONSULTA\n 4-->ELIMINAR\n 5-->ORDENAR\n Cualquier otra tecla-->SAIR");
               switch(opcion){
                case "1":Metodos.engadirLibro(lista);
                      break;
                case "2":Metodos.amosar(lista);
                      break;
                case "3":Metodos.consultarLibros(lista); 
                      break;
                case "4":Metodos.eliminarLibro(lista);
                      break;
                case "5":Metodos.ordenarAmosar(lista);
                      break;
                default:System.exit(0); 
                      break;
                }
            
            }while(! opcion.equalsIgnoreCase("6"));
        
        } catch(NullPointerException ex){
          
            System.out.println("Ha sucedido un error: "+ex.getMessage());
          
          }  
    }
}
    
