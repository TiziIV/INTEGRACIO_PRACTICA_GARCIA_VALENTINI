package Ejercicio_06;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ParqueNacional {
    private String nombre;
    private LocalDate fechaDeclaracion;
    private List<Area> areas;
    private List<Entrada> entradas;
    private List<Alojamiento> alojamientos;
    private List<Personal> empleados;

    public ParqueNacional(String nombre, LocalDate fechaDeclaracion) {
        this.nombre = nombre;
        this.fechaDeclaracion = fechaDeclaracion;
        this.areas = new ArrayList<>();
        this.entradas = new ArrayList<>();
        this.alojamientos = new ArrayList<>();
        this.empleados = new ArrayList<>();
    }

    public void agregarArea(Area area) { areas.add(area); }
    public void agregarEntrada(Entrada entrada) { entradas.add(entrada); }
    public void agregarAlojamiento(Alojamiento alojamiento) { alojamientos.add(alojamiento); }
    public void agregarEmpleado(Personal empleado) { empleados.add(empleado); }

    public String getNombre() { return nombre; }
}