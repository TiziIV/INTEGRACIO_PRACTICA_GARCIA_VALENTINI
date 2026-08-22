package Ejercicio_07;

public abstract class Participante {
    protected String codigo;

    public Participante(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }
}