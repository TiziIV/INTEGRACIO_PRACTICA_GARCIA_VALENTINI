package Ejercicio_09;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Museo louvre = new Museo("Museo del Louvre");

        ColeccionPermanente regimenPropio = new ColeccionPermanente(LocalDate.of(1793, 8, 10), 0, true);

        Artista daVinci = new Artista("Leonardo da Vinci", LocalDate.of(1452, 4, 15), LocalDate.of(1519, 5, 2), "Italia", "Renacimiento", "Renacentista", "Polimata florentino");

        Pintura monaLisa = new Pintura("P-001", "La Gioconda", "Retrato de Lisa Gherardini", 1503, "Italia", "Occidental", "Renacimiento", daVinci, regimenPropio, "Oleo", "Tabla de alamo", "Renacentista");

        louvre.agregarObjeto(monaLisa);

        ColeccionExterna museoPrado = new ColeccionExterna("Museo del Prado", "Museo Publico", "Arte espanol", "Madrid", "123456", "Director Prado");
        ObjetoEnPrestamo regimenPrestamo = new ObjetoEnPrestamo(LocalDate.now(), LocalDate.now().plusMonths(6), museoPrado);

        Escultura david = new Escultura("E-001", "Copia del David", "Replica", null, "Italia", "Occidental", "Renacimiento", null, regimenPrestamo, "Marmol", 5.17, 5600, "Renacentista");

        louvre.agregarObjeto(david);

        Exposicion expoRenacimiento = new Exposicion("Tesoros del Renacimiento", LocalDate.now(), LocalDate.now().plusMonths(3));
        expoRenacimiento.agregarObjetoExhibido(monaLisa);
        expoRenacimiento.agregarObjetoExhibido(david);

        louvre.crearExposicion(expoRenacimiento);

        System.out.println("Sistema ejecutado correctamente.");
    }
}