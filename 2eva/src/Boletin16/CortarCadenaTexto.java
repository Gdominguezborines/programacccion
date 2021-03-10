package Boletin16;

/**
 * @author Cambes
 */

public class CortarCadenaTexto {
    String cadea = "www. java-desde0. com";


    public void separarCadeadeDetesto() {

        String[] partes = cadea.split("-");
        System.out.println(partes[0]);
        System.out.println(partes[1]);

    }

    public void unirCadenaDeTesto(String parte1, String parte2) {

        cadea = parte1 + parte2;
        System.out.println(cadea);
        }
}