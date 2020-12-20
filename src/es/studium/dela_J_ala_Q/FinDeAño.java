package es.studium.dela_J_ala_Q;
import java.time.LocalDate;
import java.util.Scanner;

import static java.time.temporal.ChronoUnit.DAYS;
public class FinDeA�o {
	static int anio;//El static me lo pide el eclipse, no sé lo que es. No me dejaba sólo int
	static int mes;
	static int dia;
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un a�o (del a�o 1 al 10000 por ejemplo) ");
		anio=teclado.nextInt();
		if(anio<1||anio>10000)
		{
			System.out.println("Introduce un a�o razonable --FIN--");
		}
		else
		{
			System.out.println("Introduce un mes ");
			mes=teclado.nextInt();
			if(mes<1||mes>12)
			{
				System.out.println("Los meses son del 1 al 12 mel�n--FIN--");
			}
			else
			{
				System.out.println("Y por �ltimo introduce un n�mero del d�a de un mes ");
				dia=teclado.nextInt();
				teclado.close();
				if(dia<1||dia>31)
				{
					System.out.println("¿De verdad?--FIN--");
				}
				else
				{
					/*Métodos investigados en las APIs de java y en la página 
					 * https://www.campusmvp.es/recursos/post/como-manejar-correctamente-fechas-en-java-el-paquete-java-time.aspx
					 * sobre todo esta https://www.discoduroderoer.es/calcular-el-numero-de-dias-entre-dos-localdate-en-java/
					 */
					// Creo los LocalDate
					LocalDate inicio = LocalDate.of(anio, mes, dia); 
					LocalDate fin = LocalDate.of(anio+1, 1, 1);// Añado un año más para que me calcule hasta fin del año introducido

					// Usando ChronoUnit, calculo el numero de dias
					long dias = DAYS.between(inicio, fin);

					System.out.println("Numero de dias para el final del año "+anio+" son: " + dias); // 365 dias
				}
			}
		}
	}
}