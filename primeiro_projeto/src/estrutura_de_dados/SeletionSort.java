package estrutura_de_dados;

import java.util.Random;

public class SeletionSort {
	public static void main(String[] args) {

		Random num = new Random();
		int vet[] = new int[1000000];
		
		for(int i = 0; i < vet.length; i++) {
			vet[i] = num.nextInt(101);
		}
		
		long start = System.currentTimeMillis();
		SeletionSort(vet);
        long lapsed = System.currentTimeMillis();
        long tempo = lapsed - start;
        System.out.println(tempo);
	}


	public static void SeletionSort(int[] vet) {

int test = 0, pos = 0;
        for (int i = 0; i < vet.length; i++) {
        	test = vet[i];
        	pos = i;
            for(int j = i + 1; j < vet.length; j++) {
                if (test > vet[j]) {
                	test = vet[j];
                	pos = j;
                }
            }
            for(int j = 0; j < pos; j++) {
            	if(test < vet[j]) {
            		vet[pos] = vet[j];
            		vet[j] = test;
            		j = pos;
            	}
            }
        }
	}
	
	}

