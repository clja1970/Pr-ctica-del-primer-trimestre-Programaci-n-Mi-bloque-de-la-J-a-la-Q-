package es.studium.dela_J_ala_Q;

import java.util.Scanner;

public class CadenaMasCorta {

	public static void main(String[] args) {
		/*Realizar un programa que meta 10 cadenas en una tabla y
luego muestre a cadena m�s corta. Usar una funci�n que devuelva la cadena m�s
corta y que tenga como par�metro la tabla.*/
		String[] cadena= new String [10];
		int i;
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		for (i=0;i<10;i++) 
		{
			System.out.println("Introduce diez palabras por favor");
			cadena[i]=teclado.nextLine();
		}
		teclado.close();
		System.out.println("La cadena m�s corta es: "+cadcorta(cadena) +" Est� en la posici�n"+i);
	}
	public static String cadcorta(String[] cad)
	{
		String corta;
		corta=cad[0];
		for (int j=0;j<cad.length;j++)
		{
			if(cad[j].length()<corta.length())
			{
				corta=cad[j];
			}
		}
		return corta;
	}
}


