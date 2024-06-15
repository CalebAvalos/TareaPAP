package src;

public class Estudiante {

	protected String nombre;
	protected double[] calificaciones;
	
	public Estudiante(String nombre, double[] calificaciones) {
		this.nombre = nombre;
		this.calificaciones = calificaciones;
	}
	
	public double calcularPromedio() {
		int suma = 0;
		for (double calificacion:calificaciones) {
			suma+=calificacion;
		}
		return (double) suma/calificaciones.length;
	}
	public double calcularMax() {
		double max = calificaciones[0];
		for (double calificacion:calificaciones) {
			if (calificacion>max) {
				max=calificacion;
			}
		}
		return max;
	}
	public double calcularMin() {
		double min = calificaciones[0];
		for (double calificacion:calificaciones) {
			if (calificacion<min) {
				min=calificacion;
			}
		}
		return min;
	}
	public void mostrarinformacion() {
		System.out.println("Estudiante: "+nombre);
		System.out.println("Promedio de notas: "+calcularPromedio());
		System.out.println("Calificación más alta: "+calcularMax());
		System.out.println("Calificación más baja: "+calcularMin());
	}
}
