package Ejercicio_07;
import java.util.ArrayList;
import java.util.List;

public class EstacionEsqui {
    private String codigo;
    private String nombre;
    private String personasContacto;
    private String direccion;
    private String telefono;
    private double kmTotalesEsquiables;
    private List<Pista> pistas; // Composición

    public EstacionEsqui(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.pistas = new ArrayList<>();
    }

    public void agregarPista(Pista pista) {
        this.pistas.add(pista);
    }

    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
}