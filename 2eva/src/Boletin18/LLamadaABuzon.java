/**
* - Define a clase Buzon para xestionar un buzon de correo  electrónicos ordenados segundo a orde de chegada.
*
* Para representar o buzon de correo úsase un array de correos electrónicos; estes, á súa vez, son obxectos da clase Correo e teñen como 
*  atributos un String, co contido do correo, e un indicativo para saber se foron lidos ou non.
* Define a clase Correo cos métodos que creas convenientes, sabendo que a clase Buzon debe incluír os seguintes métodos públicos:
* a) int numeroDeCorreos(), que calcula cantos correos hai no buzon de correo
* b) void engade (Correo c), que engade c ao buzon
* c) boolean porLer(), que determina se quedan correos por ler
* d) String amosaPrimerNoLeido(), que amostra o primeiro correo non lido
* e) String amosa(int k), que amostra o correo k-ésimo, fora lido ou non
* f) void elimina(int k), que elimina o correo k-ésimo.
*
*/
package Boletin18;

import javax.swing.JOptionPane;

/**
 * @author cambes
 */
public class LLamadaABuzon {

    public static void main(String[] args) {
       int opcion = 0;
        
        do{
        int k =0;
        Correo obx = new Correo();
        
        opcion =Integer.parseInt(JOptionPane.showInputDialog(null, "1-->CantiodadCorreos \n 2-->Añadir\n 3-->Correos sin lerr\n 4-->Primer correo win leer\n 5-->Mostrar un correo determinado\n 6--> Eliminar un correo determinado"));
        
        switch(opcion){
            
            case 1:
                Buzon.numeroDeCorreos();
                     break;
            
            case 2:
                String contenido = JOptionPane.showInputDialog(null, "Por favor introduce un correo nuevo");
                String leido = JOptionPane.showInputDialog(null,"¿Quieres marcar el correo como leido?(si/no)");
                boolean v = false;
                if(leido.equals("si")) v=true;
                obx.setCorreoLeido(v);
                obx.setContenido(contenido);
                Buzon.añadir(obx);
                     break;
            
            case 3:
                Buzon.porLeer();
                     break;
            
            case 4: 
                JOptionPane.showMessageDialog(null, Buzon.mostrarElPrimerNoLeido());
                     break;
            
            case 5:
                k=Integer.parseInt(JOptionPane.showInputDialog("Posicion: "));
                k=k-1;
                Buzon.mostrar(k);
                    break;
            
            case 6:
                k=Integer.parseInt(JOptionPane.showInputDialog("Posicion: "));
                k=k-1;
                Buzon.eliminar(k);
                    break;
            
            case 7:
            default:System.exit(0); 
                   break;   
        }
        }while(opcion < 8 && opcion >= 1);
    }
    
}