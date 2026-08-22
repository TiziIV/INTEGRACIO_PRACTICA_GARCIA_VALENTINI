package Ejercicio_01;

public class Lado {
    private Punto punto1;
    private Punto punto2;

    public Lado(Punto p1, Punto p2) {
        if (p1 == null || p2 == null) {
            throw new IllegalArgumentException("El lado debe tener 2 puntos definidos.");
        }
        this.punto1 = p1;
        this.punto2 = p2;
    }
}