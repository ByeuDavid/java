/**
 * Atividade ConversaoFahrenheit
 * @author Gabriel David
 */


package br.com.java;

import java.util.Scanner;

public class ConverterDolarReal {

	public static void main(String[] args) {
		double dolar, real;
		dolar = 3.80;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o valor do D�lar: ");
		real = teclado.nextDouble();
		real = real * dolar;
		System.out.println("Valor do D�lar: " + 3.80 );
		System.out.print("Valor do D�lar em Real: " + real );

	}

}
