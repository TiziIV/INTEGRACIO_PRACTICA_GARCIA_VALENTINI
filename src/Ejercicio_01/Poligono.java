package Ejercicio_01;
import java.util.List;

public abstract class Poligono extends FiguraBasica {
    protected List<Lado> lados;

    public Poligono(List<Lado> lados) {
        super();
        if (lados == null || lados.size() < 3) {
            throw new IllegalArgumentException("Un polígono debe tener al menos 3 lados.");
        }
        this.lados = lados;
    }
}