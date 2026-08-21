package Ejercicio_10;

public class AreaDesignada {
    private String nombre;
    private String deporteAsignado;
    private String indicadorSituacion; // Ej: Centro, Esquina N-E

    public AreaDesignada(String nombre, String deporteAsignado, String indicadorSituacion) {
        this.nombre = nombre;
        this.deporteAsignado = deporteAsignado;
        this.indicadorSituacion = indicadorSituacion;
    }

    public String getNombre() { return nombre; }
    public String getIndicadorSituacion() { return indicadorSituacion; }
}