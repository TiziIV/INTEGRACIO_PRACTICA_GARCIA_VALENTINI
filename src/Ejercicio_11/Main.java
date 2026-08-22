package Ejercicio_11;
import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 1. Crear empresa con un 10% de comision (0.10)
        Empresa cosmetica = new Empresa("Cosmetica Natural SA", 0.10);

        // 2. Crear productos
        Producto crema = new Producto("Crema Anti-Age", 15000.0);
        Producto perfume = new Producto("Perfume Floral", 25000.0);
        cosmetica.agregarProducto(crema);
        cosmetica.agregarProducto(perfume);

        // 3. Crear la fuerza de ventas
        Lider ana = new Lider("Ana Lopez", "Calle Falsa 123", "1111", LocalDate.of(1985, 5, 20), "27-1111-9", LocalDate.of(2015, 1, 10), LocalDate.of(2020, 3, 15));
        Vendedor pablo = new Vendedor("Pablo Perez", "Av San Martin 742", "2222", LocalDate.of(1990, 8, 14), "20-2222-9", LocalDate.of(2021, 5, 1));

        // Pablo entra al equipo de Ana
        ana.agregarVendedorAlEquipo(pablo);

        // 4. Crear un cliente
        Cliente marta = new Cliente("Marta Gomez", "Mitre 456", "3333", LocalDate.of(1975, 12, 10), LocalDate.now());

        // 5. Simular ventas de hoy (el Vendedor vende una crema, la Lider vende un perfume)
        TicketVenta ticketPablo = new TicketVenta(LocalDate.now(), crema.getPrecioVentaPublico(), crema);
        ticketPablo.asignarCliente(marta);
        pablo.registrarTicketVenta(ticketPablo);

        TicketVenta ticketAna = new TicketVenta(LocalDate.now(), perfume.getPrecioVentaPublico(), perfume);
        ticketAna.asignarCliente(marta);
        ana.registrarTicketVenta(ticketAna);

        // 6. Celebrar reunion (simulamos que la ultima fue hace 15 dias)
        LocalDate fechaUltimaReunion = LocalDate.now().minusDays(15);
        LocalDate fechaProxima = LocalDate.now().plusDays(15);
        ReunionGeneral reunion = cosmetica.celebrarReunion(fechaUltimaReunion, fechaProxima);

        // 7. Liquidar las comisiones del mes
        cosmetica.liquidarComisiones(reunion, Arrays.asList(ana, pablo));
    }
}