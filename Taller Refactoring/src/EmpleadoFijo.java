public class EmpleadoFijo extends Empleado {
    private double bonoAnual;
    private String genero;

    public EmpleadoFijo(String nombre, double salarioBase, int horasTrabajadas, double bonoAnual, String genero) {
        super(nombre, salarioBase, horasTrabajadas, 0);
        this.bonoAnual = bonoAnual;
        this.genero = genero;
    }

    // Más metodos
}
