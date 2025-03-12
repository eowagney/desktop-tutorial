package estrutura_de_dados;

import java.util.Random;

public class ShellSort {
		public static void main(String[] args) {

			Random num = new Random();
			int vet[] = new int[1000000];
			
			for(int i = 0; i < vet.length; i++) {
				vet[i] = num.nextInt(101);
			}
			
			long start = System.currentTimeMillis();
			ShellSort(vet);
	        long lapsed = System.currentTimeMillis();
	        long tempo = lapsed - start;
	        System.out.println(tempo);
		}


		public static void ShellSort(int[] vet) {
			int n = 2, temp = 0;
	        for (int i = 0; i < vet.length; i++) {
	        	i = 0;
	            for(int j = vet.length / n; j < vet.length; j++) {
	                if (vet[i] > vet[j]) {
	                	temp = vet[i];
	                	vet[i] = vet[j];
	                	vet[j] = temp;
	                }
	                i++;
	            }
	            n *= 2;
	        }
	        for (int i = 0; i < 1; i++) {
	            for(int j = i + 1; j < vet.length; j++) {
	            	if (vet[i] > vet[j]) {
	                	temp = vet[i];
	                	vet[i] = vet[j];
	                	vet[j] = temp;
	                }
	                i++;
	        }
	        }
		}
}

