package deitel.java.ch03;

public class Cuenta {
	private String nombre;
	
	// El constructor inicializa nombre con el parámetro nombre
	public Cuenta(String nombre) {
		this.nombre = nombre;
	}
	
	public void establecerNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String obtenerNombre() {
		return this.nombre;
	}
}
