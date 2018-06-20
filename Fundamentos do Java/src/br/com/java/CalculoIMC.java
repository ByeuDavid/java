/**
 * Atividade Calculo IMC
 * @author Gabriel David
 */

package br.com.java;

import java.util.Scanner;

public class CalculoIMC {

	public static void main(String[] args) {
		double peso, altura, imc;
		System.out.println("Digite o seu peso em kg: ");
		// Entrada
		Scanner teclado = new Scanner(System.in);
		peso = teclado.nextDouble();
		System.out.println("Digite sua altura em metros: ");
		altura = teclado.nextDouble();
		// Cálculo
		imc = peso / (altura * altura);
		// Saída
        System.out.println(" O valor da sua massa corporal é: " + imc);
        System.out.println("");
        if (imc < 18.49) {
			System.out.println("Abaixo do Peso");
		} else if (imc >= 18.5 && imc <= 24.99) {
            System.out.println("Peso Ideal");
		} else if (imc >= 25 && imc <= 29.99) {
            System.out.println("Acima Do Peso");
	    } else if (imc >= 30  && imc <= 34.99) {
	        System.out.println("Obesidade 1");
	    } else if (imc >= 35  && imc <= 39.99) {
            System.out.println("Obesidade 2");
        } else {
            System.out.println("Obesidade 3");
       }
	}


	}
