package Ejercicio_08;

import java.time.LocalDate;

public class Servicio {
    private LocalDate fecha;
    private double horasInvertidas;
    private String tipoTrabajo;
    private Mecanico mecanico;
    private Avion avion;

    public Servicio(LocalDate fecha, double horasInvertidas, String tipoTrabajo, Mecanico mecanico, Avion avion) {
        this.fecha = fecha;
        this.horasInvertidas = horasInvertidas;
        this.tipoTrabajo = tipoTrabajo;
        this.mecanico = mecanico;
        this.avion = avion;
    }
}