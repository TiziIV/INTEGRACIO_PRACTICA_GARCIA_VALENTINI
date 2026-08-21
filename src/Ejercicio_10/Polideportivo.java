package Ejercicio_10;

public class Polideportivo extends ComplejoDeportivo {
    private int cantidadCanchas;

    public Polideportivo(String nombre, String localizacion, String jefeOrganizacion, double areaOcupadaM2, int cantidadCanchas) {
        super(nombre, localizacion, jefeOrganizacion, areaOcupadaM2);
        this.cantidadCanchas = cantidadCanchas;
    }

    public int getCantidadCanchas() { return cantidadCanchas; }
}