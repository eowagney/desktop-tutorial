package Atividade;
import java.util.Scanner;

public class Objeto{

	//Atributos
	private int tamVetor;
	int[] vet = new int[tamVetor];
	
	//construtor
	void Vetor(int tamVetor) {
		this.tamVetor = tamVetor;
		preencherVetor();
	}
	
	public void preencherVetor() {
		
		try (Scanner scanner = new Scanner(System.in)) {
			for(int i = 0; i < vet.length; i++) {
				System.out.println("Informe um número inteiro: ");
				vet[i] = scanner.nextInt();
			
			}
		}
	}
}
	/*
	int i;
	if(vetor[i] % 2 == 0) pares++;
	soma += vet[i];
	
	maior = vetor[0];
	menor = maior;
	media = soma / vetor.length;
	
	System.out.println("\nVetor original");
	for(int i = 0; i < vetor.length; i++) {
		
		if(vetor[i] > maior)maior = vetor[i];
		if(vetor[i] < menor)menor = vetor[i];
		
		System.out.println("vet[" + i + "]: " + vetor[i]);
		
	}
	
	System.out.println("\nVetor invertido");
	for(int i = vetor.length-1; i > -1; i--) {
		System.out.println("vet[" + i + "]: " + vetor[i]);
	}
	
	System.out.println("\nSoma: " + soma);
	System.out.println("Quantidade de número pares: " + pares);
	System.out.println("Maior número encontrado: " + maior);
	System.out.println("Menor número encontrado: " + menor);
	System.out.println("Média: " + media);
	
	System.out.println("\nNúmeros maiores que a média:");
	for(int i = 0; i < vetor.length; i++) {
		if(vetor[i] > media)System.out.println("vet[" + i + "]: " + vetor[i]);
	}
	
	public int maior() {
		int maior
	}

	public int menor() {
		int menor
	}
	public int somaElementos() {
		int soma; 
		
		for(int i = 0; i < vet.length; i++) {
			soma += vet[i];
		}
		}
	
	
	public float calcularMedia() {
		return somaElementos() / temVetor
	}
	
	public void exibirVetorInvertido() {
		System.out.println("\nVetor invertido");
		for(int i = vetor.length-1; i > -1; i--) {
			System.out.println("vet[" + i + "]: " + vetor[i]);
		}
}
}
*/