package Ejercicio_02;

import java.util.ArrayList;
import java.util.List;

public class Provincia {
    private String nombre;
    private Ciudad capital;
    private List<Ciudad> ciudades;
    private List<Provincia> limitesProvinciales;
    private List<Pais> limitesPaises;

    public Provincia(String nombre) {
        this.nombre = nombre;
        this.ciudades = new ArrayList<>();
        this.limitesProvinciales = new ArrayList<>();
        this.limitesPaises = new ArrayList<>();
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

    public void agregarCiudad(Ciudad ciudad) {
        if (!ciudades.contains(ciudad)) {
            ciudades.add(ciudad);
        }
    }

    public List<Ciudad> getCiudades() {
        return ciudades;
    }

    public void agregarLimiteProvincial(Provincia provincia) {
        if (!limitesProvinciales.contains(provincia)) {
            limitesProvinciales.add(provincia);
        }
    }

    public List<Provincia> getLimitesProvinciales() {
        return limitesProvinciales;
    }

    public void agregarLimitePais(Pais pais) {
        if (!limitesPaises.contains(pais)) {
            limitesPaises.add(pais);
        }
    }

    public List<Pais> getLimitesPaises() {
        return limitesPaises;
    }
}