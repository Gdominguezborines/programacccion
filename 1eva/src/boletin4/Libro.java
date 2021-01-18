/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin4;

/**
 *
 * @author cambes
 */
public class Libro {
    
    //Creamos las variables que son los atributos del libro
    
 private String titulo;
 private String autor;
 private int ano;
 private short numPaginas;
 private float valoracion;
 
 //Creo los constructores
 public Libro(){
                 
     }


      public Libro(String t, String Au, int A, Short Np, Float Va){      // constructor no por defecto 
        titulo = t;                                 //  parametrizado
        autor= Au;
        ano= A;
        numPaginas=Np;
        valoracion=Va;    
      
      }

      
      
      
 // metodos de acceso   getters  y setters
     
    
      // getter
    public String getTitulo(){
        return titulo;
    }
     
    public String getAutor(){
         return autor;
     }
           
    public int getAno(){
         return ano;
     }
        
    public short getNumPaginas(){
         return numPaginas;
     }
      
    public float getValoracion(){
         return valoracion;
     }
    
      //setter
    public void setTitulo(String t){
        
        titulo=t;
    }
    
    public void setValoracion(String Au ){
         autor=Au;
     }
  
    public void setAno(int A ){
         ano =A;
     }

    public void setNumPaginas(short Np ){
        numPaginas=Np;
     }
  
    public void setValoracion(Float Va ){
         valoracion=Va;
     }

    
    
    

  //metodos
        public void amosar (){
        System.out.println("Titulo = "+titulo+",Autor= "+autor+",ano= "+ano+",Numero de paginas= "+numPaginas+",valoracion= "+valoracion);
    }
    

        

}