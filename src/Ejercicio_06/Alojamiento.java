package Ejercicio_06;

import java.util.ArrayList;
import java.util.List;

public class Alojamiento {
    private String nombre;
    private int capacidad;
    private String categoria;
    private List<Estancia> estanciasHistoricas;
    private List<Excursion> excursionesOrganizadas;

    public Alojamiento(String nombre, int capacidad, String categoria) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.categoria = categoria;
        this.estanciasHistoricas = new ArrayList<>();
        this.excursionesOrganizadas = new ArrayList<>();
    }

    public void registrarEstancia(Estancia estancia) { estanciasHistoricas.add(estancia); }
    public void organizarExcursion(Excursion excursion) { excursionesOrganizadas.add(excursion); }
    public String getNombre() { return nombre; }
}