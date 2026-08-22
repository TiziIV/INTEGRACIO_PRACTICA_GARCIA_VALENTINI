package Ejercicio_05;

public class Sucursal {
    private String direccion;
    private String telefono;
    private Restaurante restaurante; // Conoce a qué restaurante pertenece

    public Sucursal(String direccion, String telefono, Restaurante restaurante) {
        this.direccion = direccion;
        this.telefono = telefono;
        this.restaurante = restaurante;
    }

    public String getDireccion() {
        return direccion;
    }

    public Restaurante getRestaurante() {
        return restaurante;
    }
}