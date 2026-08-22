package Ejercicio_09;

public abstract class ObjetoDeArte {
    protected String id;
    protected String titulo;
    protected String descripcion;
    protected Integer anioCreacion;
    protected String paisOrigen;
    protected String cultura;
    protected String epoca;

    protected Artista artista;
    protected RegimenTenencia regimen;

    public ObjetoDeArte(String id, String titulo, String descripcion, Integer anioCreacion, String paisOrigen, String cultura, String epoca, Artista artista, RegimenTenencia regimen) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.anioCreacion = anioCreacion;
        this.paisOrigen = paisOrigen;
        this.cultura = cultura;
        this.epoca = epoca;
        this.artista = artista;
        this.regimen = regimen;
    }

    public String getId() { return id; }
    public String getTitulo() { return titulo; }
    public Artista getArtista() { return artista; }
    public RegimenTenencia getRegimenTenencia() { return regimen; }
}