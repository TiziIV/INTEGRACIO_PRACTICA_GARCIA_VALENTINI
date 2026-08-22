package Ejercicio_09;

public class Escultura extends ObjetoDeArte {
    private String material;
    private double altura;
    private double peso;
    private String estilo;

    public Escultura(String id, String titulo, String descripcion, Integer anioCreacion, String paisOrigen, String cultura, String epoca, Artista artista, RegimenTenencia regimen, String material, double altura, double peso, String estilo) {
        super(id, titulo, descripcion, anioCreacion, paisOrigen, cultura, epoca, artista, regimen);
        this.material = material;
        this.altura = altura;
        this.peso = peso;
        this.estilo = estilo;
    }

    public String getMaterial() { return material; }
    public double getAltura() { return altura; }
    public double getPeso() { return peso; }
}