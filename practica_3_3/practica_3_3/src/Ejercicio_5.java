/**
 * La pol?tica de cobro de una compa??a telef?nica es:
 * ? cuando se realiza una llamada, el cobro es por el tiempo que ?sta dura, de tal forma
 * que los primeros cinco minutos cuestan 1 euro, los siguientes tres, 80 c?ntimos, los
 * siguientes dos minutos, 70 c?ntimos, y a partir del d?cimo minuto, 50 c?ntimos.
 * ? Adem?s, se carga un impuesto de 3 % cuando es domingo, y si es otro d?a, en turno de
 * ma?ana, 15 %, y en turno de tarde, 10 %.
 * Realice un algoritmo para determinar cu?nto debe pagar por cada concepto una persona
 * que realiza una llamada, teniendo en cuenta la duraci?n de esta, el dia de la semana y el
 * turno. (Hora de la llamada hh:mm � Ma�ana antes de las 14:00, el resto tarde)
 */

import java.util.Scanner;

/**
 * @author bm10DAM1
 *
 */
public class Ejercicio_5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		int duracion, dia, turno;
		double costo_llamada = 0,costo_total = 0;
	
		System.out.println("Ingrese la duración de la llamada");
		duracion=sc.nextInt();
		
		System.out.println("Elija el turno de la llamada"
				+ "\n1. Mañana (antes de las 14:00)"
				+ "\n2. Tarde (resto del dia despues de las 14:00)");
		turno=sc.nextInt();
		
		System.out.println("Ingrese el día de la llamada (1-7)");
		dia=sc.nextInt();
		
		//determina costo de duración
		if (duracion<=5) {
			costo_llamada=duracion*1;
		}else if (duracion>5 && duracion<=8) {
			costo_llamada+=(duracion*0.80)+5;
		}else if (duracion>8 && duracion<=10) {
			costo_llamada+=(duracion*0.7)+7.4;
		}else if (duracion>8 && duracion<=10) {
			costo_llamada+=(duracion*0.5)+8.8;
		}
		
		//impuestos
		if (dia==7) {
			costo_total=(costo_llamada*0.03)+costo_llamada;
		}else if (dia>=1 && dia<=6) {
			switch (turno) {
				case 1: costo_total=(costo_llamada*0.1)+costo_llamada;
				break;
				case 2: costo_total=(costo_llamada*0.15)+costo_llamada;
			}
		}
		
		System.out.println("La duracion fue de "+duracion+" minutos, el costo de "+costo_total+" y el turno "+turno);
	}
}
