package Ejercicio_09;
import java.util.ArrayList;
import java.util.List;

public class Museo {
    private String nombre;
    private List<ObjetoDeArte> coleccion;
    private List<Exposicion> exposiciones;

    public Museo(String nombre) {
        this.nombre = nombre;
        this.coleccion = new ArrayList<>();
        this.exposiciones = new ArrayList<>();
    }

    public void agregarObjeto(ObjetoDeArte objeto) {
        this.coleccion.add(objeto);
    }

    public void crearExposicion(Exposicion expo) {
        this.exposiciones.add(expo);
    }
}