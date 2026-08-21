package Ejercicio_06;

public abstract class Especie {
    private String nombreCientifico;
    private String nombreVulgar;

    public Especie(String nombreCientifico, String nombreVulgar) {
        this.nombreCientifico = nombreCientifico;
        this.nombreVulgar = nombreVulgar;
    }

    public String getNombreCientifico() { return nombreCientifico; }
    public String getNombreVulgar() { return nombreVulgar; }
}