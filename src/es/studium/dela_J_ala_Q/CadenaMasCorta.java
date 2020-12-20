package es.studium.dela_J_ala_Q;

import java.util.Scanner;

public class CadenaMasCorta {

	public static void main(String[] args) {
		/*Realizar un programa que meta 10 cadenas en una tabla y
luego muestre a cadena más corta. Usar una función que devuelva la cadena más
corta y que tenga como parámetro la tabla.*/
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
		System.out.println("La cadena más corta es: "+cadcorta(cadena) +" Está en la posición"+i);
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


