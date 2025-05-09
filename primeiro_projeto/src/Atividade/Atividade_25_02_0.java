package Atividade;

import java.util.Scanner;

public class Atividade_25_02_0 {
	private static Scanner scanner;

	public static void main(String[] args) {
	scanner = new Scanner(System.in);
	
	int vet[] = new int[5];
	int temp = 0;
	
	for(int i = 0; i < vet.length; i++) {
		System.out.println("Informe um número inteiro: ");
		vet[i] = scanner.nextInt();
		}

	for(int i = 0; i < vet.length - 1; i++) {
		if(vet[i] > vet[i+1]) {
			temp = vet[i+1];
			vet[i+1] = vet[i];
			vet[i] = temp;
		}
	}
	
	for(int i = 0; i < vet.length; i++) {
		System.out.print(vet[i] + " ");
	}
	
}
}