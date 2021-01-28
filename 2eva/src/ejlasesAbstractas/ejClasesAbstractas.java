 
package ejlasesAbstractas;

 
public class ejClasesAbstractas {
    
    
    public static void main(String[] args) {
        
        float ba=MisMetodos.lerFloatPositivo();
        float alt= MisMetodos.lerFloatPositivo();
        Triangulo tri = new  Triangulo(ba,alt);
        System.out.println("EL area del triangulo  es "+tri.calcularArea());
        
        /* no se puede instanciar un objeto de la clase abstracta 
        *Poligono obxplo = new Poligono(ba, alt); 
        */

        Poligono  obxPol;
        Poligono obxRec =new Rectangulo(ba, alt);
        System.out.println("El area del rectangulo = "+obxRec.calcularArea());
        
        
    }
        
    }
    
    
    
    

