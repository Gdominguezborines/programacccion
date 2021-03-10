/**
 *
 * 1-	Programa java que garda nun array 10 números enteiros que se len por teclado.
 *       A continuación percórrese o array e calcula cantos números son pares ( num %2 ==0 ), e cantos son  negativos .
 * 2-	Programa Java para leer la altura de N personas y calcular la altura media. Calcular cuántas personas tienen
 * una altura superior a la media y cuántas tienen una altura inferior a la media. El valor de N se pide por teclado
 * y debe ser entero positivo.
 * 3-	Divide a cadea de texto “ www. javadesde0. com” en dous partes “ www. java” e “desde0. com”.
 * Para posteriormente concaténalas e mostralas de novo.
 * 4-	Transforma a cadea de texto “ javeros” a maiúsculas. Garda o valor na variable e posteriormente convértea novamente a minúsculas.
 */
package Boletin16;

/**
 * @author Cambes
 */


public class LLamadaBoletin16 {


    public static void main(String[] args) {

        PedriDatos obx = new PedriDatos();
        obx.crearArray();

        AlturaMedia obx1 = new AlturaMedia();
        obx1.definirAltura();
       }
}