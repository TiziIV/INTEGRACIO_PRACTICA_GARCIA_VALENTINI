package Ejercicio_09;

public class Pintura extends ObjetoDeArte {
    private String tipoPintura;
    private String soporte;
    private String estilo;

    public Pintura(String id, String titulo, String descripcion, Integer anioCreacion, String paisOrigen, String cultura, String epoca, Artista artista, RegimenTenencia regimen, String tipoPintura, String soporte, String estilo) {
        super(id, titulo, descripcion, anioCreacion, paisOrigen, cultura, epoca, artista, regimen);
        this.tipoPintura = tipoPintura;
        this.soporte = soporte;
        this.estilo = estilo;
    }

    public String getTipoPintura() { return tipoPintura; }
    public String getSoporte() { return soporte; }
    public String getEstilo() { return estilo; }
}