package Ejercicio_10;

public class ComplejoUnicoDeporte extends ComplejoDeportivo {
    private String deportePrincipal;

    public ComplejoUnicoDeporte(String nombre, String localizacion, String jefeOrganizacion, double areaOcupadaM2, String deportePrincipal) {
        super(nombre, localizacion, jefeOrganizacion, areaOcupadaM2);
        this.deportePrincipal = deportePrincipal;
    }

    public String getDeportePrincipal() { return deportePrincipal; }
}