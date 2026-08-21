package Ejercicio_08;

import java.util.ArrayList;
import java.util.List;

public class Avion {
    private String matricula;
    private TipoAvion tipo;
    private Hangar hangar;
    private List<Servicio> historialServicios;
    private List<PropiedadAvion> historialPropietarios;

    public Avion(String matricula, TipoAvion tipo) {
        this.matricula = matricula;
        this.tipo = tipo;
        this.historialServicios = new ArrayList<>();
        this.historialPropietarios = new ArrayList<>();
    }

    public void setHangar(Hangar hangar) { this.hangar = hangar; }
    public String getMatricula() { return matricula; }
    public TipoAvion getTipo() { return tipo; }

    public void registrarServicio(Servicio servicio) {
        this.historialServicios.add(servicio);
    }

    public void registrarPropiedad(PropiedadAvion propiedad) {
        this.historialPropietarios.add(propiedad);
    }
}