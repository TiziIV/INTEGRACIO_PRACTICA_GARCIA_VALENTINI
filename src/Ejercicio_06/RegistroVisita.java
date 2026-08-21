package Ejercicio_06;
import java.time.LocalDate;

public class RegistroVisita {
    private LocalDate fecha;
    private Visitante visitante;
    private Entrada entrada;

    public RegistroVisita(LocalDate fecha, Visitante visitante, Entrada entrada) {
        this.fecha = fecha;
        this.visitante = visitante;
        this.entrada = entrada;
    }
}