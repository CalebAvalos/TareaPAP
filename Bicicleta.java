package src;

public class Bicicleta implements Vehiculo {

	protected String marca;
	
	public Bicicleta(String marca) {
		this.marca = marca;
	}
	
	
	@Override
	public void arrancar() {
		System.out.println("Comienzas a pedalear");
	}
	
	@Override
	public void acelerar() {
		System.out.println("Pedalea más rápido!");
	}
	
	@Override
	public void frenar() {
		System.out.println("La bici está frenando");
	}
	public void mostrarInformacion() {
		System.out.println("Marca: "+marca);
	}
}
