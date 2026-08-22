package Ejercicio_07;
import java.time.LocalDate;
import java.time.Period;

public class Esquiador extends Participante {
    private String dni;
    private String nombre;
    private LocalDate fechaNacimiento;
    private Federacion federacion; // Relación obligatoria 1:1
    private boolean compiteEnEquipo; // Regla: exclusividad de modalidad

    public Esquiador(String codigo, String dni, String nombre, LocalDate fechaNacimiento, Federacion federacion) {
        super(codigo);
        if (federacion == null) throw new IllegalArgumentException("El esquiador debe tener federación");
        this.dni = dni;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.federacion = federacion;
        this.compiteEnEquipo = false;
    }

    public int getEdad() {
        return Period.between(fechaNacimiento, LocalDate.now()).getYears();
    }

    public void setCompiteEnEquipo(boolean enEquipo) {
        this.compiteEnEquipo = enEquipo;
    }

    public boolean esExclusivoEquipo() {
        return compiteEnEquipo;
    }

    public String getNombre() { return nombre; }
}