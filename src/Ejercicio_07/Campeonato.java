package Ejercicio_07;
import java.util.ArrayList;
import java.util.List;

public class Campeonato {
    private String nombre;
    private List<Prueba> pruebas;

    public Campeonato(String nombre) {
        this.nombre = nombre;
        this.pruebas = new ArrayList<>();
    }

    public void agregarPrueba(Prueba prueba) {
        this.pruebas.add(prueba);
    }
}