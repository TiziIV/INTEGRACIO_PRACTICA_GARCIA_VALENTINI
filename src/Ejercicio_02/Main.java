package Ejercicio_02;

public class Main {
    public static void main(String[] args) {
        // 1. Creamos el Continente
        Continente america = new Continente("América");

        // 2. Creamos Países
        Pais argentina = new Pais("Argentina");
        Pais chile = new Pais("Chile");

        america.agregarPais(argentina);
        america.agregarPais(chile);

        argentina.agregarLimite(chile);
        chile.agregarLimite(argentina);

        // 3. Creamos Provincias y Ciudades
        Provincia mendoza = new Provincia("Mendoza");
        Ciudad capitalMendoza = new Ciudad("Ciudad de Mendoza");

        mendoza.agregarCiudad(capitalMendoza);
        mendoza.setCapital(capitalMendoza);
        mendoza.agregarLimitePais(chile); // Mendoza limita con Chile

        // 4. Asignamos la provincia y capital al País
        argentina.agregarProvincia(mendoza);

        Ciudad buenosAires = new Ciudad("Ciudad Autónoma de Buenos Aires");
        argentina.setCapital(buenosAires);

        // 5. Mostramos los datos por consola para verificar
        System.out.println("País: " + argentina.getNombre());
        System.out.println("Capital: " + argentina.getCapital().getNombre());
        System.out.println("Provincia registrada: " + argentina.getProvincias().get(0).getNombre());
        System.out.println("La provincia " + mendoza.getNombre() + " limita con el país: " + mendoza.getLimitesPaises().get(0).getNombre());
    }
}