package Ejercicio_06;

import java.util.ArrayList;
import java.util.List;

public class EspecieAnimal extends Especie {
    private String periodoCelo;
    private TipoAlimentacion tipoAlimentacion;
    private List<Especie> alimentos; // Qué otras especies come

    public EspecieAnimal(String nombreCientifico, String nombreVulgar, String periodoCelo, TipoAlimentacion tipo) {
        super(nombreCientifico, nombreVulgar);
        this.periodoCelo = periodoCelo;
        this.tipoAlimentacion = tipo;
        this.alimentos = new ArrayList<>();
    }

    public void agregarAlimento(Especie especie) {
        this.alimentos.add(especie);
    }

    public String getPeriodoCelo() { return periodoCelo; }
    public TipoAlimentacion getTipoAlimentacion() { return tipoAlimentacion; }
}