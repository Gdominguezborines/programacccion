/*
  Implementa unha aplicación que nos permita traballar con circulos e 
circunferencias .Para eso crea a clase Circulo cas seguintes características :

atributos : radio ( tipo double )
Pi ( constante de tipo double e valor 3.14 )

métodos : *   constructores, sen e con parámetros
*  métodos de acceso
*   calcularArea : Non recibe nada e devolve o valor da 
        área . Para calcular radio ^ 2 utiliza a clase Math e o método pow (….)
*  calcularLonxitude : Non recibe nada e devolve o valor 
        da lonxitude da circunferencias

 */

import java.util.Scanner;

/**
 * @author cambes
 */

package boletin6.3;
public class Circunferencia {

    private double radio;
    private final double pi = 3.1416;

    public Circunferencia() {
    }

    public Circunferencia(double R) {
        radio = R;
    }
    // Creamos métodos de acceso setter y getter 

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    // Creamos los diferentes métodos
    public double calcularArea() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la medida el radio del circulo en cms");
        radio = sc.nextDouble();
        double area = Math.pow(radio, 2) * pi;
        System.out.println("El área del círculo es de " + area + " cms2");
        System.out.println("  ");
        calcularLonxitude();
        return area;
     
    }

    public double calcularLonxitude() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la medida del radio del circulo en cms");
        radio = sc.nextDouble();
        double longitud = 2 * pi * radio;
        System.out.println("La longitud del circulo es de " + longitud + " cms2");
        return longitud;
    }
}

  