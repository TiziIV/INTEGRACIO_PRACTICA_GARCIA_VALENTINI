package Ejercicio_06;

import java.util.ArrayList;
import java.util.List;

public class Investigador extends RolPersonal {
    private String titulacion;
    private List<Proyecto> proyectos;

    public Investigador(String titulacion) {
        this.titulacion = titulacion;
        this.proyectos = new ArrayList<>();
    }

    public void asignarProyecto(Proyecto proyecto) {
        this.proyectos.add(proyecto);
    }
}