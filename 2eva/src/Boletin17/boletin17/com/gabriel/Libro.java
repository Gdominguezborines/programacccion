package Boletin17.boletin17.com.gabriel;

/**
 *
 * @author cambes
 */
public class Libro implements Comparable<Libro>{
       
    private String titulo;
    private String autor;
    private String ISBN;
    private float prezo;
    private int Unidades;

    public Libro() {
    }

    public Libro(String titulo, String autor, String ISBN, float prezo, int Unidades) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.prezo = prezo;
        this.Unidades = Unidades;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public float getPrezo() {
        return prezo;
    }

    public void setPrezo(float prezo) {
        this.prezo = prezo;
    }

    public int getUnidades() {
        return Unidades;
    }

    public void setUnidades(int Unidades) {
        this.Unidades = Unidades;
    }

    @Override
    public String toString() {
        return "Titulo=" + titulo + ", Autor=" + autor + ", ISBN=" + ISBN + ", Prezo=" + prezo + ", Unidades=" + Unidades;
    }

    @Override
    public int compareTo(Libro libro) {
        return this.titulo.compareToIgnoreCase(libro.titulo);
    }
    
}
