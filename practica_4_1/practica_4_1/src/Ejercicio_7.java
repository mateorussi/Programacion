import java.util.Arrays;
import java.util.Scanner;

/**
 * Realizar un programa Java que permita cargar por teclado un vector numerico TB_NUM[100],
 * posteriormente, introducir un valor desde teclado e intercalarlo en su posicion correcta
 * dentro del vector numerico supuestamente ordenado, y visualice finalmente el vector
 * con el dato intercalado. El valor antiguo que estaba en la posicion en la que se inserta se pierde.
 */

/**
 * @author mateorussi
 *
 */
public class Ejercicio_7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		  int vector[] = new int[100];
	        for (int i =0; i<vector.length;i++)
	            vector[i]=i+1;

	        System.out.println("¿Qué posición deseas cambiar?");
	        Scanner sc = new Scanner(System.in);
	        int pos = sc.nextInt();
	        System.out.println("¿Qué número deseas introducir?");
	        vector[pos-1] = sc.nextInt();
	        System.out.println(Arrays.toString(vector));

	
	}
}
