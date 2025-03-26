package estrutura_de_dados;

import java.util.Scanner;

public class MergeSort {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int vet[] = new int[7];
		
		for(int i = 0; i < vet.length; i++) {
			vet[i] = scanner.nextInt();		
			}
		
		long start = System.currentTimeMillis();
		MergeSort(vet);
        long lapsed = System.currentTimeMillis();
        long tempo = lapsed - start;
        System.out.println(tempo);
	}
	


	public static void MergeSort(int[] vet) {
		int temp = 0;
		
			for(int i = 0; i < vet.length; i++) {
				if(vet[i] > vet[i+1]) {
					temp = vet[i];
					vet[i] = vet[i+1];
					vet[i+1] = temp;
					i++;
			}}for(int j = 0; j < vet.length; j++) {
				if(vet[j] > vet[j+2]) {
					temp = vet[j];
					vet[j] = vet[j+2];
					vet[j+2] = temp;
				}}for(int n = 0; n < vet.length; n++) {
					if(vet[n] > vet[n+3]) {
						temp = vet[n];
						vet[n] = vet[n+3];
						vet[n+3] = temp;
					}
			}
		
		
        



}
}
