package Ejercicio_10;

public class Material {
    private String codigo;
    private String descripcion;
    private int cantidad;

    public Material(String codigo, String descripcion, int cantidad) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
    }

    public String getDescripcion() { return descripcion; }
    public int getCantidad() { return cantidad; }
}