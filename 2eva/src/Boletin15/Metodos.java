

package Boletin15;


import javax.swing.JOptionPane;

/**
 *
 * @author Cambes
 */
public class Metodos {
    
    public void amosarArray(int[]lista){
        
        int[]numeros=new int[6];
        int x=0,aux;
        for(int i=0;i<numeros.length;i++){
            
            x=(int)(Math.random()*(50-1)+1);
            numeros[i]=x;
            
        }
        for(int i=0;i<numeros.length-1;i++){
            
            for(int j=0;j<numeros.length-1;j++){
                
                if(numeros[j]<numeros[j+1]){
                    
                    aux=numeros[j+1];
                    numeros[j+1]=numeros[j];
                    numeros[j]=aux;
                }
            }
            
        }
        for(int i=0;i<numeros.length;i++){
            System.out.println("Aleatorio= "+numeros[i]);
        }
        
        
        
        
        
        
    }
    public void notasArray(){
        
        int[]notas=new int[30];
        
        int x=0;
        for(int i=0;i<notas.length;i++){
            
            x=(int)(Math.random()*(10-1)+1);
            notas[i]=x;
            
           
            
        }
        
        int countAprobado=0;
        int countSuspenso=0;
        int countMedia=0;
        for(int i=0;i<notas.length;i++){
            if(notas[i]>5){
                
                countAprobado+=1;
                
            }else{
                countSuspenso+=1;
            }
            countMedia+=notas[i];
            
            
                
        }
        System.out.println("aprodos: "+countAprobado);
        System.out.println("suspensos: "+countSuspenso);
        int media;
        media=countMedia/notas.length;
        System.out.println("media= "+media);
        int aux;
        for(int i=0;i<notas.length-1;i++){
            
            for(int j=0;j<notas.length-1;j++){
                
                if(notas[j]<notas[j+1]){
                    
                    aux=notas[j+1];
                    notas[j+1]=notas[j];
                    notas[j]=aux;
                }
            }
            
        }
        System.out.println("Nota mas alta = "+notas[0]);
       
    }
     public void nomeArray(){
        
        Alumno[]Alumnos=new Alumno[5];
         Alumnos[0] = new Alumno("pepe" , 4 ,  53127566);
        Alumnos[1] = new Alumno("susana", 5 ,  43732425);
        Alumnos[2] = new Alumno("noel" , 7 ,   53192684);
        Alumnos[3] = new Alumno("maria" ,  10, 53568548);
        Alumnos[4] = new Alumno("juan" ,1 ,    53156539);
        


        
        int countAprobado=0;
        int countSuspenso=0;
        int countMedia=0;
        for(Alumno ele:Alumnos){
            if(ele.getNota()>=5){
                
                countAprobado+=1;
                
            }else{
                countSuspenso+=1;
            }
            countMedia+=ele.getNota();
            
            
                
        }
        System.out.println("aprodos: "+countAprobado);
        System.out.println("suspensos: "+countSuspenso);
        int media;
        media=countMedia/Alumnos.length;
        System.out.println("media= "+media);
        int aux;
        String auxnm;
        for(int i=0;i<Alumnos.length-1;i++){
            
            for(int j=0;j<Alumnos.length-1;j++){
                
                if(Alumnos[j].nota<Alumnos[j+1].nota){
                    
                    aux=Alumnos[j+1].nota;
                    auxnm=Alumnos[j+1].nombre;
                    Alumnos[j+1].nota=Alumnos[j].nota;
                    Alumnos[j+1].nombre=Alumnos[j].nombre;
                    Alumnos[j].nota=aux;
                    Alumnos[j].nombre=auxnm;
                }
            }
            
        }
        System.out.println("Nota mas alta = "+Alumnos[0].nota);
        
         System.out.println("nota del alumno de la posicion 1: "+Alumnos[0].nota);
     
        System.out.println("Lista de aprobados:");
       for(Alumno ele:Alumnos){
           
           if(ele.nota>=5){
               System.out.println(ele.nombre);
           }
           
       }

       Alumno aux1;
         for(int i=0; i<Alumnos.length-1;i++){
             for (int j=i+1;j<Alumnos.length;j++){
                 if(Alumnos[i].getNota()>Alumnos[j].getNota()){
                     aux1=Alumnos[i];
                     Alumnos[i]=Alumnos[j];
                     Alumnos[j]=aux1;
                     
                 }
             }
         }
         System.out.println("*** lista ordenada****");
         
         String nombre=JOptionPane.showInputDialog("teclea el nombre del alumno que buscas:");
        
        boolean atopado = false;
       
       for(Alumno ele:Alumnos){
           
           if(nombre.equals(ele.getNombre())){
               System.out.println("El alumno es: "+ele.nombre+" y su nota es:"+ele.nota+"su dni es: "+ele.dni);
               atopado = true;
           }
           
       }
       if(atopado == false)
           System.out.println("non esta na lista");

       
       
    }
     
    

}
