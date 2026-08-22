package Ejercicio_07;
import java.util.ArrayList;
import java.util.List;

public class Equipo extends Participante {
    private String entrenador;
    private List<Esquiador> esquiadores; // Agregación

    public Equipo(String codigo, String entrenador) {
        super(codigo);
        this.entrenador = entrenador;
        this.esquiadores = new ArrayList<>();
    }

    public void agregarEsquiador(Esquiador esquiador) {
        esquiador.setCompiteEnEquipo(true); // Se marca para validar la exclusividad
        this.esquiadores.add(esquiador);
    }

    public int getCantidadEsquiadores() {
        return esquiadores.size();
    }
}