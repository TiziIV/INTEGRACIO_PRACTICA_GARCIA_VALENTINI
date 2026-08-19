package Ejercicio_02;

import java.util.ArrayList;
import java.util.List;

public class Pais {
    private String nombre;
    private Ciudad capital;
    private List<Provincia> provincias;
    private List<Pais> limites;

    public Pais(String nombre) {
        this.nombre = nombre;
        this.provincias = new ArrayList<>();
        this.limites = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Ciudad getCapital() {
        return capital;
    }

    public void setCapital(Ciudad capital) {
        this.capital = capital;
    }

    public void agregarProvincia(Provincia provincia) {
        if (!provincias.contains(provincia)) {
            provincias.add(provincia);
        }
    }

    public List<Provincia> getProvincias() {
        return provincias;
    }

    public void agregarLimite(Pais pais) {
        if (!limites.contains(pais)) {
            limites.add(pais);
        }
    }

    public List<Pais> getLimites() {
        return limites;
    }
}