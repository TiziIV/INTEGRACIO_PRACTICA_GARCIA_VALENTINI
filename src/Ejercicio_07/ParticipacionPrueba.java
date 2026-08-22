package Ejercicio_07;
import java.time.LocalDate;
import java.util.List;

public class ParticipacionPrueba {
    private int dorsal;
    private String codigoParticipacion; // NombrePrueba + Dorsal
    private double tiempoEmpleado;
    private int posicionObtenida;

    private Participante participante;
    private Prueba prueba;
    private List<Esquiador> esquiadoresActivos; // En caso de ser equipo, quiénes compitieron realmente

    public ParticipacionPrueba(int dorsal, Participante participante, Prueba prueba) {
        this.dorsal = dorsal;
        this.participante = participante;
        this.prueba = prueba;
        this.codigoParticipacion = prueba.getNombre() + "-" + dorsal;
    }

    public void registrarResultado(double tiempo, int posicion) {
        this.tiempoEmpleado = tiempo;
        this.posicionObtenida = posicion;
    }

    public String getCodigoParticipacion() { return codigoParticipacion; }
}