import java.util.Arrays;
import java.util.Scanner;

/**
 * Realizar un programa Java que pida un numero entero positivo de 10 cifras,
 * y que compruebe si el numero es capicua
 */

/**
 * @author mateorussi
 *
 */
public class Ejercicio_10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Introduce un número de 10 cifras.");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int vector[] = new int[10];

        for (int i=0; i<10; i++){
            vector[i] = num % 10;
            num = (num - (num % 10)) / 10;
        }

        if (vector[0]==vector[9]) {
            if (vector[1] == vector[8]) {
                if (vector[2] == vector[7]) {
                    if (vector[3] == vector[6]) {
                        if (vector[4] == vector[5])
                            System.out.println("Es capicúa.");
                    }
                }
            }
        } else
            System.out.println("No es capicúa.");

        System.out.println(Arrays.toString(vector));
	}

}
