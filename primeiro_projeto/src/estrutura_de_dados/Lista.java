package estrutura_de_dados;

import java.util.ArrayList;
import java.util.Scanner;

public class Lista {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Object[]> listaProdutos = new ArrayList<>(); 
        int opcao;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Adicionar produto");
            System.out.println("2. Listar produtos");
            System.out.println("3. Buscar produto");
            System.out.println("4. Remover produto");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    inserir(scanner, listaProdutos); 
                    break;
                case 2:
                    listar(listaProdutos);
                    break;
                case 3:
                    buscar(scanner, listaProdutos);
                    break;
                case 4:
                    remover(scanner, listaProdutos);
                    break;
                case 0:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        scanner.close();
    }

    public static void inserir(Scanner scanner, ArrayList<Object[]> listaProdutos) {
        Object[] dados = new Object[4];

        System.out.print("Digite o código: ");
        int codigo = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o preço: ");
        double preco = scanner.nextDouble();

        System.out.print("Digite a quantidade em estoque: ");
        int qntEstoque = scanner.nextInt();

        dados[0] = codigo;
        dados[1] = nome;
        dados[2] = preco;
        dados[3] = qntEstoque;

        listaProdutos.add(dados);
        ordenarLista(listaProdutos);
        System.out.println("Produto adicionado com sucesso!");
    }

    public static void listar(ArrayList<Object[]> listaProdutos) {
        if (listaProdutos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
            return;
        }

        System.out.println("\n--- Produtos Cadastrados ---");
        for (int i = 0; i < listaProdutos.size(); i++) {
            Object[] dados = listaProdutos.get(i);
            System.out.println("\nProduto " + (i + 1) + ":");
            System.out.println("Código: " + dados[0]);
            System.out.println("Nome: " + dados[1]);
            System.out.println("Preço: " + dados[2]);
            System.out.println("Quantidade em estoque: " + dados[3]);
        }
    }

    public static void buscar(Scanner scanner, ArrayList<Object[]> listaProdutos) {
        if (listaProdutos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado para buscar.");
            return;
        }

        System.out.print("\nDigite o nome para buscar: ");
        String nomeBusca = scanner.nextLine();

        boolean encontrado = false;
        for (Object[] dados : listaProdutos) {
            if (dados[1] != null && dados[1].equals(nomeBusca)) {
                System.out.println("Produto encontrado:");
                System.out.println("Código: " + dados[0]);
                System.out.println("Nome: " + dados[1]);
                System.out.println("Preço: " + dados[2]);
                System.out.println("Quantidade em estoque: " + dados[3]);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Produto não encontrado.");
        }
    }

    public static void remover(Scanner scanner, ArrayList<Object[]> listaProdutos) {
        if (listaProdutos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado para remover.");
            return;
        }

        System.out.print("Digite o nome do produto que deseja remover: ");
        String nomeRemove = scanner.nextLine();

        boolean removido = false;
        for (int i = 0; i < listaProdutos.size(); i++) {
            Object[] dados = listaProdutos.get(i);
            if (dados[1] != null && dados[1].equals(nomeRemove)) {
                listaProdutos.remove(i);
                ordenarLista(listaProdutos);
                System.out.println("Produto removido com sucesso!");
                removido = true;
                break;
            }
        }

        if (!removido) {
            System.out.println("Produto não encontrado para remoção.");
        }
    }
    
    public static void ordenarLista(ArrayList<Object[]> listaProdutos) {
        listaProdutos.sort((a, b) -> ((String) a[1]).compareToIgnoreCase((String) b[1]));
    }

}
