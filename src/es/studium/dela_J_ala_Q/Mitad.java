package es.studium.dela_J_ala_Q;

import java.util.Scanner;

public class Mitad {

	public static void main(String[] args) {
		/*Mitad � Realizar un programa, que, mediante una funci�n, calcule la mitad de un
n�mero entero dado por teclado*/
		int numero;
		Scanner teclado = new Scanner(System.in);
		DarMitad();
		numero=teclado.nextInt();
		teclado.close();
		System.out.println("La mitad del n�mero dado es: "+mitad(numero));
	}
	private static void DarMitad() {
		System.out.println("Dame un n�mero entero para calcular su mitad");
	}
	public static double mitad(int num)	{
		return (num/2);
		}
}
