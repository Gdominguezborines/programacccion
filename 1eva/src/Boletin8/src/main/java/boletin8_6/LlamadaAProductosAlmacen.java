/**
* - Un almacen clasifica os seus productos según a seguinte táboa  de vendas anuais :
* Vendas anuais			artigo de consumo 
* < = 100 productos			baixo
* >100 e < = 500				medio
* > 500 e < = 1000			alto
* > 1000 					primeira necesidade
*  Coñecido o nome do artigo e as vendas anuais . Indicar de que tipo é
 */

package boletin8_6;

import javax.swing.JOptionPane;

/**
 *
 * @author cambes
 */
public class LlamadaAProductosAlmacen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   

        String Articulo=JOptionPane.showInputDialog("Escribe el nombre del articulo ");
        float Ventas=Float.parseFloat(JOptionPane.showInputDialog("Introduce el total de ventas"));
    
         ProductosAlmacen obxComprado =new ProductosAlmacen();
         
         obxComprado.SegunVentas(Articulo, Ventas);
    
       
    }
    
}
