package Ejercicio_08;

import java.util.ArrayList;
import java.util.List;

public class Mecanico extends Persona {
    private double salario;
    private String turno;
    private List<TipoAvion> tiposAutorizados;

    public Mecanico(String nss, String nombre, String direccion, String telefono, double salario, String turno) {
        super(nss, nombre, direccion, telefono);
        this.salario = salario;
        this.turno = turno;
        this.tiposAutorizados = new ArrayList<>();
    }

    public void autorizarTipoAvion(TipoAvion tipo) {
        this.tiposAutorizados.add(tipo);
    }

    public boolean puedeMantener(TipoAvion tipo) {
        return tiposAutorizados.contains(tipo);
    }
}