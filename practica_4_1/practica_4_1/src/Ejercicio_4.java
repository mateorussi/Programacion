import javax.swing.JOptionPane;

/**
 * Realizar programa Java que permita cargar un vector numerico de 10 elementos
 * desde teclado y, posteriormente visualice la media de los elementos que se
 * encuentran en las posiciones pares (0,2,4,....) y la media de los elementos
 * que se encuentran en las posiciones impares(1, 3, 5.....) del vector. La tabla
 * solo debe ser recorrida una vez.
 */


/**
 * @author mateorussi
 *
 */
public class Ejercicio_4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] vector=new int[10];
		int num_par=0, num_impar=0, cont_par=0, cont_impar=0;
		float media_par=0, media_impar=0;
		
		for(int i=0;i<vector.length;i++) {
			vector[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
			if(i%2==0) {
				num_par+=vector[i];
				cont_par++;
			}else {
				num_impar+=vector[i];
				cont_impar++;
			}
		}
		
		media_par=(float) num_par/cont_par;
		media_impar=(float) num_impar/cont_impar;
		
		System.out.println("La media de los elementos de las posiciones pares es "+media_par);
		System.out.println("La media de los elementos de las posiciones impares es "+media_impar);
	}

}
