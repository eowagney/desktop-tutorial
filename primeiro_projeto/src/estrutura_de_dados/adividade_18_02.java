package estrutura_de_dados;

import java.util.Scanner;

public class adividade_18_02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int vet[] = new int[4];
		int cont = 0, result1 = 1, result2 = 1;
		
		for(int i = 0; i < vet.length; i++) {
			System.out.println("Informe um número: ");
			vet[i] = scanner.nextInt();
		}
		
		for(int i = 0; i < vet.length; i++) {
			for(int j = 0; j < vet.length; j++) {
				result1 *= vet[j];
				cont++;
				if(cont == 3) {
					cont = 0;
					if(result1 > result2 ) {
						
					}
				}
			}
		
	}
		System.out.println("resultado: " + result);
		
	}
}
