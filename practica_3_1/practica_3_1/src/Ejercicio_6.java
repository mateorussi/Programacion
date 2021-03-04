import java.util.Scanner;
/**
 * Programa que lea 3 datos de entrada A, B y C. Estos corresponden a las 
 * dimensiones de los lados de un triángulo. El programa debe determinar que 
 * tipo de triangulo es, teniendo en cuenta los siguiente:
 * 
 * - Si se cumple Pitágoras entonces es triángulo rectángulo
 * - Si sólo dos lados del triángulo son iguales entonces es isósceles.
 * - Si los 3 lados son iguales entonces es equilátero.
 * - Si no se cumple ninguna de las condiciones anteriores, es escaleno.
 */

/**
 * @author mateorussi
 *
 */
public class Ejercicio_6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la longitud de los 3 lados de tu triángulo.");
        System.out.println("Lado A:");
        float a = sc.nextFloat();
        System.out.println("Lado B:");
        float b = sc.nextFloat();
        System.out.println("Lado C:");
        float c = sc.nextFloat();

        float mayor = 0;

        if ((a>=b)&&(a>=c))
            mayor = a;
        else if ((b>=a)&&(b>=c))
            mayor = b;
        else if ((c>=a)&&(c>=b))
            mayor = c;

        if ((Math.pow(mayor,2))==(Math.pow(a,2)+Math.pow(b,2)+Math.pow(c,2)-Math.pow(mayor,2)))
            System.out.println("Se trata de un triángulo rectángulo.");
        else if ((a==b)||(b==c)||(a==c)) {
            if ((a == b) && (b == c))
                System.out.println("Se trata de un triángulo equilátero.");
            else
                System.out.println("Se trata de un triángulo isósceles.");
        }
        else
            System.out.println("Se trata de un triángulo escaleno.");
	}

}
