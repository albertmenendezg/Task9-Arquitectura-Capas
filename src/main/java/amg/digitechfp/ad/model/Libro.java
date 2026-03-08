package amg.digitechfp.ad.model;

public class Libro {
    private Integer id;
    private String titulo;
    private String isbn;
    private Integer anio;
    private boolean disponible;

    public Libro(Integer id, String titulo, String isbn, Integer anio, boolean disponible) {
        this.id = id;
        this.titulo = titulo;
        this.isbn = isbn;
        this.anio = anio;
        this.disponible = disponible;
    }

    public Libro(String titulo, String isbn, Integer anio, boolean disponible) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.anio = anio;
        this.disponible = disponible;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
