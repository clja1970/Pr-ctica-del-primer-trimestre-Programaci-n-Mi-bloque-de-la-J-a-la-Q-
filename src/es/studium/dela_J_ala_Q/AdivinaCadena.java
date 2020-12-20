package es.studium.dela_J_ala_Q;

import java.util.Random;
import java.util.Scanner;

/*Realizar un programa en el que el ordenador “piense” una cadena de
5 posibles. Luego, el usuario introduce una cadena por teclado y se indicará si ha
acertado o no. No hay que repetir hasta que acierte. El programa solamente pide
una cadena una vez.*/
public class AdivinaCadena
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		Random rnd=new Random();
		String[] cadena= { "Hola","que","ase","como","ta" };
		String elegida;
		int i;
		i=rnd.nextInt(5);
		System.out.println("Introduce una palabra de estas a ver si aciertas :"+"Hola,que,ase,como,ta");
		elegida=teclado.nextLine();
		teclado.close();
		if (elegida.equals(cadena[i]))
		{
			System.out.println("Has acertado");
		}
		else
		{
			System.out.println("Las cagao");
		}
	}
}

