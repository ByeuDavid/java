/**
 * Atividade Calculadora Lucro
 * @author Gabriel David
 */


package br.com.java;

import java.util.Scanner;

public class CalculadoraLucro {

	public static void main(String[] args) {
		double custo, lucro, venda;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Calculadora do lucro");
        System.out.println("");
        // Entrada
        System.out.print("Preço de custo: ");
        custo = teclado.nextDouble();
        System.out.print("% de lucro: ");
        lucro = teclado.nextDouble();
        // Processamento
        venda = custo + ((custo * lucro) / 100);
        // Saida
        System.out.print("Preço de venda: " + venda);
        
        
               
        
	}

}
