package Ejercicio_11;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class RepresentanteVentas {
    protected String nombre;
    protected String direccion;
    protected String telefono;
    protected LocalDate fechaNacimiento;
    protected String cuitCuil;
    protected LocalDate fechaIncorporacion;
    protected List<Cliente> carteraClientes;
    protected List<TicketVenta> ticketsVendidos;

    public RepresentanteVentas(String nombre, String direccion, String telefono, LocalDate fechaNacimiento, String cuitCuil, LocalDate fechaIncorporacion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.cuitCuil = cuitCuil;
        this.fechaIncorporacion = fechaIncorporacion;
        this.carteraClientes = new ArrayList<>();
        this.ticketsVendidos = new ArrayList<>();
    }

    public String getNombre() { return nombre; }
    public String getCuitCuil() { return cuitCuil; }

    public void agregarCliente(Cliente cliente) {
        this.carteraClientes.add(cliente);
    }

    public void registrarTicketVenta(TicketVenta ticket) {
        this.ticketsVendidos.add(ticket);
    }

    public List<TicketVenta> getVentasDesde(LocalDate fechaDesde) {
        List<TicketVenta> ventasPeriodo = new ArrayList<>();
        for (TicketVenta ticket : ticketsVendidos) {
            // Se toman los tickets desde la fecha indicada en adelante
            if (!ticket.getFecha().isBefore(fechaDesde)) {
                ventasPeriodo.add(ticket);
            }
        }
        return ventasPeriodo;
    }

    public abstract double calcularComision(LocalDate fechaDesde, double porcentaje);
}