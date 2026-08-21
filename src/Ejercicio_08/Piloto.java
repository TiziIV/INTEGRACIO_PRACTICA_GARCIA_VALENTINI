package Ejercicio_08;

import java.util.ArrayList;
import java.util.List;

public class Piloto extends Persona {
    private String numLicencia;
    private String restricciones;
    private List<TipoAvion> tiposAutorizados;

    public Piloto(String nss, String nombre, String direccion, String telefono, String numLicencia, String restricciones) {
        super(nss, nombre, direccion, telefono);
        this.numLicencia = numLicencia;
        this.restricciones = restricciones;
        this.tiposAutorizados = new ArrayList<>();
    }

    public void autorizarTipoAvion(TipoAvion tipo) {
        this.tiposAutorizados.add(tipo);
    }
}