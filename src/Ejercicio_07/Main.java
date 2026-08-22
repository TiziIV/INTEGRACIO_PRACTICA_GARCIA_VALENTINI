package Ejercicio_07;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Iniciando test del sistema...");

        // 1. Crear Federacion y Estacion
        Federacion fedInvernal = new Federacion("Federacion Nacional de Esqui");
        EstacionEsqui cerro = new EstacionEsqui("EST-01", "Complejo Nevado");
        fedInvernal.agregarEstacion(cerro);

        // 2. Crear Pistas (Prueba del Patron Composite)
        Pista tramo1 = new Pista(101, 2.5, NivelDificultad.AZUL);
        Pista tramo2 = new Pista(102, 3.0, NivelDificultad.ROJA);

        Pista pistaPrincipal = new Pista(100, 0, NivelDificultad.NEGRA);
        pistaPrincipal.agregarSubpista(tramo1);
        pistaPrincipal.agregarSubpista(tramo2);
        cerro.agregarPista(pistaPrincipal);

        System.out.println("Pista creada: " + pistaPrincipal.getCodigoCompleto());
        System.out.println("Longitud total calculada: " + pistaPrincipal.getLongitudKm() + " km");

        // 3. Crear un Esquiador
        Esquiador esquiador1 = new Esquiador("ESQ-99", "45123456", "Tomas Sanchez", LocalDate.of(2003, 8, 14), fedInvernal);
        System.out.println("Esquiador registrado: " + esquiador1.getNombre() + " (Edad: " + esquiador1.getEdad() + " anos)");

        // 4. Crear Campeonato y Prueba
        Campeonato mundial = new Campeonato("Mundial Alpino");
        PruebaIndividual slalom = new PruebaIndividual("Slalom Gigante", "Descenso", cerro);
        mundial.agregarPrueba(slalom);

        // 5. Simular la Participacion
        ParticipacionPrueba participacion = new ParticipacionPrueba(15, esquiador1, slalom);
        System.out.println("Inscripcion completada. Codigo de dorsal: " + participacion.getCodigoParticipacion());

        // 6. Registrar resultados y definir el vencedor
        participacion.registrarResultado(145.2, 1);
        slalom.registrarVencedor(esquiador1, 145.2);

        System.out.println("Vencedor de la prueba '" + slalom.getNombre() + "': " + esquiador1.getNombre());
    }
}