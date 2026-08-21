package Ejercicio_10;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Evento {
    private String nombre;
    private LocalDate fecha;
    private int duracionMinutos;
    private int numParticipantes;
    private int numComisariosRequeridos;
    private List<Material> materiales;
    private List<Comisario> comisarios;

    public Evento(String nombre, LocalDate fecha, int duracionMinutos, int numParticipantes, int numComisariosRequeridos) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.duracionMinutos = duracionMinutos;
        this.numParticipantes = numParticipantes;
        this.numComisariosRequeridos = numComisariosRequeridos;
        this.materiales = new ArrayList<>();
        this.comisarios = new ArrayList<>();
    }

    public void agregarMaterial(Material material) {
        this.materiales.add(material);
    }

    // Asignamos el comisario y también le avisamos al comisario que participa de este evento
    public void asignarComisario(Comisario comisario) {
        if (!comisarios.contains(comisario)) {
            comisarios.add(comisario);
            comisario.agregarEvento(this); // Relación bidireccional
        }
    }

    public String getNombre() { return nombre; }
    public boolean tieneComisariosSuficientes() {
        return comisarios.size() >= numComisariosRequeridos;
    }
}