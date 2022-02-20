package capgemini_desafios;

import java.util.Scanner;

public class Ladder {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		// altura da escada a ser formada
		int n = input.nextInt();
		
		for(int i = 1; i <= n; i++) {
			// adiciona espa�os em branco para se formar o desenho esperado
			for(int j = n - i; j >= 1; j--) {
				System.out.print(" ");
				
				
			}
			// ao final dos espa�os em branco preenche uma estrela
			for(int k = 1; k <= i; k++) {
				System.out.print("*");
				
			}
			// pula uma linha ao final de cada intera��o
			System.out.println();
		}
		
		input.close();
	}

}
