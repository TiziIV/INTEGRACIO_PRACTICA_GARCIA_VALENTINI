package Ejercicio_11;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Lider extends RepresentanteVentas {
    private LocalDate fechaPromocionLider;
    private List<Vendedor> equipo;

    public Lider(String nombre, String direccion, String telefono, LocalDate fechaNacimiento, String cuitCuil, LocalDate fechaIncorporacion, LocalDate fechaPromocionLider) {
        super(nombre, direccion, telefono, fechaNacimiento, cuitCuil, fechaIncorporacion);
        this.fechaPromocionLider = fechaPromocionLider;
        this.equipo = new ArrayList<>();
    }

    public LocalDate getFechaPromocionLider() { return fechaPromocionLider; }

    public void agregarVendedorAlEquipo(Vendedor vendedor) {
        this.equipo.add(vendedor);
    }

    public List<Vendedor> getEquipo() { return equipo; }

    @Override
    public double calcularComision(LocalDate fechaDesde, double porcentaje) {
        // 1. Calcular comision por ventas propias
        double totalVentasPropias = 0;
        for (TicketVenta ticket : getVentasDesde(fechaDesde)) {
            totalVentasPropias += ticket.getPrecioUnitario();
        }
        double comisionPropia = totalVentasPropias * porcentaje;

        // 2. Calcular comision por ventas de todo su equipo
        double totalVentasEquipo = 0;
        for (Vendedor vendedor : equipo) {
            for (TicketVenta ticket : vendedor.getVentasDesde(fechaDesde)) {
                totalVentasEquipo += ticket.getPrecioUnitario();
            }
        }
        double comisionEquipo = totalVentasEquipo * porcentaje;

        return comisionPropia + comisionEquipo;
    }
}