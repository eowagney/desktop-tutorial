package estrutura_de_dados;

public class Atividade {
	
	public static int fibonacci(int n) {
        if (n <= 0) return -1;
        if (n == 1) return 0;
        if (n == 2) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
	
	 public static void main(String[] args) {
		        System.out.println("a sequência de Fibonacci é: " + fibonacci(3));
		    }
		}

	


