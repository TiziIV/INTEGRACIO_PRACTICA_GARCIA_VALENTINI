package Ejercicio_06;

import java.util.ArrayList;
import java.util.List;

public class Area {
    private String nombre;
    private double extensionKm2;
    private List<CensoEspecie> censos;

    public Area(String nombre, double extensionKm2) {
        this.nombre = nombre;
        this.extensionKm2 = extensionKm2;
        this.censos = new ArrayList<>();
    }

    public void registrarCenso(Especie especie, int cantidad) {
        censos.add(new CensoEspecie(especie, cantidad));
    }

    public String getNombre() { return nombre; }
    public double getExtensionKm2() { return extensionKm2; }
}