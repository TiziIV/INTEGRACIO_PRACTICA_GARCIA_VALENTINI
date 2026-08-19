package Ejercicio_04;

import java.util.ArrayList;
import java.util.List;

public class Cooperativa {
    private List<Cereal> cerealesDisponibles;

    public Cooperativa() {
        this.cerealesDisponibles = new ArrayList<>();
    }

    public void agregarCerealAlCatalogo(Cereal cereal) {
        cerealesDisponibles.add(cereal);
    }

    // Este es el sistema de recomendación que pide el enunciado
    public List<Cereal> getCerealesAptosParaLote(Lote lote) {
        List<Cereal> aptos = new ArrayList<>();

        for (Cereal cereal : cerealesDisponibles) {
            // Polimorfismo en acción: llama al método de la clase hija que corresponda
            if (cereal.puedeSembrarseEn(lote)) {
                aptos.add(cereal);
            }
        }

        return aptos;
    }
}