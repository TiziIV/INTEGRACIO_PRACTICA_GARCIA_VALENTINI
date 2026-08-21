package Ejercicio_10;

import java.util.ArrayList;
import java.util.List;

public class SedeOlimpica {
    private String nombre;
    private double presupuestoAproximado;
    private List<ComplejoDeportivo> complejos;

    public SedeOlimpica(String nombre, double presupuestoAproximado) {
        this.nombre = nombre;
        this.presupuestoAproximado = presupuestoAproximado;
        this.complejos = new ArrayList<>();
    }

    public void agregarComplejo(ComplejoDeportivo complejo) {
        if (!complejos.contains(complejo)) {
            complejos.add(complejo);
        }
    }

    // El número de complejos se calcula dinámicamente, no hace falta un atributo suelto
    public int getNumeroComplejos() {
        return complejos.size();
    }

    public String getNombre() { return nombre; }
    public double getPresupuestoAproximado() { return presupuestoAproximado; }
}