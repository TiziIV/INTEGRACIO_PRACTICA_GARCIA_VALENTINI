package Ejercicio_06;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Excursion {
    private String codigo;
    private LocalDate dia;
    private LocalTime hora;
    private List<Visitante> inscriptos;

    public Excursion(String codigo, LocalDate dia, LocalTime hora) {
        this.codigo = codigo;
        this.dia = dia;
        this.hora = hora;
        this.inscriptos = new ArrayList<>();
    }

    public void inscribirVisitante(Visitante visitante) {
        inscriptos.add(visitante);
    }
}