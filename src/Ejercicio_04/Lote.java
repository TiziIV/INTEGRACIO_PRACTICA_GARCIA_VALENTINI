package Ejercicio_04;

import java.util.ArrayList;
import java.util.List;

public class Lote {
    private String nombre;
    private List<Mineral> minerales;
    private List<Cereal> historialSiembras;

    public Lote(String nombre) {
        this.nombre = nombre;
        this.minerales = new ArrayList<>();
        this.historialSiembras = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarMineral(Mineral mineral) {
        if (!minerales.contains(mineral)) {
            minerales.add(mineral);
        }
    }

    public void sembrar(Cereal cereal) {
        historialSiembras.add(cereal);
    }

    // Verifica si el lote tiene TODOS los minerales que pide una lista (útil para el Cereal)
    public boolean contieneTodosLosMinerales(List<Mineral> requeridos) {
        return this.minerales.containsAll(requeridos);
    }

    // Recorre el historial para ver si ya se sembró una pastura antes
    public boolean tuvoPasturaPrevia() {
        for (Cereal cereal : historialSiembras) {
            if (cereal instanceof Pastura) {
                return true;
            }
        }
        return false;
    }

    // Un lote es especial si tiene al menos un mineral de interés primario
    public boolean esEspecial() {
        for (Mineral mineral : minerales) {
            if (mineral.getTipo() == TipoMineral.PRIMARIO) {
                return true;
            }
        }
        return false;
    }
}