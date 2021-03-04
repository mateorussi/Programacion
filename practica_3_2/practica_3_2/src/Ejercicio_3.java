/**
 * Captura por teclado un numero y queremos que
 * nos pregunte la tabla de multiplicar de dicho numero.
 * Nosotros responderemos y el programa indicara si es
 * correcto o no, lo que hemos escrito.
 */

import java.util.Scanner;

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
		
		System.out.println("Ingrese un número");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		System.out.println("¿Cuál es la tabla de multiplicar de "+num);
		switch(num) {
			case 1: 
				if (num==1){
					int res1=num*1;
					}
			break;
				}
			
		for(int i=0;i<11;i++) {
			System.out.print(num+" x "+i+" = ");
			int res=sc.nextInt();
		}
		
	}

}
