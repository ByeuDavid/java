/**
 * Atividade CalculadoraFlex
 * @author Gabriel David
 */


package br.com.java;

import java.util.Scanner;

public class CalculadoraFlex {

	public static void main(String[] args) {
		// variáveis

		double alcool, gasolina;
		Scanner teclado = new Scanner(System.in);
		System.out.println();
		System.out.print("Digite o valor do álcool: ");
		alcool = teclado.nextDouble();
		System.out.print("Digite o valor da gasolina: ");
		gasolina = teclado.nextDouble();
		gasolina = (alcool / gasolina);
		if (gasolina < 0.7) {
			System.out.println("É mais vantajoso abaster com ALCOOL");
		} else {
			System.out.println("É mais vantajoso abastecer com GASOLINA");

		}

	}

}
