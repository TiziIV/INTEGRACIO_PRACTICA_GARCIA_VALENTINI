package Ejercicio_05;

public class Main {
    public static void main(String[] args) {
        // 1. Creamos platos genéricos
        Plato milanesa = new Plato("Milanesa con Papas", "Milanesa de ternera frita con guarnición");
        Plato pizza = new Plato("Pizza Margarita", "Masa madre, salsa, mozzarella y albahaca");

        // 2. Creamos los restaurantes
        Restaurante bodegon = new Restaurante("El Bodegón del Tío");
        Restaurante pizzeria = new Restaurante("Pizzería Los Maestros");

        // 3. Creamos sucursales
        Sucursal sucBodegonCentro = new Sucursal("Av. San Martín 123", "444-1234", bodegon);
        bodegon.agregarSucursal(sucBodegonCentro);

        // 4. Los restaurantes arman su menú (y deciden el precio)
        bodegon.agregarPlato(milanesa, 8500.0);
        bodegon.agregarPlato(pizza, 7000.0);
        pizzeria.agregarPlato(pizza, 9500.0); // Misma pizza genérica, otro restaurante, otro precio

        // 5. Creamos una persona y definimos sus gustos
        Persona juan = new Persona("Juan");
        juan.frecuentarSucursal(sucBodegonCentro);

        // A Juan le gusta la milanesa específica del Bodegón
        // Obtenemos el plato servido del menú del bodegón y lo guardamos
        PlatoEnRestaurante milaDelBodegon = bodegon.getPlatos().get(0);
        juan.agregarPlatoPreferido(milaDelBodegon);

        // 6. Testeamos la validación del sistema
        System.out.println("¿A Juan le gusta la Milanesa del Bodegón?: " + juan.leGustaPlatoEn(milanesa, bodegon));

        // A Juan le podría gustar la pizza, pero NO la de la Pizzería Los Maestros
        System.out.println("¿A Juan le gusta la Pizza de Los Maestros?: " + juan.leGustaPlatoEn(pizza, pizzeria));
    }
}