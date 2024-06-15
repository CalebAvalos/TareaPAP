package src;

public class Gerente extends Empleado {
	private double bono;
	private String departamento;
	
	
	public Gerente(String codigo, String nombre, int horasTrabajo, double bono, String departamento) {
		super(codigo, nombre, horasTrabajo);
		this.bono = bono;
	    this.departamento = departamento;
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public void calcularSalario() {
		salario = (horasTrabajo*7)+bono;
	}
	@Override
	public void mostrarInformacion() {
		System.out.println("Codigo: "+codigo);
		System.out.println("nombre: "+nombre);
		System.out.println("departamento: "+departamento);
		System.out.println("Bonificación: "+bono);
		System.out.println("Salario: "+salario);
	}
}
