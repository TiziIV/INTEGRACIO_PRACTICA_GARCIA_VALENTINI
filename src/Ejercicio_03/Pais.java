package Ejercicio_03;
import java.util.ArrayList;
import java.util.List;

public class Pais {
    private String nombre;
    // Composición: El país contiene a las provincias
    private List<Provincia> provincias;

    public Pais(String nombre) {
        this.nombre = nombre;
        this.provincias = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarProvincia(Provincia provincia) {
        if (provincia != null) {
            this.provincias.add(provincia);
        }
    }

    public List<Ciudad> getCiudadesConDeficit() {
        List<Ciudad> todasLasCiudadesEnDeficit = new ArrayList<>();
        for (Provincia p : provincias) {
            todasLasCiudadesEnDeficit.addAll(p.getCiudadesConDeficit());
        }
        return todasLasCiudadesEnDeficit;
    }

    public List<Provincia> getProvinciasConDeficit() {
        List<Provincia> provinciasEnDeficit = new ArrayList<>();
        for (Provincia p : provincias) {
            if (p.estaEnDeficit()) {
                provinciasEnDeficit.add(p);
            }
        }
        return provinciasEnDeficit;
    }
}