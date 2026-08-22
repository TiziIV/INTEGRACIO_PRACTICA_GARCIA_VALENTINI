package Ejercicio_01;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Punto p1 = new Punto(0, 0);
        Punto p2 = new Punto(0, 5);
        Punto p3 = new Punto(5, 0);

        List<Lado> ladosTriangulo = new ArrayList<>();
        ladosTriangulo.add(new Lado(p1, p2));
        ladosTriangulo.add(new Lado(p2, p3));
        ladosTriangulo.add(new Lado(p3, p1));

        Triangulo miTriangulo = new Triangulo(ladosTriangulo);
        Circulo miCirculo = new Circulo();

        FiguraCompuesta dibujoComplejo = new FiguraCompuesta(miTriangulo);
        dibujoComplejo.agregarFigura(miCirculo);

        System.out.println("Todo el paquete Ejercicio_01 funciona joya.");
    }
}