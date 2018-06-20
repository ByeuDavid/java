package br.com.java;

public class Agenda {

	public static void main(String[] args) {
		String[][] agenda = { { "BillGates", "1111-1111", "bill@outlook.com" },
				{ "LinusTorvald", "2222-2222", "linus@gmail.com" }, { "SteveJobs", "3333-3333", "steve@icloud.com" } };
		// Recuperando o email do Linus Torvalds
		// System.out.println(agenda[1][2]);
		// Alterando o telefone do Bill Gates
		// agenda[0][1] = "9999-9999";
		// System.out.println(agenda[0][1]);
		for (int i = 0; i < agenda.length; i++) {
			System.out.println("__________________________________");
			for (int j = 0; j < agenda[i].length; j++) {
				System.out.println(agenda[i][j]);
			}

		}

	}

}
