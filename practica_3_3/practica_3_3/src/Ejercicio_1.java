import java.util.Scanner;

/*
 * Capturamos un caracter y debemos indicar si est� en may�scula,
 * en min�scula, es un digito o cualquier otro car�ractica_3_3;

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
		
		char caracter;
		
		System.out.println("Escribe cualquier caracter");
		
		Scanner sc=new Scanner(System.in);
		caracter=sc.next().charAt(0);
		
		if (caracter>=97 && caracter<=122) {
			System.out.println("Es una minuscula");
		}else if (caracter>=65 && caracter<=90) {
			System.out.println("Es una mayuscula");
		}else if (caracter>=48 && caracter<=57) {
			System.out.println("Es un digito");
		}else {
			System.out.println("Es otro caracter");
		}	
	}

}
