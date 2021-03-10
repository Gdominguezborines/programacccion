package Boletin16;
import javax.swing.JOptionPane;

/**
 * @author Cambes
 */


public class AlturaMedia {

    int [] personas = new int [10];

    public  void definirAltura(){

        int altura,alturaMedia,countMedia=0,countSuperior=0,countInferior=0,countPersonasDe170=0;

        for(int i=0;i<personas.length;i++){

            altura=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la altura de la persona número "+(i+1)+" en centímetros"));
            personas[i]=altura;
            if(personas[i]>170){
                countSuperior+=1;

            }if(personas[i]<170){
                countInferior+=1;

            }if(personas[i]==170){
                countPersonasDe170+=1;

            }
            countMedia+=personas[i];

        }
        JOptionPane.showMessageDialog(null,"personas que tienen una altura superior a la media= "+countSuperior);
        JOptionPane.showMessageDialog(null,"personas que tienen una altura inferior a la media= "+countInferior);
        JOptionPane.showMessageDialog(null,"personas que miden 170 cm = "+countPersonasDe170);

        alturaMedia=countMedia/personas.length;
        JOptionPane.showMessageDialog(null,"media = "+ alturaMedia);
       }
}
