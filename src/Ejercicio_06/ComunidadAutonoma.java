package Ejercicio_06;

import java.util.ArrayList;
import java.util.List;

public class ComunidadAutonoma {
    private String nombre;
    private String organismoResponsable;
    private List<ParqueNacional> parques;

    public ComunidadAutonoma(String nombre, String organismoResponsable) {
        this.nombre = nombre;
        this.organismoResponsable = organismoResponsable;
        this.parques = new ArrayList<>();
    }

    public void agregarParque(ParqueNacional parque) {
        if (!parques.contains(parque)) parques.add(parque);
    }

    public String getNombre() { return nombre; }
    public String getOrganismoResponsable() { return organismoResponsable; }
}