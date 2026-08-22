package Ejercicio_03;
import java.util.ArrayList;
import java.util.List;

public class Provincia {
    private String nombre;
    // Composición: La provincia contiene a sus ciudades
    private List<Ciudad> ciudades;

    public Provincia(String nombre) {
        this.nombre = nombre;
        this.ciudades = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarCiudad(Ciudad ciudad) {
        if (ciudad != null) {
            this.ciudades.add(ciudad);
        }
    }

    public List<Ciudad> getCiudadesAuditadas() {
        List<Ciudad> auditadas = new ArrayList<>();
        for (Ciudad c : ciudades) {
            if (c.esAuditable()) {
                auditadas.add(c);
            }
        }
        return auditadas;
    }

    public List<Ciudad> getCiudadesConDeficit() {
        List<Ciudad> conDeficit = new ArrayList<>();
        // Solo evaluamos sobre las que son auditables
        for (Ciudad c : getCiudadesAuditadas()) {
            if (c.estaEnDeficit()) {
                conDeficit.add(c);
            }
        }
        return conDeficit;
    }

    // Déficit provincial: si más de la mitad de las ciudades AUDITADAS están en déficit
    public boolean estaEnDeficit() {
        List<Ciudad> auditadas = getCiudadesAuditadas();

        // Si no hay ciudades auditables en la provincia, zafa del déficit
        if (auditadas.isEmpty()) {
            return false;
        }

        int cantidadEnDeficit = getCiudadesConDeficit().size();
        int totalAuditadas = auditadas.size();

        return cantidadEnDeficit > (totalAuditadas / 2.0);
    }
}