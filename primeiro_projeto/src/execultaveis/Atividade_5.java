package execultaveis;

import java.util.Scanner;

public class Atividade_5 {
	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Informe a velcidade em (km/h): ");
	int velocidade = scanner.nextInt();
	System.out.println("Informe o tempo de viagem em horas:");
	int tempo = scanner.nextInt();

	
	int result = velocidade * tempo;
	
	System.out.println("Velocidade: " + velocidade + " km/h" +
						"\nTempo da viagem: " + tempo + " horas" + 
						"\nDistância percorrida: " + result + " km");
	
}
}
