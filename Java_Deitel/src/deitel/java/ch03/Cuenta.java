package deitel.java.ch03;

public class Cuenta {
	private String nombre;
	private double saldo;
	
	// El constructor inicializa nombre con el parámetro nombre
	public Cuenta(String nombre, double saldo) {
		this.nombre = nombre;
		if(saldo > 0.0)
			this.saldo = saldo;
	}
	
	public void depositar(double montoDeposito) {
		if(montoDeposito > 0.0)
			this.saldo = this.saldo + montoDeposito;
	}
	
	public double obtenerSaldo() {
		return this.saldo;
	}
	
	public void establecerNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String obtenerNombre() {
		return this.nombre;
	}
}
