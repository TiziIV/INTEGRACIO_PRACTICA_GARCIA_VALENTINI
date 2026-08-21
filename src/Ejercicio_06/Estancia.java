package Ejercicio_06;

import java.time.LocalDate;

public class Estancia {
    private Visitante visitante;
    private String habitacion;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    public Estancia(Visitante visitante, String habitacion, LocalDate fechaInicio, LocalDate fechaFin) {
        this.visitante = visitante;
        this.habitacion = habitacion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public Visitante getVisitante() { return visitante; }
}