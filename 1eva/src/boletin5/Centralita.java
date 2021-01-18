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



public class Centralita {
     //Creamos las variables que son los atributos de la centralita
    
    private float km;
    private float litros;
    private float VMed;
    private float PGas;
    private float consumoMedio;
    private float precioConsumoMedio;
    private float CM=0;
    private float PC=0;
    
    //Creo los constructores
 public Centralita(){
                 
     }
       
    public Centralita(Float k, float Li, Float VM, float PG){      // constructor no por defecto 
        km= k;                                 //  parametrizado
        litros=Li;
        VMed= VM;
        PGas=PG;
             
      }
           
      // getter
    public float getKm(){
        return km;
    }
    
    public float getConsumoMedio(){
              CM=consumoMedio= (litros*100)/km;
        return CM;
    }
    
    public float getPrecioConsumo(){
        PC=consumoMedio*PGas;
        return PC;
    }
    
    public float getVelocicadeMedia(){
        return VMed;
    }
    
    public float getTiempo(){
        float tiempo =km/VMed;
        return tiempo;
    }
    
    
    public Float getLitros(){
        return litros;
    }
    
    public float getVMed(){
        
        return VMed;
    }
    
    public float getPGas(){
        return PGas;
    }
    
    
      //setter
    public void setKm(float k){
        km=k;
    }
    
    public void setitros(float Li){
        litros=Li;
    }
    
    public void setVmed(float VM){
        VMed=VM;
        
    }
    
    public  void setPGas(float PG){
        PGas=PG;
    }
    
    
    // metodo consumoMedio
     public void consumoMedio (){
        
         consumoMedio= (litros*100)/km;
         
         System.out.println("El consumo medio es de= "+consumoMedio+" Litros a los 100km");
    }
    
      // metodo precioConsumoMedio
     public void precioConsumoMedio (){
        
         precioConsumoMedio=consumoMedio*PGas ;
         
         System.out.println("El  precio del consumo medio es de= "+precioConsumoMedio+" E");
    }
    
    
    
}
