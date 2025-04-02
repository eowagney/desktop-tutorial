package estrutura_de_dados;

//import java.util.Random;
import java.util.Scanner;

public class QuickSort {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//Random num = new Random();
		int vet[] = new int[8];
		
		for(int i = 0; i < vet.length; i++) {
			vet[i] = scanner.nextInt();
		}
		
		long start = System.currentTimeMillis();
		quickSort(vet);
        long lapsed = System.currentTimeMillis();
        long tempo = lapsed - start;
        System.out.println(tempo);
	}


	public static void quickSort(int[] vet) {

        int pivo = vet[0], temp = 0, temp1 = vet.length;
        int l = 0, d = vet.length;
         
        for(l = 0; l <= d; l++) {
        	if(vet[l] >= pivo && vet[d] <= pivo) {
        		temp = vet[l];
        		vet[l] = vet[d];
        		vet[d] = temp;
        	}
        	d = temp1;
        	for(d = vet.length -1; d >= l; d--) {
        	if(vet[l] >= pivo && vet[d] <= pivo) {
        		temp = vet[l];
        		vet[l] = vet[d];
        		vet[d] = temp;
        	}
        	temp1 = d;
        	d = l +1;
        }
        }
        int[] copia = vet.clone();
        int[] copia1 = vet.clone();
        
       
	} 
}
