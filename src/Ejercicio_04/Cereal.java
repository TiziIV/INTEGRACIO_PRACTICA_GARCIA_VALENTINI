package Ejercicio_04;

import java.util.ArrayList;
import java.util.List;

public abstract class Cereal {
    private String nombre;
    private List<Mineral> mineralesRequeridos;

    public Cereal(String nombre) {
        this.nombre = nombre;
        this.mineralesRequeridos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarMineralRequerido(Mineral mineral) {
        if (!mineralesRequeridos.contains(mineral)) {
            mineralesRequeridos.add(mineral);
        }
    }

    public List<Mineral> getMineralesRequeridos() {
        return mineralesRequeridos;
    }

    // Método polimórfico: cada tipo de cereal evalúa distinto si es apto o no
    public abstract boolean puedeSembrarseEn(Lote lote);
}