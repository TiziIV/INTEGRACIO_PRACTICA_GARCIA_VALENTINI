package Ejercicio_06;

import java.time.LocalDate;

public class Celador extends RolPersonal {
    private Entrada entradaAsignada;

    public Celador(Entrada entradaAsignada) {
        this.entradaAsignada = entradaAsignada;
    }

    public RegistroVisita registrarIngreso(Visitante visitante, LocalDate fecha) {
        return new RegistroVisita(fecha, visitante, entradaAsignada);
    }
}