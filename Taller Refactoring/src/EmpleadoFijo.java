public class EmpleadoFijo extends Empleado {
    private double bonoAnual;

    public EmpleadoFijo(String nombre, double salarioBase, int horasTrabajadas, double bonoAnual, String genero) {
        super(nombre, salarioBase, horasTrabajadas, 0, genero);
        this.bonoAnual = bonoAnual;
    }

    // Más metodos
}
