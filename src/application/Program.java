package application;


import java.util.Locale;
import java.util.Scanner;

import entidades.Funcionario;

public class Program {

	public static void main(String args[]) throws InterruptedException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Scanner input = new Scanner(System.in);

		System.out.print("Informe um nome: ");
		String name = sc.nextLine();
		System.out.print("Informe uma idade: ");
		long idade = sc.nextLong();
		System.out.print("Informe um CPF: ");
		int CPF = sc.nextInt();

		System.out.println("O nome informado foi " + name + ".");
		System.out.println("A idade informada foi " + idade + " anos.");
		System.out.println("O CPF informado foi " + CPF + ".");

		// vetor de n�meros
		int vetor[] = { 80, 200, 250, 400, 800, 950 };

		// matriz de strings
		String names[][] = { { "Mr. ", "Mra. ", "Mrs. ", "Teacher. " }, { "Jo�o", "Juliana", "Pereiras", "Roberto" },
				{ " da Silva", " de Luca", " Albuquerque", " da Costa" }

		};

		// impress�o do vetor
		int i = 0, j = 0;
		for (i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
		System.out.println("");

		// impress�o da matriz
		for (i = 0; i < names.length; i++) {
			for (j = 0; j < names[0].length; j++) {
				if (i < names.length - 2)
					System.out
							.println("O Nome na posi��o #" + i + j + " �: " + names[0][j] + names[1][j] + names[2][j]);
				// System.out.println("O Nome na posi��o #" + i + j + " �: " + names[i][j]);

			}

		}

		// pausa
		Thread.sleep(3000);

		System.out.println("\nPrimeiros 20 n�meros inteiros, ordem crescente:");

		for (i = 0; i <= 20; i++) {
			System.out.print(i + " ");
		}

		System.out.println("\nPrimeiros 30 n�meros inteiros, ordem decrescente:");
		j = 30;
		while (j >= 0) {
			System.out.print(j + " ");
			j--;

		}

		// vetor de tamanho fixo para guardar os funcionarios
		Funcionario[] vetor_func = new Funcionario[2];
		
		//L no final para converter a constante inteira para long
		
		Funcionario func = new Funcionario("Jo�o", 35,22101521232L);
		Funcionario func2 = new Funcionario("Juliana", 33,23513626515L);

		vetor_func[0] = func;
		vetor_func[1] = func2;

		// impress�o do vetor
		System.out.println("\n");
		i = 0;
		for (Funcionario apelido : vetor_func) {
			System.out.println("Nome do funcion�rio #" + i + ": " + apelido);
			i++;

		}

		sc.close();
		input.close();

	}

}
