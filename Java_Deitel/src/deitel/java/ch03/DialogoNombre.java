package deitel.java.ch03;
import javax.swing.JOptionPane;


public class DialogoNombre {
	public static void main(String[] args) {
		String nombre = JOptionPane.showInputDialog("¿Cuál es tu nombre?");
		String mensaje = String.format("Bienvenido %s a la programación Java", nombre);
		JOptionPane.showMessageDialog(null, mensaje);
	}

}
