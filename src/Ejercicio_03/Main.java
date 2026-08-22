package Ejercicio_03;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 1. Armamos el país
        Pais argentina = new Pais("Argentina");

        // 2. Armamos una provincia
        Provincia mendoza = new Provincia("Mendoza");

        // 3. Creamos ciudades
        // Parámetros: nombre, habitantes, imp1, imp2, imp3, imp4, imp5, gastoMantenimiento

        // Ciudad auditable (>100k) y EN DÉFICIT (Recauda 500, gasta 1000)
        Ciudad guaymallen = new Ciudad("Guaymallen", 280000, 100, 100, 100, 100, 100, 1000);

        // Ciudad auditable (>100k) y SIN DÉFICIT (Recauda 1000, gasta 800)
        Ciudad godoyCruz = new Ciudad("Godoy Cruz", 190000, 200, 200, 200, 200, 200, 800);

        // Ciudad auditable (>100k) y EN DÉFICIT (Recauda 250, gasta 300)
        Ciudad lasHeras = new Ciudad("Las Heras", 200000, 50, 50, 50, 50, 50, 300);

        // Ciudad NO auditable (<100k). No debería contar para el % de la provincia.
        Ciudad uspallata = new Ciudad("Uspallata", 10000, 10, 10, 10, 10, 10, 500);

        // Agregamos las ciudades a la provincia
        mendoza.agregarCiudad(guaymallen);
        mendoza.agregarCiudad(godoyCruz);
        mendoza.agregarCiudad(lasHeras);
        mendoza.agregarCiudad(uspallata);

        // Agregamos la provincia al país
        argentina.agregarProvincia(mendoza);

        // --- PROBAMOS LA LÓGICA ---
        System.out.println("=== REPORTE DE DÉFICIT: " + argentina.getNombre() + " ===");

        // Ciudades con déficit
        List<Ciudad> ciudadesDeficit = argentina.getCiudadesConDeficit();
        System.out.println("\nCiudades a nivel nacional con déficit (auditables):");
        for (Ciudad c : ciudadesDeficit) {
            System.out.println("- " + c.getNombre());
        }

        // Provincias con déficit
        List<Provincia> provDeficit = argentina.getProvinciasConDeficit();
        System.out.println("\nProvincias en déficit (más del 50% de sus ciudades auditables están en rojo):");
        if (provDeficit.isEmpty()) {
            System.out.println("Ninguna. Todo en orden.");
        } else {
            for (Provincia p : provDeficit) {
                System.out.println("- " + p.getNombre());
            }
        }
    }
}