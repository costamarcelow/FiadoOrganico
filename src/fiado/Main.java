package fiado;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("informe o nome do cliente: ");
		
		String nome = scanner.nextLine();
		Consumidor consumidor = new Consumidor(nome);
		
		System.out.println("Informe o valor da compra: ");
		int fiado = Integer.valueOf(scanner.nextLine());
		consumidor.registrarFiado(fiado);

		int total = consumidor.getFiado();
		
		
		
		System.out.println("informe o TELEFONE do cliente: ");
		String telefone = scanner.nextLine();
		consumidor.getTelefone();
		
		
		
		
		
		

		if (total > 100) {

			System.out.println("Cliente " + consumidor.getNome() + " deve " + total + " ganhou brinde");

		} else {
			System.out.println("Cliente " + consumidor.getNome() + " deve " + total);

		}

	}

	public static int somaWhile(int[] fiados) {
		int i = 0;
		int total = 0;
		while (i < fiados.length) {
			total += fiados[i];
			i++;

		}
		return total;

	}

	public static int somaFor(int[] fiados) {
		int total = 0;
		for (int i = 0; i < fiados.length; i++) {
			total += fiados[i];

		}
		return total;

	}

	public static int somaForeach(int[] fiados) {
		int total = 0;
		for (int fiado : fiados) {
			total += fiado;

		}
		return total;

	}
}
