import javax.swing.JOptionPane;
import javax.swing.*;

/**
 * Realizar programa Java que permita cargar un vector numerico de 10 elementos
 * desde teclado y, posteriormente visualice el valor del elemento mayor y
 * cuantas veces se repite en el vector este valor maximo. Utiliza JOptionPane.
 */

/**
 * @author mateorussi
 *
 */
public class Ejercicio_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] vector = new int[10];
		
		for (int i=0;i<vector.length;i++) {
			
			vector[i]=Integer.parseInt(JOptionPane.showInputDialog("Introduzca un valor para el elemento "+i));
		}
		
		int mayor=vector[0];
		//Determinar mayor
		for (int x=1;x<vector.length;x++) {
			if(vector[x]>mayor) {
				mayor=vector[x];
			}
		}
		//Determinar repeticiones del mayor
		int cont=0;
		for (int j=0;j<vector.length;j++) {
			if (vector[j]==mayor) {
				cont++;
			}
		}
		JOptionPane.showMessageDialog(null, "El valor del elemento mayor es "+mayor+" y se repitio "+cont+" veces");

	}

}
