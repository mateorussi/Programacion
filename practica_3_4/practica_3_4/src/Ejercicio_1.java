/**
 * Practica con switch.
 * Vamos a realizar las operaciones b?sicas de una calculadora.
 * Se capturar?n por teclado un operador aritm?tico y dos valores num?ricos.
 * Para pedir el operador mostraremos el siguiente men?, y pediremos que
 * se introduzca el n?mero que corresponda a la operaci?n que queremos
 * realizar.
 * 1. + 3. * 5. (MOD) Resto divisi?n entera
 * 2. ? 4. / 6. Divisi?n entera
 * Debemos mostrar un mensaje con la operaci?n realizada y su resultado. 
 */

import java.util.Scanner;

/**
 * @author bm10DAM1
 *
 */
public class Ejercicio_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Ingrese los dos operandos para el c�lculo ");
		double opr1=sc.nextInt();
		double opr2=sc.nextInt();
		
		System.out.println("Ingrese el operador para el c�lculo:"
				+ "\n1. +"
				+ "\n2. -"
				+ "\n3. *"
				+ "\n4. /"
				+ "\n5. (MOD)"
				+ "\n6. Division entera ");
		int opr3=sc.nextInt();
		switch (opr3)
		{
			case 1: 
				double resultado1=(opr1+opr2);
				System.out.println("La operacion realizada es la suma y el resultado es "+resultado1);
				break;
			case 2: 
				double resultado2=(opr1-opr2);
				System.out.println("La operacion realizada es la resta y el resultado es "+resultado2);
				break;
			case 3: 
				double resultado3=opr1*opr2;
				System.out.println("La operacion realizada es la multiplicacion y el resultado es "+resultado3);
				break;
			case 4: 
				double resultado4=opr1/opr2;
				System.out.println("La operacion realizada es la divisi�n y el resultado es "+resultado4);
				break;
			case 5: 
				double resultado5=opr1%opr2;
				System.out.println("La operacion realizada es el c�lculo del resto de una divisi�n y el resultado es "+resultado5);
				break;
			case 6: 
				int resultado6=(int) (opr1/opr2); //Fuerza a redondear resultado a un entero positivo
				System.out.println("La operacion realizada es la divisi�n entera y el resultado es "+resultado6);
				break;
		}
	}

}
