package capgemini_desafios;

import java.util.Scanner;

public class Escada {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		for(int i = 1; i <= n; i++) {
			
			for(int j = n - i; j >= 1; j--) {
				System.out.print(" ");
				
				
			}
			for(int k = 1; k <= i; k++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
		
		
		
		input.close();
	}

}
