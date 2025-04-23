package estrutura_de_dados;

import java.util.Scanner;

public class PilhaCircular {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int lista[] = new int[4];
		int n = 0, i = 0, f = -1;

		while (true) {
			System.out.println("\nEscolha uma opção:");
			System.out.println("1 - Adicionar elemento");
			System.out.println("2 - Remover elemento");
			System.out.println("3 - Mostrar vetor");
			System.out.println("4 - Sair");

int opcao = scanner.nextInt();

			switch (opcao) {
				case 1:
					int[] addResult = adicionar(lista, n, i, f, scanner);
					n = addResult[0];
					i = addResult[1];
					f = addResult[2];
					break;
				case 2:
					int[] remResult = remover(lista, n, i, f);
					n = remResult[0];
					i = remResult[1];
					f = remResult[2];
					break;
				case 3:
					System.out.println("Vetor atual:");
					for (int j = 0; j < lista.length; j++) {
						System.out.print(lista[j] + " ");
					}
					break;
				case 4:
					System.out.println("Saindo...");
					scanner.close();
					return;
				default:
					System.out.println("Opção inválida!");
			}
		}
	}

	public static int[] adicionar(int lista[], int n, int i, int f, Scanner scanner) {
		if (n < lista.length) {
			f = (f + 1) % lista.length;
			System.out.print("Digite o número para adicionar: ");
			lista[f] = scanner.nextInt();
			n++;
		} else {
			System.out.println("Fila cheia!");
		}
		return new int[]{n, i, f};
	}

	public static int[] remover(int lista[], int n, int i, int f) {
		if (n > 0) {
			System.out.println("Removido: " + lista[i]);
			lista[i] = 0;
			i = (i + 1) % lista.length;
			n--;
		} else {
			System.out.println("Fila vazia!");
		}
		return new int[]{n, i, f};
	}
}

