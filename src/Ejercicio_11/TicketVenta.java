package Ejercicio_11;
import java.time.LocalDate;

public class TicketVenta {
    private LocalDate fecha;
    private double precioUnitario;
    private Producto producto;
    private Cliente cliente; // Se puede asignar despues

    public TicketVenta(LocalDate fecha, double precioUnitario, Producto producto) {
        this.fecha = fecha;
        this.precioUnitario = precioUnitario;
        this.producto = producto;
    }

    public LocalDate getFecha() { return fecha; }
    public double getPrecioUnitario() { return precioUnitario; }
    public Producto getProducto() { return producto; }
    public Cliente getCliente() { return cliente; }

    public void asignarCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}