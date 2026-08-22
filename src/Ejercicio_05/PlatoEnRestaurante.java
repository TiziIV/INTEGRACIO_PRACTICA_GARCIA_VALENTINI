package Ejercicio_05;

public class PlatoEnRestaurante {
    private Restaurante restaurante;
    private Plato plato;
    private double precio;

    public PlatoEnRestaurante(Restaurante restaurante, Plato plato, double precio) {
        this.restaurante = restaurante;
        this.plato = plato;
        this.precio = precio;
    }

    public Restaurante getRestaurante() {
        return restaurante;
    }

    public Plato getPlato() {
        return plato;
    }

    public String getDetalle() {
        return plato.getNombre() + " preparado en " + restaurante.getNombre() + " ($" + precio + ")";
    }
}