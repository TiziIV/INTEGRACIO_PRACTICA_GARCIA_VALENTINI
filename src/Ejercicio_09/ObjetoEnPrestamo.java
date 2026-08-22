package Ejercicio_09;
import java.time.LocalDate;

public class ObjetoEnPrestamo extends RegimenTenencia {
    private LocalDate fechaRecepcion;
    private LocalDate fechaDevolucion;
    private ColeccionExterna coleccionOrigen;

    public ObjetoEnPrestamo(LocalDate fechaRecepcion, LocalDate fechaDevolucion, ColeccionExterna coleccionOrigen) {
        this.fechaRecepcion = fechaRecepcion;
        this.fechaDevolucion = fechaDevolucion;
        this.coleccionOrigen = coleccionOrigen;
    }

    public LocalDate getFechaRecepcion() { return fechaRecepcion; }
    public LocalDate getFechaDevolucion() { return fechaDevolucion; }
    public ColeccionExterna getColeccionOrigen() { return coleccionOrigen; }
}