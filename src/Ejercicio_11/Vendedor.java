package Ejercicio_11;
import java.time.LocalDate;

public class Vendedor extends RepresentanteVentas {

    public Vendedor(String nombre, String direccion, String telefono, LocalDate fechaNacimiento, String cuitCuil, LocalDate fechaIncorporacion) {
        super(nombre, direccion, telefono, fechaNacimiento, cuitCuil, fechaIncorporacion);
    }

    @Override
    public double calcularComision(LocalDate fechaDesde, double porcentaje) {
        double totalVentas = 0;
        for (TicketVenta ticket : getVentasDesde(fechaDesde)) {
            totalVentas += ticket.getPrecioUnitario();
        }
        return totalVentas * porcentaje;
    }
}