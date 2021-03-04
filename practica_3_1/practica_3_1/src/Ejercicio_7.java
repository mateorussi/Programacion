import java.util.Scanner;
/**
 * Escribir un programa que lea un año indicar si es bisiesto. Nota: un año es
 * bisiesto si es un número divisible por 4, pero no si es divisible por 100, excepto 
 * que también sea divisible por 400.
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
		Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un año");
        int year = sc.nextInt();
        while (year < 1582){
            System.out.println("Antes de que el papa Gregorio XIII introdujese su calendario en el 1582, los años bisiestos no existían. Introduce una fecha posterior.");
            year = sc.nextInt();
        }
        if ((year%4==0)&&(year%100==0)&&(year%400!=0)){
            System.out.println("Ese año no es bisiesto");
        } else if ((year%4==0)||(year%400==0))
            System.out.println("Ese año es bisiesto");
        else
            System.out.println("Ese año no es bisiesto");

	}

}
