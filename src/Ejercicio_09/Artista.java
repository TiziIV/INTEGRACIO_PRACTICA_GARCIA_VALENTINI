package Ejercicio_09;
import java.time.LocalDate;

public class Artista {
    private String nombre;
    private LocalDate fechaNacimiento;
    private LocalDate fechaDefuncion;
    private String paisOrigen;
    private String epoca;
    private String estiloPrincipal;
    private String descripcion;

    public Artista(String nombre, LocalDate fechaNacimiento, LocalDate fechaDefuncion, String paisOrigen, String epoca, String estiloPrincipal, String descripcion) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaDefuncion = fechaDefuncion;
        this.paisOrigen = paisOrigen;
        this.epoca = epoca;
        this.estiloPrincipal = estiloPrincipal;
        this.descripcion = descripcion;
    }

    public String getNombre() { return nombre; }
    public LocalDate getFechaNacimiento() { return fechaNacimiento; }
    public LocalDate getFechaDefuncion() { return fechaDefuncion; }
}