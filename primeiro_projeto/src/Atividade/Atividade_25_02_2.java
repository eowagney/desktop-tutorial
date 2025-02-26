package Atividade;

import java.util.Random;

public class Atividade_25_02_2 {

public static void main(String[] args) {
		
		Random num = new Random();
		int vet[] = new int[100000];
		
		for(int i = 0; i < vet.length; i++) {
			vet[i] = num.nextInt(101);
		}
		long start = System.currentTimeMillis();
		IsertionSort(vet);
        long lapsed = System.currentTimeMillis();
        long tempo = lapsed - start;
        System.out.println(tempo);
	}


	public static void IsertionSort(int[] vet) {
		int n = vet.length;
		int temp = 0, a = 0;
        for (int i = 1; i < n; i++) {
        	a = i;
            for(int j = i - 1; j > -1; j--) {
                if (vet[i] < vet[j]) {
                    temp = vet[j];
                    vet[j] = vet[j + 1];
                    vet[j + 1] = temp;
                    i--;
                }
        }
            i = a;
	}
}
	}