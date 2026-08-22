package Ejercicio_05;
import java.util.ArrayList;
import java.util.List;

public class Restaurante {
    private String nombre;
    // Composición de sucursales y agregación/menú de platos
    private List<Sucursal> sucursales;
    private List<PlatoEnRestaurante> platosOfrecidos;

    public Restaurante(String nombre) {
        this.nombre = nombre;
        this.sucursales = new ArrayList<>();
        this.platosOfrecidos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarSucursal(Sucursal sucursal) {
        if (sucursal != null) {
            this.sucursales.add(sucursal);
        }
    }

    // Regla: No puede ofrecer más de 20 platos
    public boolean agregarPlato(Plato plato, double precio) {
        if (this.platosOfrecidos.size() < 20) {
            PlatoEnRestaurante nuevoPlato = new PlatoEnRestaurante(this, plato, precio);
            this.platosOfrecidos.add(nuevoPlato);
            return true; // Se agregó con éxito
        }
        System.out.println("Error: La carta de " + this.nombre + " ya alcanzó el límite de 20 platos.");
        return false; // No se pudo agregar
    }

    public List<PlatoEnRestaurante> getPlatos() {
        return platosOfrecidos;
    }
}