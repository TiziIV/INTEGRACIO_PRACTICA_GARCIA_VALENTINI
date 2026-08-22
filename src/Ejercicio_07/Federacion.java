package Ejercicio_07;
import java.util.ArrayList;
import java.util.List;

public class Federacion {
    private String nombre;
    private int numFederados;
    private List<EstacionEsqui> estacionesAdministradas; // Agregación N:M

    public Federacion(String nombre) {
        this.nombre = nombre;
        this.estacionesAdministradas = new ArrayList<>();
    }

    public void agregarEstacion(EstacionEsqui estacion) {
        this.estacionesAdministradas.add(estacion);
    }

    public String getNombre() { return nombre; }
}