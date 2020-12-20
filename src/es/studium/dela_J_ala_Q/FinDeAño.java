package es.studium.dela_J_ala_Q;
import java.time.LocalDate;
import java.util.Scanner;

import static java.time.temporal.ChronoUnit.DAYS;
public class FinDeAño {
	static int anio;//El static me lo pide el eclipse, no sÃ© lo que es. No me dejaba sÃ³lo int
	static int mes;
	static int dia;
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un año (del año 1 al 10000 por ejemplo) ");
		anio=teclado.nextInt();
		if(anio<1||anio>10000)
		{
			System.out.println("Introduce un año razonable --FIN--");
		}
		else
		{
			System.out.println("Introduce un mes ");
			mes=teclado.nextInt();
			if(mes<1||mes>12)
			{
				System.out.println("Los meses son del 1 al 12 melón--FIN--");
			}
			else
			{
				System.out.println("Y por último introduce un nómero del día de un mes ");
				dia=teclado.nextInt();
				teclado.close();
				if(dia<1||dia>31)
				{
					System.out.println("Â¿De verdad?--FIN--");
				}
				else
				{
					/*MÃ©todos investigados en las APIs de java y en la pÃ¡gina 
					 * https://www.campusmvp.es/recursos/post/como-manejar-correctamente-fechas-en-java-el-paquete-java-time.aspx
					 * sobre todo esta https://www.discoduroderoer.es/calcular-el-numero-de-dias-entre-dos-localdate-en-java/
					 */
					// Creo los LocalDate
					LocalDate inicio = LocalDate.of(anio, mes, dia); 
					LocalDate fin = LocalDate.of(anio+1, 1, 1);// AÃ±ado un aÃ±o mÃ¡s para que me calcule hasta fin del aÃ±o introducido

					// Usando ChronoUnit, calculo el numero de dias
					long dias = DAYS.between(inicio, fin);

					System.out.println("Numero de dias para el final del aÃ±o "+anio+" son: " + dias); // 365 dias
				}
			}
		}
	}
}