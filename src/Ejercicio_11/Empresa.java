package Ejercicio_11;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nombre;
    private double porcentajeComision;
    private List<Producto> productos;
    private List<ReunionGeneral> reuniones;

    public Empresa(String nombre, double porcentajeComision) {
        this.nombre = nombre;
        this.porcentajeComision = porcentajeComision;
        this.productos = new ArrayList<>();
        this.reuniones = new ArrayList<>();
    }

    public double getPorcentajeComision() { return porcentajeComision; }

    public void setPorcentajeComision(double porcentaje) {
        this.porcentajeComision = porcentaje;
    }

    public void agregarProducto(Producto producto) {
        this.productos.add(producto);
    }

    public ReunionGeneral celebrarReunion(LocalDate fechaActual, LocalDate fechaProxima) {
        ReunionGeneral nuevaReunion = new ReunionGeneral(fechaActual, fechaProxima);
        this.reuniones.add(nuevaReunion);
        return nuevaReunion;
    }

    public void liquidarComisiones(ReunionGeneral ultimaReunion, List<RepresentanteVentas> fuerzaVentas) {
        System.out.println("Liquidacion de Comisiones - Periodo desde: " + ultimaReunion.getFechaCelebracion());

        for (RepresentanteVentas representante : fuerzaVentas) {
            double comision = representante.calcularComision(ultimaReunion.getFechaCelebracion(), porcentajeComision);
            System.out.println("Representante: " + representante.getNombre() + " | Comision total: $" + comision);
        }
    }
}