/**
 * Atividade Calculadora Servi�os
 * @author Gabriel David
 */


package br.com.java;

import java.util.Scanner;

public class CalculadoraServicos {

	public static void main(String[] args) {
		// Calculadora de servi�os
		double remuneracao, custo, horas, servico, estimativa, total;
		Scanner teclado = new Scanner(System.in);
		System.out.println("______Calculadora do Servi�o ______");
		System.out.println("");
		System.out.print("Remunera��o Mensal: ");
		remuneracao = teclado.nextDouble();
		System.out.print("Custo operacional mensal: ");
		custo = teclado.nextDouble();
		System.out.print("Carga hor�ria mensal de trabalho: ");
		horas = teclado.nextDouble();
		servico = (remuneracao + (remuneracao * 0.3) + custo + (remuneracao * 0.2)) / horas;
		System.out.println("Valor da hora de servi�o: " + servico);
		System.out.println("");
		System.out.println("Estimativa de horas deste servi�o: ");
		estimativa = teclado.nextDouble();
		total = estimativa * servico;
		System.out.print("Valor a ser cobrado deste cliente: " + total);
		
		

	}

}
