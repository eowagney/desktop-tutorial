package Atividade;
import java.util.Scanner;

public class Objeto{
	
	Scanner scanner = new Scanner(System.in);

	//Atributos
	private int pares, soma;
	private int maior, menor;
	private double media;
	
	//construtor
	public Objeto() {
		super();
		this.pares = 0;
		this.soma = 0;
	}
	
	//metotos
	public void play(int qntNumeros) {
		
		int[] vetor = new int[qntNumeros];
		
	for(int i = 0; i < vetor.length; i++) {
		System.out.println("Informe um número inteiro: ");
		vetor[i] = scanner.nextInt();
		if(vetor[i] % 2 == 0) pares++;
		soma += vetor[i];
	}
	
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
	
	}
}
