import java.util.Scanner;

/*
 * Escribir un programa que lea un anio indicar si es bisiesto.
 * Nota: un anio es bisiesto si es un numero divisible por 4, 
 * pero no si es divisible por 100, excepto que tambien sea divisible por 400ica_3_3;

import java.util.Scanner;

/**
 * @author bm10DAM1
 *
 */
public class Ejercicio_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int fecha;
		boolean es_bisiesto=false;
		int bisiesto=366, normal=365;
		
		System.out.println("Ingrese un año a evaluar");
		Scanner sc=new Scanner(System.in);
		fecha=sc.nextInt();
		
		
		if (fecha%4==0) {
			es_bisiesto=true;
			 if (fecha%100==0) {
				 es_bisiesto=false;
				 if (fecha%400==0) {
					 es_bisiesto=true;
				 }
			 }
		}
		
		if (es_bisiesto==true) {
			System.out.println("El año "+fecha+" es bisiesto");
		}else {
			System.out.println("El año "+fecha+" no es bisiesto");
		}
		}
		
	}
