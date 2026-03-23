package TodoList;

public class Lista {
    private String nomTarea;
    private String autor;
    private String descripcion;
    private double duracionMinutos;
    private String estado;

    public Lista(String nomTarea, String autor, String descripcion, double duracionMinutos, String estado) {
        this.nomTarea = nomTarea;
        this.autor = autor;
        this.descripcion = descripcion;
        this.duracionMinutos = duracionMinutos;
        this.estado = estado;
    }

    public String getNomTarea() {
        return nomTarea;
    }

    public void setNomTarea(String nomTarea) {
        this.nomTarea = nomTarea;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(double duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Lista{" +
                "nomTarea='" + nomTarea + '\'' +
                ", autor='" + autor + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", duracionMinutos=" + duracionMinutos +
                ", estado='" + estado + '\'' +
                '}';
    }
}
