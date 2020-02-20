package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String args[]) throws InterruptedException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Scanner input = new Scanner(System.in);

		System.out.print("Informe um nome: ");
		String name = sc.nextLine();
		System.out.print("Informe uma idade: ");
		int idade = sc.nextInt();
		System.out.println("O nome informado foi " + name + ".");
		System.out.println("A idade informada foi " + idade + " anos.");

		// vetor de números
		int vetor[] = { 80, 200, 250, 400, 800, 950 };

		// matriz de strings
		String names[][] = { { "Mr. ", "Mra. ", "Mrs. ", "Teacher. " }, { "João", "Juliana", "Pereiras", "Roberto" },
				{ " da Silva", " de Luca", " Albuquerque", " da Costa" }

		};

		// impressão do vetor
		int i = 0, j = 0;
		for (i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
		System.out.println("");

		// impressão da matriz
		for (i = 0; i < names.length; i++) {
			for (j = 0; j < names[0].length; j++) {
				if (i < names.length - 2)
					System.out.println("O Nome na posição #" + i + j + " é: " + names[0][j] + names[1][j] + names[2][j]);
				// System.out.println("O Nome na posição #" + i + j + " é: " + names[i][j]);

			}

		}

		// pausa
		Thread.sleep(3000);

		System.out.println("\nPrimeiros 20 números inteiros, ordem crescente:");

		for (i = 0; i <= 20; i++) {
			System.out.print(i+" ");
		}

		System.out.println("\nPrimeiros 30 números inteiros, ordem decrescente:");
		j = 30;
		while (j >= 0) {
			System.out.print(j+" ");
			j--;

		}

		sc.close();
		input.close();

	}

}
