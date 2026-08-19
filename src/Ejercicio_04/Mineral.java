package Ejercicio_04;

public class Mineral {
    private String nombre;
    private TipoMineral tipo;

    public Mineral(String nombre, TipoMineral tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public TipoMineral getTipo() {
        return tipo;
    }
}