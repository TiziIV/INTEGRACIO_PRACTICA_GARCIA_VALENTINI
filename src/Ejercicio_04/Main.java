package Ejercicio_04;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 1. Crear la Cooperativa
        Cooperativa cooperativa = new Cooperativa();

        // 2. Crear Minerales
        Mineral nitrogeno = new Mineral("Nitrógeno", TipoMineral.PRIMARIO);
        Mineral fosforo = new Mineral("Fósforo", TipoMineral.PRIMARIO);
        Mineral calcio = new Mineral("Calcio", TipoMineral.SECUNDARIO);

        // 3. Crear Cereales y definir sus requerimientos
        CosechaGruesa maiz = new CosechaGruesa("Maíz");
        maiz.agregarMineralRequerido(nitrogeno);
        maiz.agregarMineralRequerido(fosforo);

        Pastura alfalfa = new Pastura("Alfalfa");
        alfalfa.agregarMineralRequerido(calcio);

        cooperativa.agregarCerealAlCatalogo(maiz);
        cooperativa.agregarCerealAlCatalogo(alfalfa);

        // 4. Crear Lote y agregarle minerales a su tierra
        Lote lote1 = new Lote("Lote Norte");
        lote1.agregarMineral(nitrogeno);
        lote1.agregarMineral(fosforo);
        lote1.agregarMineral(calcio);

        // Imprimir si el lote es especial (tiene Nitrógeno y Fósforo que son primarios)
        System.out.println("¿El " + lote1.getNombre() + " es especial?: " + lote1.esEspecial());

        // 5. Ver qué cereales aconseja la cooperativa para el lote virgen
        List<Cereal> recomendados = cooperativa.getCerealesAptosParaLote(lote1);
        System.out.println("\nCereales aptos iniciales:");
        for (Cereal c : recomendados) {
            System.out.println("- " + c.getNombre());
        }

        // 6. Sembramos alfalfa (Pastura) en el lote y volvemos a consultar
        System.out.println("\nSembrando Alfalfa...");
        lote1.sembrar(alfalfa);

        List<Cereal> recomendadosPostPastura = cooperativa.getCerealesAptosParaLote(lote1);
        System.out.println("Cereales aptos después de tener pastura previa:");
        for (Cereal c : recomendadosPostPastura) {
            System.out.println("- " + c.getNombre());
        }
        // Acá vas a ver que el Maíz sigue apareciendo, pero la Alfalfa ya no se aconseja.
    }
}