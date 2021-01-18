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
public class ProductosAlmacen {
    
 
   //Metodo que dice si es mucho o poco en funcion de las ventas
    
    public void SegunVentas(String Articulo , float Ventas){
      
        
        if(Ventas>0 && Ventas<=100)
            JOptionPane.showMessageDialog(null,"El producto "+Articulo+" tiene una venta baja");
         
        else if(Ventas<=500)
            JOptionPane.showMessageDialog(null,"El producto "+Articulo+" tiene una venta media");
        
         else if(Ventas<=1000)
            JOptionPane.showMessageDialog(null,"El producto "+Articulo+" tiene una venta alta");
        
         else 
            JOptionPane.showMessageDialog(null,"El producto "+Articulo+" es de primera necesidad");
        
        
        
        
        
        
        
    }
    
    
}
