package Ejercicio_09;

public class OtroObjeto extends ObjetoDeArte {
    private String tipoGenerico;

    public OtroObjeto(String id, String titulo, String descripcion, Integer anioCreacion, String paisOrigen, String cultura, String epoca, Artista artista, RegimenTenencia regimen, String tipoGenerico) {
        super(id, titulo, descripcion, anioCreacion, paisOrigen, cultura, epoca, artista, regimen);
        this.tipoGenerico = tipoGenerico;
    }

    public String getTipoGenerico() { return tipoGenerico; }
}