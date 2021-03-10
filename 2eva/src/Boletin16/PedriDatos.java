package Boletin16;
import javax.swing.JOptionPane;

/**
 * @author Cambes
 */


public class PedriDatos {
    int [] arrayNumeros = new int [10];

    public void crearArray(){

        String dato;
        int numero;

        for(int i=0;i<arrayNumeros.length;i++){

            dato= JOptionPane.showInputDialog("Ingrese numero "+(i+1));
            numero=Integer.parseInt(dato);
            arrayNumeros[i]=numero;

            if( numero %2 ==0 ){
                System.out.println("Numero par: "+arrayNumeros[i]);
            }if(numero < 0){

                System.out.println("Numero negativo: "+arrayNumeros[i]);
            }if(numero %2!=0){
                System.out.println("Numero impar: "+arrayNumeros[i]);
            }

        }
    }

}
