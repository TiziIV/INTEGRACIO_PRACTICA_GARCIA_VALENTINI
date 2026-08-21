package Ejercicio_10;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // 1. Creamos la Sede Olímpica
        SedeOlimpica tokio2020 = new SedeOlimpica("Tokio 2020", 15000000.0);

        // 2. Creamos Complejos (Aplicando Polimorfismo/Herencia)
        ComplejoUnicoDeporte velodromo = new ComplejoUnicoDeporte("Velódromo Izu", "Shizuoka", "Tanaka San", 27000.0, "Ciclismo de pista");
        Polideportivo estadioNacional = new Polideportivo("Estadio Olímpico de Tokio", "Kasumigaoka", "Yamamoto San", 192000.0, 4);

        tokio2020.agregarComplejo(velodromo);
        tokio2020.agregarComplejo(estadioNacional);

        System.out.println("La sede " + tokio2020.getNombre() + " tiene " + tokio2020.getNumeroComplejos() + " complejos.");

        // 3. Áreas designadas para el polideportivo
        AreaDesignada pistaAtletismo = new AreaDesignada("Pista Central", "Atletismo", "Centro");
        AreaDesignada sectorSaltos = new AreaDesignada("Sector de Saltos", "Salto con Pértiga", "Esquina N-E");

        estadioNacional.agregarArea(pistaAtletismo);
        estadioNacional.agregarArea(sectorSaltos);

        // 4. Creamos un Evento y sus Materiales
        Evento finalCienMetros = new Evento("Final 100m Masculino", LocalDate.of(2021, 8, 1), 10, 8, 3);

        Material tacosSalida = new Material("MAT-01", "Tacos de salida", 8);
        finalCienMetros.agregarMaterial(tacosSalida);

        estadioNacional.programarEvento(finalCienMetros);

        // 5. Asignamos Comisarios al Evento
        Comisario juez1 = new Comisario("11223344", "Pierluigi Collina");
        Comisario juez2 = new Comisario("55667788", "Horacio Elizondo");

        finalCienMetros.asignarComisario(juez1);
        finalCienMetros.asignarComisario(juez2);

        System.out.println("\nEvento: " + finalCienMetros.getNombre());
        System.out.println("¿Tiene comisarios suficientes? " + (finalCienMetros.tieneComisariosSuficientes() ? "Sí" : "No, faltan."));

        // Comprobamos la relación inversa (el comisario sabe en qué evento está)
        System.out.println("El comisario " + juez1.getNombre() + " está asignado a: " + juez1.getEventosInvolucrado().get(0).getNombre());
    }
}