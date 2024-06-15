package src;

public class Empleado {
	protected String codigo;
	protected String nombre;
	protected double salario;
	protected int horasTrabajo;
	
	public Empleado (String codigo, String nombre, int horasTrabajo) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.horasTrabajo = horasTrabajo;
	}
	
	public void calcularSalario() {
		salario = horasTrabajo*2.50;
	}
    public void mostrarInformacion() {
    	System.out.println("Codigo: "+ codigo);
    	System.out.println("Nombre: "+ nombre);
    	System.out.println("Salario: "+ salario);
   
    }
}
