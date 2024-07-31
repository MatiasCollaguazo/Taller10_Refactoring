public class EmpleadoFijo extends Empleado {
    private double bonoAnual;

    public EmpleadoFijo(String nombre, double salarioBase, int horasTrabajadas, double bonoAnual, String genero) {
        super(nombre, salarioBase, horasTrabajadas, 0, genero);
        this.bonoAnual = bonoAnual;
    }
    
    public void imprimirDetalles() {
    	super().imprimirDetalles;
    	System.out.println("Bono Anual: " + getBonoAnual());
    }

    // Más metodos
}
