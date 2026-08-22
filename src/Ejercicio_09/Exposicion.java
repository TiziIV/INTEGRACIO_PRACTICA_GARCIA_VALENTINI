package Ejercicio_09;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Exposicion {
    private String nombre;
    private LocalDate fechaComienzo;
    private LocalDate fechaFin;
    private List<ObjetoDeArte> objetosExhibidos;

    public Exposicion(String nombre, LocalDate fechaComienzo, LocalDate fechaFin) {
        this.nombre = nombre;
        this.fechaComienzo = fechaComienzo;
        this.fechaFin = fechaFin;
        this.objetosExhibidos = new ArrayList<>();
    }

    public String getNombre() { return nombre; }

    public void agregarObjetoExhibido(ObjetoDeArte objeto) {
        this.objetosExhibidos.add(objeto);
    }

    public List<ObjetoDeArte> getObjetosExhibidos() { return objetosExhibidos; }
}