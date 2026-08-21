package Ejercicio_06;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Proyecto {
    private String nombre;
    private double presupuesto;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private List<Especie> especiesInvestigadas;

    public Proyecto(String nombre) {
        this.nombre = nombre;
        this.especiesInvestigadas = new ArrayList<>();
    }

    public void agregarEspecie(Especie especie) { especiesInvestigadas.add(especie); }
}