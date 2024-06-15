package src;

public class Persona {
	private String nombre;
	private int edad;
	private String direccion;
	
	public Persona (String nombre, int edad, String direccion) {
		        this.nombre = nombre;
				this.edad = edad;
				this.direccion = direccion;
	}
	
	public void mostrarInformacion() {
		System.out.println ("Nombre: "+ nombre);
		System.out.println ("Edad: "+ edad);
		System.out.println ("direccion: "+ direccion);
	}
    public void actualizarDireccion(String direccion) {
    	this.direccion = direccion;
    	System.out.println("Dirreción actualizada con éxito");
    }
}
