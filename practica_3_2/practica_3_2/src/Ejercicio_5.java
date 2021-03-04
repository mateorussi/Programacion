import java.util.Scanner;

/**
 * Modifica el ejercicio 2 de la pr�ctica P2_2
 * para que el proceso se repita mientras el sueldo
 * de la persona sea positivo. Debes indicar al final
 * del proceso, cu�nto dinero recauda el Estado en
 * concepto de IRPF y Seguridad Social. Y cu�nto
 * dinero paga la empresa por todos sus trabajadores
 * antes de aplicar los impuestos.
 */

/**
 * @author mateorussi
 *
 */
public class Ejercicio_5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Bienvenido a la calculadora de sueldos netos con un IRPF del 12% y una Seguridad Social del 5,20%");
		double sbrutotal=0, imp=0, impuestos=0;
		System.out.println("Introduce su sueldo bruto");
		double sbruto= sc.nextDouble();
		
		while (sbruto>0) {
		double sneto= sbruto - (sbruto*0.12 + sbruto*0.052);
		sbrutotal = sbrutotal+sbruto;
		imp = sbruto*0.12  + sbruto*0.052;
		impuestos = impuestos+imp;
		System.out.println("Su sueldo neto es " + sneto + " euros.");
		System.out.println("El estado recauda "+imp+ " euros de su salario.");
		System.out.println("Introduce el salario del siguiente empleado");
		sbruto = sc.nextDouble();
		}
		System.out.println("El estado ha recaudado "+impuestos+" euros de todos los salarios.");
		System.out.println("La empresa ha pagado "+sbrutotal+" euros por todos los salarios de sus trabajadores.");
	}

}
