package src;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] calificaciones= {10,2,3,9,10,8};
		Estudiante estudiante = new Estudiante ("Caleb",calificaciones);
		estudiante.mostrarinformacion();
		estudiante.calcularPromedio();
		estudiante.calcularMax();
		estudiante.calcularMin();
	}
}