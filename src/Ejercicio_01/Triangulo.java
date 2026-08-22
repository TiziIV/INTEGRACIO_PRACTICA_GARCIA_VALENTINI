package Ejercicio_01;
import java.util.List;

public class Triangulo extends Poligono {
    public Triangulo(List<Lado> lados) {
        super(lados);
        if (lados.size() != 3) {
            throw new IllegalArgumentException("El triángulo debe tener exactamente 3 lados.");
        }
    }
}