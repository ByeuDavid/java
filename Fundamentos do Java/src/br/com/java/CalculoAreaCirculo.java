/**
 * Atividade CalculoAreaCirculo
 * @author Gabriel David
 */

package br.com.java;

import java.util.Scanner;

public class CalculoAreaCirculo {

	public static void main(String[] args) {
		double raio, area, PI = 3.1416;
		System.out.print("Digite o valor do raio: ");
		Scanner teclado = new Scanner(System.in);
		raio = teclado.nextFloat();
		area  = PI * raio * raio;
		System.out.print("O valor da area é: " + area);  

	}
}
