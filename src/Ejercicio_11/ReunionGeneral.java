package Ejercicio_11;
import java.time.LocalDate;

public class ReunionGeneral {
    private LocalDate fechaCelebracion;
    private LocalDate fechaProximaReunion;

    public ReunionGeneral(LocalDate fechaCelebracion, LocalDate fechaProximaReunion) {
        this.fechaCelebracion = fechaCelebracion;
        this.fechaProximaReunion = fechaProximaReunion;
    }

    public LocalDate getFechaCelebracion() { return fechaCelebracion; }
    public LocalDate getFechaProximaReunion() { return fechaProximaReunion; }
}