import java.util.Scanner;

/**
 * Pedir el dia, mes y anio de una fecha e indicar si es correcta.
 * Una fecha es correcta si:
 * El dia es mayor que 0 y menor que el numero de dias que tenga el mes
 * El mes debe estar comprendido entre 1 y 12
 * Si el anio es bisiesto, febrero tiene 29 d?as.
 */


/**
 * @author bm10DAM1
 *
 */
public class Ejercicio_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int dia, mes, anio;
		System.out.println("Ingrese dia, mes y año de una fecha");
		dia=sc.nextInt();
		mes=sc.nextInt();
		anio=sc.nextInt();
		
		int pd = 0, pm = 0, pa = 0, comprobar;
		
		if(mes==01 || mes==03 || mes==05 || mes==07 || mes==8 || mes==10 || mes==12) {
			if (dia>0 && dia<=31) {
				pd++;
			}
		}else if(mes==04 || mes==06 || mes==9 || mes==11) {
			if (dia>0 && dia<=30) {
				pd++;
			}
		}else if(mes==02){
			if(anio % 4 == 0 && anio % 100 != 0 || anio % 400 == 0) {
				if(dia>0 && dia<=29) {
					pd++;
				}
			}else {
				if(dia>0 && dia<=28) {
					pd++;
				}
				
			}
		}
		
		if (mes>0 && mes<=12) {
			pm++;
		}
		
		if (anio>0) {
			pa++;
		}
		
		comprobar=pa+pm+pd;
		
		if(comprobar==3) {
			System.out.println("La fecha es correcta");
		}else {
			System.out.println("La fecha es incorrecta");
		}
	}

}
