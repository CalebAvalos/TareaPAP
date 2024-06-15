package src;

public class Carro implements Vehiculo{

	protected String marca;
	
	public Carro(String marca) {
		this.marca = marca;
	}
	@Override
	public void arrancar() {
		System.out.println("El vehiculo está arrancando");
	}
	
	@Override
	public void acelerar() {
		System.out.println("El vehiculo está Acelerado");
	}
	
	@Override
	public void frenar() {
		System.out.println("El vehiculo está frenando");
	}
	public void mostrarInformacion() {
		System.out.println("Marca: "+marca);
	}
}
