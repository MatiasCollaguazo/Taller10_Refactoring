public class EmpleadoPorHoras extends Empleado {
    private double tarifaHora;


    public EmpleadoPorHoras(String nombre, int horasTrabajadas, double tarifaHora, String genero) {
        super(nombre, 0, horasTrabajadas, genero);
        this.tarifaHora = tarifaHora;
        super.setSalarioBase(calcularSalario());
    }

    @Override
    public double calcularSalario() {
        return super.getHorasTrabajadas() * getTarifaHora();
    }

    
    public double getTarifaHora() {
        return tarifaHora;
    }

    public void setTarifaHora(double tarifaHora) {
        this.tarifaHora = tarifaHora;
    }

    // Más metodos
}