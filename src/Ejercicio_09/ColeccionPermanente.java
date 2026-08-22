package Ejercicio_09;
import java.time.LocalDate;

public class ColeccionPermanente extends RegimenTenencia {
    private LocalDate fechaAdquisicion;
    private double coste;
    private boolean enExposicion;

    public ColeccionPermanente(LocalDate fechaAdquisicion, double coste, boolean enExposicion) {
        this.fechaAdquisicion = fechaAdquisicion;
        this.coste = coste;
        this.enExposicion = enExposicion;
    }

    public LocalDate getFechaAdquisicion() { return fechaAdquisicion; }
    public double getCoste() { return coste; }
    public boolean isEnExposicion() { return enExposicion; }

    public void setEnExposicion(boolean estado) {
        this.enExposicion = estado;
    }
}