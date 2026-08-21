package Ejercicio_06;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // 1. Creamos la Comunidad Autónoma y el Parque
        ComunidadAutonoma mendoza = new ComunidadAutonoma("Mendoza", "Dirección de Recursos Naturales");
        ParqueNacional aconcagua = new ParqueNacional("Parque Provincial Aconcagua", LocalDate.of(1983, 4, 15));

        mendoza.agregarParque(aconcagua);
        System.out.println("Bienvenido al " + aconcagua.getNombre());

        // 2. Creamos Áreas y Entradas
        Area valleHorcones = new Area("Valle de Horcones", 150.5);
        Entrada entradaPrincipal = new Entrada(1);

        aconcagua.agregarArea(valleHorcones);
        aconcagua.agregarEntrada(entradaPrincipal);

        // 3. Creamos Especies (Flora y Fauna)
        EspecieAnimal puma = new EspecieAnimal("Puma concolor", "Puma andino", "Invierno", TipoAlimentacion.CARNIVORO);
        EspecieVegetal coiron = new EspecieVegetal("Festuca gracillima", "Coirón", false, "Ninguno");

        puma.agregarAlimento(coiron); // Aunque el puma es carnívoro, lo agregamos para probar la relación

        // Censamos cuántos hay en el área
        valleHorcones.registrarCenso(puma, 12);
        valleHorcones.registrarCenso(coiron, 5000);

        // 4. Personal con múltiples Roles (El patrón que pedía el enunciado)
        Personal juanPerez = new Personal("12345678", "Juan Perez", aconcagua);

        // A Juan lo hacemos Celador de la entrada 1
        Celador rolCelador = new Celador(entradaPrincipal);
        juanPerez.agregarRol(rolCelador);

        // Y a la vez, Juan es Investigador
        Investigador rolInvestigador = new Investigador("Licenciado en Biología");
        juanPerez.agregarRol(rolInvestigador);

        aconcagua.agregarEmpleado(juanPerez);
        System.out.println("Empleado registrado: " + juanPerez.getNombre() + " (Tiene asignados múltiples roles)");

        // 5. Simulamos la visita de un turista
        Visitante turista = new Visitante("98765432", "Carlos Gómez", "Calle Falsa 123", "Ingeniero");
        RegistroVisita ingreso = rolCelador.registrarIngreso(turista, LocalDate.now());

        System.out.println("El visitante " + turista.getNombre() + " ingresó exitosamente al parque.");
    }
}