import java.util.Arrays;
import java.util.Scanner;

/**
 * Realizar programa Java que permita cargar por teclado un vector numerico
 * TB_NUM[100], posteriormente, introducir por teclado una posici�n,
 * elimine del vector num�rico el elemento que se encuentre en dicha posici�n
 * y visua1ice el vector sin ese elemento.
 * 
 * Nota: Eliminar un elemento de un vector supone desplazar una posici�n hacia la
 * izquierda el resto de elementos posteriores
 */

/**
 * @author mateorussi
 *
 */
public class Ejercicio_8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int vector[] = new int[100];
        for (int i =0; i<vector.length;i++)
            vector[i]=i+1;

        System.out.println("¿Qué posición deseas eliminar?");
        Scanner sc = new Scanner(System.in);
        int pos = sc.nextInt();

        vector[pos-1]=0;
        System.out.println(Arrays.toString(vector));
		
	}

}
