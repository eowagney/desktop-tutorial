package estrutura_de_dados;
import java.util.Scanner;

public class manipulacao_de_dados {
	private static Scanner scanner;

	public static void main(String[] args) {
		
		scanner = new Scanner(System.in);
		
		int vet[] = new int[3];
		
		for(int i = 0; i < vet.length; i++) {
			int j = 0;
			for(int a = vet.length-1; a > -1; a--)if(vet[a-1] != 0)vet[a] = vet[a-1];
			System.out.println("Informe um numero inteiro: ");
			if(vet[j] == 0)vet[j] = scanner.nextInt();
		}
		
		for(int i = 0; i < vet.length; i++)System.out.println("vet[" + i + "]: " + vet[i]); 
		
	}
}
