package Ejercicio_09;

public class ColeccionExterna {
    private String nombre;
    private String tipo;
    private String descripcion;
    private String direccion;
    private String telefono;
    private String personaContacto;

    public ColeccionExterna(String nombre, String tipo, String descripcion, String direccion, String telefono, String personaContacto) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.direccion = direccion;
        this.telefono = telefono;
        this.personaContacto = personaContacto;
    }

    public String getNombre() { return nombre; }
    public String getTipo() { return tipo; }
    public String getPersonaContacto() { return personaContacto; }
}