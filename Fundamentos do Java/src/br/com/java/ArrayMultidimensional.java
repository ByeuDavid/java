package br.com.java;

public class ArrayMultidimensional {

	public static void main(String[] args) {
		// A linha abaixo cria um array multidimensional(matriz)
		double [][] boletim = {{8, 7, 9,3}, {4,5,8,6}};
		// Recuperando a nota de português do 3o bimestre
		System.out.print("Média de português do 3o bim: " + boletim[1][2]);

	}

}
