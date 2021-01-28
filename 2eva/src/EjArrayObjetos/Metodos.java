package EjArrayObjetos;

import javax.swing.JOptionPane;

/**
 * @author cambes
 */
public class Metodos {
    

    
    public Alumno[]creaArray(int tamaño){
       String nome,dni,dni2;
       int nota;
       boolean verdadero;
     Alumno []listaAlumnos =new Alumno[tamaño];
            for (int i=0; i<tamaño; i++){
                nome=pedirString();
                nota=pedirNOta();
                 
                do {dni2= pedirString2();                  
                    ValidadorDNI obx = new ValidadorDNI(dni2);
                    verdadero= obx.validar();
               
                } while (verdadero!=true);
                 
                
                listaAlumnos[i]=new Alumno(nome,nota,dni2);
                              
               }
            return listaAlumnos;
            } 
    
    
    public String pedirString(){
        return (JOptionPane.showInputDialog("nombre"));
    } 
    
    public String pedirString2(){
       return  (JOptionPane.showInputDialog("dni deve contener 8 digitos y una letra"));
    }    
 
    public int pedirNOta(){
        int nota;
        do {            
             nota= Integer.parseInt(JOptionPane.showInputDialog("Introduce una nota entre 0 y 10"));
        } while (nota<0 || nota >10);
       
    return nota;
    }
    
    public void amosar(Alumno[]lista){
            for(int i=0;i<lista.length;i++){
                System.out.println(" Alumno "+(i+1)+"--> "+lista[i]);
        }
            
     }    
  
    
}  
    
     

   
    
    
    
    

