package Ejercicio_03;

public class Ciudad {
    private String nombre;
    private int habitantes;
    private double imp1;
    private double imp2;
    private double imp3;
    private double imp4;
    private double imp5;
    private double gastoMantenimiento;

    public Ciudad(String nombre, int habitantes, double imp1, double imp2, double imp3, double imp4, double imp5, double gastoMantenimiento) {
        this.nombre = nombre;
        this.habitantes = habitantes;
        this.imp1 = imp1;
        this.imp2 = imp2;
        this.imp3 = imp3;
        this.imp4 = imp4;
        this.imp5 = imp5;
        this.gastoMantenimiento = gastoMantenimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public int getHabitantes() {
        return habitantes;
    }

    // Regla: Solo entran en auditoría si tienen más de 100.000 habitantes
    public boolean esAuditable() {
        return this.habitantes > 100000;
    }

    // Recaudación Total = suma de los 5 impuestos
    public double calcularTotalRecaudado() {
        return imp1 + imp2 + imp3 + imp4 + imp5;
    }

    // Déficit: gasta más de lo que recauda
    public boolean estaEnDeficit() {
        return gastoMantenimiento > calcularTotalRecaudado();
    }
}