package Ejercicio_11;

public class Producto {
    private String nombre;
    private double precioVentaPublico;

    public Producto(String nombre, double precioVentaPublico) {
        this.nombre = nombre;
        this.precioVentaPublico = precioVentaPublico;
    }

    public String getNombre() { return nombre; }
    public double getPrecioVentaPublico() { return precioVentaPublico; }

    public void setPrecioVentaPublico(double precio) {
        this.precioVentaPublico = precio;
    }
}