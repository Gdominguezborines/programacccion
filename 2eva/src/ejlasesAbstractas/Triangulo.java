
package ejlasesAbstractas;

public class Triangulo extends Poligono{

  
    
    public Triangulo(float base, float altura) {
        super(base, altura);
    }

     
    
    public float calcularArea(){
        
        return (super.getBase()*super.getAltura()/2);
    }

  
    
    
    
}
