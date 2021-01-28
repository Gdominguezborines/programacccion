 
package ejlasesAbstractas;
 
public class Rectangulo extends Poligono{

    public Rectangulo(float base, float altura) {
        super(base, altura);
    }
   
    
    public float calcularArea(){
      return (super.getBase()*super.getAltura());
    }
    
    public float calcularPerimetro(){
        return ((super.getBase()*2)*(super.getAltura()*2));
    }

    
}
