public class EmpleadoPorHoras extends Empleado {

    public EmpleadoPorHoras(String nombre, int horasTrabajadas, double tarifaHora, String genero) {
        super(nombre, 0, horasTrabajadas, tarifaHora, genero);
        super.setSalarioBase(calcularSalario());
    }

    @Override
    public double calcularSalario() {
        return super.getHorasTrabajadas() * super.getTarifaHora();
    }

    // Más metodos
}