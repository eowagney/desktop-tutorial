package estrutura_de_dados;

import java.util.Scanner;

public class Atividade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int topo = -1;
        int[] pilha = new int[7];

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Inserir");
            System.out.println("2 - Remover");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            if (opcao == 0) {
                System.out.println("Encerrando programa.");
                break;
            }

            switch (opcao) {
                case 1:
                    System.out.print("Quantos elementos deseja inserir? ");
                    int lim = scanner.nextInt();
                    topo = inserir(pilha, topo, lim, scanner);
                    break;

                case 2:
                    System.out.print("Quantos elementos deseja remover? ");
                    int remove = scanner.nextInt();
                    topo = retirar(pilha, topo, remove);
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

            System.out.print("Pilha atual: ");
            for (int i = 0; i <= topo; i++) {
                System.out.print(pilha[i] + " ");
            }
            if (topo == -1) System.out.print("Vazia");
            System.out.println("\nTopo atual: " + topo);
        }

        scanner.close();
    }

    public static int inserir(int[] pilha, int topo, int lim, Scanner scanner) {
        for (int i = 0; i < lim; i++) {
            if (topo == pilha.length - 1) {
                System.out.println("Pilha cheia! Não é possível inserir mais elementos.");
                break;
            }
            System.out.print("Digite o valor para empilhar: ");
            int valor = scanner.nextInt();
            topo++;
            pilha[topo] = valor;
        }
        return topo;
    }

    public static int retirar(int[] pilha, int topo, int remove) {
        for (int i = 0; i < remove; i++) {
            if (topo == -1) {
                System.out.println("Pilha vazia! Não é possível remover mais elementos.");
                break;
            }
            System.out.println("Removendo: " + pilha[topo]);
            pilha[topo] = 0;
            topo--;
        }
        return topo;
    }
}
