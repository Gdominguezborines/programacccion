/* BOLETIN 5

Implementa unha clase consumo, que forma parte da centralita electrónica
dun coche e ten as seguintes características :
Atributos :
km   kilómetros percorridos polo coche
litros  Litros de combustible consumidos
vMedvelocidade media
pGas  Prezo da gasolina
Metodos :
Dous constructores , un con parámetros e outro sen eles, que inicializan os  
valores dos atributos
getTempo  Indica o tempo empregado en realizar a viaxe
consumoMedio consumo medio do vehículo ( en litros cada 100 km )
consumoEuros consumo medio( en € cada 100 km )
setKms  modifica o valor dos km
setLitros “             “  “       “    litros                      
setvMed   “            “              vMed
 setPGas  “”             “             pGas.

Na clase principal :
a)	Crea un obxecto, de tipo consume, utilizando o constructor sen parámetros
b)	Dalle a litros o valor 50 e a prezo da gasolina 1.57
c)	Crea un obxecto, tipo consumo, utilizando o contructor con todos os parámetros
d)	Visualiza, a  través do 2º obxecto, o consumo medio
e)	Varia o valor dos litros consumidos do 2º obxecto.
f)	Visualiza a velocidade media do 2º obxecto
*/
package boletin5;

import java.util.Scanner;


public class Coche {


    public static void main(String[] args) {
     
        float consumoMedio2;
        float precioConsumoMedio2;
      
    //metodo para introducir datos
    Scanner sc =new Scanner(System.in);
    
     
    System.out.println("Escribe los km recorridos= ");
         float Km=sc.nextFloat();
     
    System.out.println("Escribe los litros consumidos = ");
         float Li=sc.nextFloat();
         
    System.out.println("Escribe la velocida media = ");
         float VMed=sc.nextFloat();
        
    System.out.println("Escribe el precio del carburante= ");
         float Gas=sc.nextFloat();
          
        //paso los datos prefijados
    Centralita coche1 =new Centralita(1000f,50f,110f,1.57f);
    
        System.out.println("EL coche 1 tuvo un consumo medio de " +coche1.getConsumoMedio()+" Litros/100km y el precio de 100km es de "+coche1.getPrecioConsumo()+" E");
        System.out.println("Estos son los datos de coche 1:");
        coche1.consumoMedio();
        coche1.precioConsumoMedio();

  //pido los datos con la funcion scaner
    Centralita coche2 =new Centralita(Km, Li, VMed, Gas);
     
        System.out.println("El coche 2 recorrio "+coche2.getKm()+"Km con un consumo medio de "+ coche2.getConsumoMedio()+ "l/100km y el precio medio de los 100km es de "+coche2.getPrecioConsumo()+"E y una velocidad media de "+coche2.getVelocicadeMedia()+"Km/h y tardo "+coche2.getTiempo()+"H");
     
    Centralita coche3 =new Centralita();
               System.out.println("El coche 3 recorrio "+coche3.getKm()+"Km con un consumo medio de "+ coche3.getConsumoMedio()+ " l/100km y el precio medio de los 100km es de "+coche3.getPrecioConsumo()+" E y una velocidad media de "+coche3.getVelocicadeMedia()+"Km/h");
    }
    
}
