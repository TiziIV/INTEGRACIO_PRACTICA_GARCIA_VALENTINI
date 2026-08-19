package Ejercicio_04;

public class Pastura extends Cereal {
    public Pastura(String nombre) {
        super(nombre);
    }

    @Override
    public boolean puedeSembrarseEn(Lote lote) {
        // Para sembrar una pastura, debe tener los minerales Y NO haber tenido otra pastura previa
        return lote.contieneTodosLosMinerales(this.getMineralesRequeridos()) && !lote.tuvoPasturaPrevia();
    }
}