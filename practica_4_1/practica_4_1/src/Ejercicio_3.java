import javax.swing.JOptionPane;

/**
 * Realizar un programa Java que inicialice un array numerico de 10 elementos
 * y visualizar los elementos que sean par y la posicion en que se encuentra.
 */

/**
 * @author mateorussi
 *
 */
public class Ejercicio_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] vector=new int[10];
				
		for(int i=0;i<vector.length;i++) {
			vector[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor para el vector"));
		}
		
		System.out.println("Pares:");
		for(int j=0;j<vector.length;j++) {
			if(vector[j]%2==0) {
				System.out.println(vector[j]+" posicion "+j);
			}
		}
	}

}
