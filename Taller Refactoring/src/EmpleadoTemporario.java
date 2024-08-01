public class EmpleadoTemporario extends Empleado {
    private String nombre;
    private String genero;
    private double salarioBase;
    private int horasTrabajadas;
    private String departamento;
    private int mesesContrato;

    public EmpleadoTemporario(String nombre, double salarioBase, int horasTrabajadas, String departamento, int mesesContrato, String genero) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
        this.horasTrabajadas = horasTrabajadas;
        this.departamento = departamento;
        this.mesesContrato = mesesContrato;
        this.genero = genero;
    }
    
    public int getMesesContratados(){
        return mesesContrato;
    }

    public void imprimirDetalles() {
    	super.imprimirDetalles();
    	System.out.println("Meses Contratados: " + getMesesContratados());
    }

    // Más metodos
}
