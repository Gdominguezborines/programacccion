/**
* 4- Codifica un programa que solicite  un número e, 
* visualice a táboa de multiplicar dese número. O
* programa rematara cando prememos o cero.
*/
package Boletin9_4;

import javax.swing.JOptionPane;

/**
 *
 * @author cambes
 */
public class CalculosMultiplicar {
    
    //variable que recibe el numero para luego comprovar con tabla
    private int num;
    private String total;
    
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    
   // Metodo para devolver el numero ingresado 
    
    public int pedirNum(){
        num=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce un numero de la tabla de multiplicar que quieres ver, si queres salir del programa escribe 0"));
       return num;
    }
    
 //Metodo para ver la tabla de multiplicar y si pone 0 se cierra   
    
    public void tablaMultiplicar( ){
        do{num=pedirNum();
            if(num==0){
                JOptionPane.showMessageDialog(null,"As finalizado el programa de tabla de multiplicar");
                break;
            }
        
        for(int i=1;i<=10; i++){
            System.out.println(" ");
            System.out.println(num+"x"+i+"="+num*i );
            
             total =(num+"x"+i+"="+num*i );
        }
     
        
        }
        while(num !=0);
    }
}
