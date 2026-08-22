package Ejercicio_07;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Prueba {
    protected String nombre;
    protected String tipo;
    protected EstacionEsqui estacion; // Se realiza en una única estación
    protected List<Pista> pistasUso;
    protected Participante vencedor;
    protected double tiempoVencedor;

    public Prueba(String nombre, String tipo, EstacionEsqui estacion) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.estacion = estacion;
        this.pistasUso = new ArrayList<>();
    }

    public void registrarVencedor(Participante participante, double tiempo) {
        this.vencedor = participante;
        this.tiempoVencedor = tiempo;
    }

    public String getNombre() { return nombre; }
}