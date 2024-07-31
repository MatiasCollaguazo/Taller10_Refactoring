public class EmpleadoSistemas extends Empleado {
  
    public EmpleadoSistemas(String nombre, double salarioBase, int horasTrabajadas, double tarifaHora, String genero) {
        super(nombre, salarioBase, horasTrabajadas, tarifaHora, genero);
    }

    @Override
    protected double salarioPorDepartamento() {
        return 20;
    }

}