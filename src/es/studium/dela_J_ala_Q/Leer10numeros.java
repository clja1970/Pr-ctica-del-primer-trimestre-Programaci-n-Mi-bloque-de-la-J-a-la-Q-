package es.studium.dela_J_ala_Q;

import java.util.Scanner;
/*Leer 10 n�meros. Leer diez n�meros enteros por teclado, calcular su media
mediante una funci�n y mostrar todos los n�meros en orden inverso al que se
introdujeron. */

public class Leer10numeros {

	public static void main(String[] args) {
	final int TAM=10;
	int[] tabla=new int[TAM];
	int i;
	@SuppressWarnings("resource")
	Scanner teclado = new Scanner(System.in);
	for(i=0;i<TAM;i++) {
		System.out.println("Introduce diez n�meros enteros");
		 tabla[i]=teclado.nextInt();
	}
	teclado.close();
		System.out.println("El resultado de la media de los diez n�meros enteros es: "+media(tabla));
	
	}
	public static double media (int[] tabla) {
		double media;
		media=0;
		int i;
		for(i=0;i<tabla.length;i++) {
		media=(media+tabla[i]);
		}
		return media/tabla.length;
	}
}
