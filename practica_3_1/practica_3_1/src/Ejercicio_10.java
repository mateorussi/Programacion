import java.util.Scanner;
/**
 * Introducimos dos números por teclado y queremos guardar el valor mayor en 
 * la variable MAYOR y el número menor en la variable MENOR.
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
		Scanner sc = new Scanner(System.in);
        System.out.println("Introduce 2 números");
        int num1= sc.nextInt(); int num2=sc.nextInt();
        if (num1>num2)
            System.out.println(num1+" es el mayor.");
        else
            System.out.println(num2+" es el mayor");
	}

}
