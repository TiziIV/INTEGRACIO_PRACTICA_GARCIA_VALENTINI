package Ejercicio_06;

public class CensoEspecie {
    private Especie especie;
    private int numIndividuos;

    public CensoEspecie(Especie especie, int numIndividuos) {
        this.especie = especie;
        this.numIndividuos = numIndividuos;
    }

    public Especie getEspecie() { return especie; }
    public int getNumIndividuos() { return numIndividuos; }
    public void setNumIndividuos(int numIndividuos) { this.numIndividuos = numIndividuos; }
}