import java.util.Scanner;

/**
 * Mostrar en pantalla los N primeros numero primos.
 * Se pide por teclado la cantidad de numeros primos
 * que queremos mostrar.
 */

/**
 * @author mateorussi
 *
 */
public class Ejercicio_16 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int cont=0;
		
		System.out.println("Ingrese la cantidad de numeros primos que quiere saber");
		int cantPrim=sc.nextInt();
		
		int max=10000, contador = 0;
		
		do {
			for (int i = 0; i < max; i++) {
				if (esPrimo(i)) {
					contador++;
					System.out.println(i);
				}
			}
		}while(cantPrim!=contador);
	}

	public static boolean esPrimo(int numero) {
		// El 0, 1 y 4 no son primos
		if (numero == 0 || numero == 1 || numero == 4) {
			return false;
		}
		for (int x = 2; x < numero / 2; x++) {
			// Si es divisible por cualquiera de estos números, no
			// es primo
			if (numero % x == 0)
				return false;
		}
		// Si no se pudo dividir por ninguno de los de arriba, sí es primo
		return true;
	}

}
