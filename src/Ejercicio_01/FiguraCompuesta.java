package Ejercicio_01;
import java.util.ArrayList;
import java.util.List;

public class FiguraCompuesta extends Figura {
    private List<Figura> componentes;

    public FiguraCompuesta(Figura figuraInicial) {
        if (figuraInicial == null) {
            throw new IllegalArgumentException("Debe contener al menos una figura.");
        }
        this.componentes = new ArrayList<>();
        this.componentes.add(figuraInicial);
    }

    public void agregarFigura(Figura f) {
        if (f != null) {
            this.componentes.add(f);
        }
    }
}