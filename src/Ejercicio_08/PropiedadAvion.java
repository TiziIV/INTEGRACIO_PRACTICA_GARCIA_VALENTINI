package Ejercicio_08;

import java.time.LocalDate;

public class PropiedadAvion {
    private LocalDate fechaAdquisicion;
    private boolean esActual;
    private Propietario propietario;
    private Avion avion;

    public PropiedadAvion(LocalDate fechaAdquisicion, boolean esActual, Propietario propietario, Avion avion) {
        this.fechaAdquisicion = fechaAdquisicion;
        this.esActual = esActual;
        this.propietario = propietario;
        this.avion = avion;
    }
}