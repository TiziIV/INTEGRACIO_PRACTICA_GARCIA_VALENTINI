package Ejercicio_05;
import java.util.ArrayList;
import java.util.List;

public class Persona {
    private String nombre;
    private List<PlatoEnRestaurante> platosPreferidos;
    private List<Sucursal> sucursalesFrecuentes;
    private List<Sucursal> sucursalesOcasionales;

    public Persona(String nombre) {
        this.nombre = nombre;
        this.platosPreferidos = new ArrayList<>();
        this.sucursalesFrecuentes = new ArrayList<>();
        this.sucursalesOcasionales = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarPlatoPreferido(PlatoEnRestaurante oferta) {
        if (oferta != null && !platosPreferidos.contains(oferta)) {
            this.platosPreferidos.add(oferta);
        }
    }

    public void frecuentarSucursal(Sucursal sucursal) {
        if (sucursal != null && !sucursalesFrecuentes.contains(sucursal)) {
            this.sucursalesFrecuentes.add(sucursal);
        }
    }

    public void concurrirOcasionalmente(Sucursal sucursal) {
        if (sucursal != null && !sucursalesOcasionales.contains(sucursal)) {
            this.sucursalesOcasionales.add(sucursal);
        }
    }

    // Lógica para saber si le gusta un plato genérico en un restaurante puntual
    public boolean leGustaPlatoEn(Plato plato, Restaurante rest) {
        for (PlatoEnRestaurante preferido : platosPreferidos) {
            if (preferido.getPlato().equals(plato) && preferido.getRestaurante().equals(rest)) {
                return true;
            }
        }
        return false;
    }
}