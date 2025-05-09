package Atividade;
import java.util.Random;

public class Atividade_25_02_1 {
	public static void main(String[] args) {
        int[] vetor = new int[100000];
        Random scanner = new Random();

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = scanner.nextInt(101);
        }

        long start = System.currentTimeMillis();
        bubbleSort(vetor);
        long lapsed = System.currentTimeMillis();
        long tempo = lapsed - start;
        System.out.println(tempo);
    }

    public static void bubbleSort(int[] vetor) {
        int n = vetor.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
    }
}
