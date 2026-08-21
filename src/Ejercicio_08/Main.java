package Ejercicio_08;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // 1. Creamos tipos de avión y el Hangar
        TipoAvion boeing737 = new TipoAvion("737-800", 189, 41413.0);
        TipoAvion cessna172 = new TipoAvion("172 Skyhawk", 4, 767.0);

        Hangar hangar1 = new Hangar(1, 10, "Sector Norte");

        // 2. Creamos los aviones y los asignamos al hangar
        Avion avionComercial = new Avion("LV-BOU", boeing737);
        Avion avionPrivado = new Avion("LV-XYZ", cessna172);

        hangar1.agregarAvion(avionComercial);
        hangar1.agregarAvion(avionPrivado);

        System.out.println("Avión " + avionComercial.getMatricula() + " guardado en el hangar " + hangar1.getNumero());

        // 3. Creamos Personas usando Herencia
        Propietario empresa = new Propietario("11-2222-3", "Aerolíneas Argentinas", "Aeroparque", "0810-222-86527");
        Mecanico jorge = new Mecanico("20-3333-4", "Jorge Mecánico", "Calle 123", "11223344", 150000.0, "Mañana");
        Piloto carlos = new Piloto("20-5555-6", "Carlos Piloto", "Av Siempreviva", "11556677", "LIC-9988", "Lentes");

        // 4. Habilitaciones y Propiedad
        jorge.autorizarTipoAvion(boeing737); // Jorge solo puede arreglar Boeings
        carlos.autorizarTipoAvion(boeing737);

        PropiedadAvion compra = new PropiedadAvion(LocalDate.of(2015, 5, 10), true, empresa, avionComercial);
        avionComercial.registrarPropiedad(compra);

        // 5. Simular un servicio de mantenimiento validando la habilitación
        if (jorge.puedeMantener(avionComercial.getTipo())) {
            Servicio cambioAceite = new Servicio(LocalDate.now(), 4.5, "Mantenimiento Preventivo", jorge, avionComercial);
            avionComercial.registrarServicio(cambioAceite);
            System.out.println("Servicio realizado con éxito al avión " + avionComercial.getMatricula() + " por " + jorge.getNombre());
        } else {
            System.out.println("Error: El mecánico no está autorizado para este tipo de avión.");
        }
    }
}