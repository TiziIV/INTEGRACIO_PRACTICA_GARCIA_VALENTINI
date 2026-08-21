package Ejercicio_08;

public abstract class Persona {
    private String nss; // Número de Seguridad Social
    private String nombre;
    private String direccion;
    private String telefono;

    public Persona(String nss, String nombre, String direccion, String telefono) {
        this.nss = nss;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getNombre() { return nombre; }
    public String getNss() { return nss; }
}