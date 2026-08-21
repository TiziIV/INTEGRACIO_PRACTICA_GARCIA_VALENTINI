package Ejercicio_06;

import java.util.ArrayList;
import java.util.List;

public class Personal {
    private String dni;
    private String nombre;
    private String direccion;
    private String telefono;
    private double sueldo;
    private String numSeguridadSocial;
    private ParqueNacional parqueDondeTrabaja;

    // Una misma persona puede tener Varios Roles (Guarda E Investigador a la vez)
    private List<RolPersonal> roles;

    public Personal(String dni, String nombre, ParqueNacional parque) {
        this.dni = dni;
        this.nombre = nombre;
        this.parqueDondeTrabaja = parque;
        this.roles = new ArrayList<>();
    }

    public void agregarRol(RolPersonal rol) {
        this.roles.add(rol);
    }

    public String getNombre() { return nombre; }
}