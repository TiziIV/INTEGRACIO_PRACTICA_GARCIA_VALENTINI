package Ejercicio_07;
import java.util.ArrayList;
import java.util.List;

public class Pista {
    private int numeroCorrelativo;
    private double longitudKm;
    private NivelDificultad dificultad;
    // Patrón Composite: Una pista puede componerse de subpistas
    private List<Pista> subpistas;

    public Pista(int numeroCorrelativo, double longitudKm, NivelDificultad dificultad) {
        this.numeroCorrelativo = numeroCorrelativo;
        this.longitudKm = longitudKm;
        this.dificultad = dificultad;
        this.subpistas = new ArrayList<>();
    }

    public void agregarSubpista(Pista subpista) {
        if (subpista != null) {
            this.subpistas.add(subpista);
        }
    }

    public String getCodigoCompleto() {
        return "P-" + numeroCorrelativo;
    }

    public double getLongitudKm() {
        // Si tiene subpistas, la longitud es la suma de las subpistas
        if (!subpistas.isEmpty()) {
            double total = 0;
            for (Pista p : subpistas) {
                total += p.getLongitudKm();
            }
            return total;
        }
        return longitudKm;
    }
}