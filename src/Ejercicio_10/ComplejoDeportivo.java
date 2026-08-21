package Ejercicio_10;

import java.util.ArrayList;
import java.util.List;

public abstract class ComplejoDeportivo {
    private String nombre;
    private String localizacion;
    private String jefeOrganizacion;
    private double areaOcupadaM2;
    private List<AreaDesignada> areas;
    private List<Evento> eventos;

    public ComplejoDeportivo(String nombre, String localizacion, String jefeOrganizacion, double areaOcupadaM2) {
        this.nombre = nombre;
        this.localizacion = localizacion;
        this.jefeOrganizacion = jefeOrganizacion;
        this.areaOcupadaM2 = areaOcupadaM2;
        this.areas = new ArrayList<>();
        this.eventos = new ArrayList<>();
    }

    public void agregarArea(AreaDesignada area) {
        this.areas.add(area);
    }

    public void programarEvento(Evento evento) {
        this.eventos.add(evento);
    }

    public String getNombre() { return nombre; }
    public String getLocalizacion() { return localizacion; }
}