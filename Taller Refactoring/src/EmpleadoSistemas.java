public class EmpleadoSistemas extends Empleado {
  
    public EmpleadoSistemas(String nombre, double salarioBase, int horasTrabajadas, String genero, double tarifaHora) {
        super(nombre, salarioBase, horasTrabajadas, genero, tarifaHora);
    }

    @Override
    protected double salarioPorDepartamento() {
        return 20;
    }

}