/**
 * 2- Realiza un programa que calcule a suma e o producto dos 
 * números comprendidos entre 10 e 90 .
 */

package Boletin9_2;

/**
 *
 * @author cambes
 */
public class Calculadora {
    
    // variable para la suma 
    private int suma=0;
    //variable para el producto
    private double produto=1;
    
    
    // metodo con bucle for que muestra los numeros enteros desde el 10 asta el 90
    
    public void SumaDelProducto(){
    for (int i=10; i <= 90; i++){
      
        suma=suma+i;
        produto=produto*i;
      }
        System.out.println("La suma es= "+suma);
        System.out.println("El producto es= "+produto);
    }  
    
    
}
