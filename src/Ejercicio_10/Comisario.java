package Ejercicio_10;

import java.util.ArrayList;
import java.util.List;

public class Comisario {
    private String dni;
    private String nombre;
    private List<Evento> eventosInvolucrado;

    public Comisario(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
        this.eventosInvolucrado = new ArrayList<>();
    }

    // Método para mantener la relación bidireccional desde este lado
    public void agregarEvento(Evento evento) {
        if (!eventosInvolucrado.contains(evento)) {
            eventosInvolucrado.add(evento);
        }
    }

    public String getNombre() { return nombre; }
    public List<Evento> getEventosInvolucrado() { return eventosInvolucrado; }
}