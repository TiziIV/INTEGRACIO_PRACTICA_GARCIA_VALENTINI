package Ejercicio_08;

import java.util.ArrayList;
import java.util.List;

public class Hangar {
    private int numero;
    private int capacidadMaxima;
    private String ubicacion;
    private List<Avion> avionesAlojados;

    public Hangar(int numero, int capacidadMaxima, String ubicacion) {
        this.numero = numero;
        this.capacidadMaxima = capacidadMaxima;
        this.ubicacion = ubicacion;
        this.avionesAlojados = new ArrayList<>();
    }

    public boolean agregarAvion(Avion avion) {
        if (avionesAlojados.size() < capacidadMaxima) {
            avionesAlojados.add(avion);
            avion.setHangar(this);
            return true;
        }
        System.out.println("El hangar " + numero + " está lleno.");
        return false;
    }

    public int getNumero() { return numero; }
}