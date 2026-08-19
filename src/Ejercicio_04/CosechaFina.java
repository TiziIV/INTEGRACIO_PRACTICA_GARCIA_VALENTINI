package Ejercicio_04;

public class CosechaFina extends Cereal {
    public CosechaFina(String nombre) {
        super(nombre);
    }

    @Override
    public boolean puedeSembrarseEn(Lote lote) {
        return lote.contieneTodosLosMinerales(this.getMineralesRequeridos());
    }
}