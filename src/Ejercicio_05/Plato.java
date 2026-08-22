package Ejercicio_05;

public class Plato {
    private String nombre;
    private String descripcion;

    public Plato(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }
}