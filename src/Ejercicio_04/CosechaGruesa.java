package Ejercicio_04;

public class CosechaGruesa extends Cereal {
    public CosechaGruesa(String nombre) {
        super(nombre);
    }

    @Override
    public boolean puedeSembrarseEn(Lote lote) {
        return lote.contieneTodosLosMinerales(this.getMineralesRequeridos());
    }
}