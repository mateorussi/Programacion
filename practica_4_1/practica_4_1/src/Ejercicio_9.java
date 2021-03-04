import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JOptionPane;

/*
 * Crear un programa que lea por teclado un número entero y que almacene el mismo en un
 * array de modo que cada cifra ocupe un elemento del array. Ejemplo: si leo el número
 * 23451, se generará el array: 2	3	4	5	1
 */

/**
 * @author mateorussi
 *
 */
public class Ejercicio_9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Introduce un número entero");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int longitud = String.valueOf(num).length();
        int vector[] = new int[longitud];
        int mod = 10;
        int cont = 0;

        while (num % 10 != num) {
            vector[cont] = num % 10;
            num = (num - (num % 10)) / 10;
            cont = cont + 1;
        }
        vector[cont] = num;
        System.out.println(Arrays.toString(vector));	
	}

}
