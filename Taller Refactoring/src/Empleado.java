public class Empleado {
    private String nombre;
    private double salarioBase;
    private int horasTrabajadas;
    private double tarifaHora;
    private String genero;

    public Empleado(){}
    public Empleado(String nombre, double salarioBase, int horasTrabajadas, double tarifaHora, String genero) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaHora = tarifaHora;
        this.genero = genero;

    }
// metodo 1 implementado
protected double salarioPorDepartamento() {
    return 0;
}

// metodo 2 implementado
public double horasExtra(double salarioBase){
    double extra = 0;
    if(horasTrabajadas > 40){
        extra = (horasTrabajadas - 40) * 50; // Pago de horas extra
    }

    return extra;
}

// metodo modificado
public double calcularSalario() {
    double salarioTotal = salarioBase + horasExtra(salarioBase) + salarioPorDepartamento();

    return salarioTotal;
}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getTarifaHora() {
        return tarifaHora;
    }

    public void setTarifaHora(double tarifaHora) {
        this.tarifaHora = tarifaHora;
    }

    public void imprimirDetalles() {
        System.out.println("Nombre: " + getNombre()+"\nGenero: " + getNombre()+
        "\nSalario: " + getSalarioBase()+"\nHoras trabajadas: " + getHorasTrabajadas()+"\nbonoAnual: " );
    }
}
