
package ejlasesAbstractas;


public abstract class Poligono {
    
    private  float base;
    private float altura;
    
    
    public abstract  float calcularArea();

    public Poligono(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public float getBase() {
        return base;
    }

    public float getAltura() {
        return altura;
    }

   
    
    
    
    
}
