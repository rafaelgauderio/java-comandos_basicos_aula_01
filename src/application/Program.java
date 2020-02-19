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

		System.out.println("O nome informado foi " + name + ".");

		Thread.sleep(3000);

		System.out.println("Primeiros 20 números inteiros, ordem crescente:");

		for (int i = 0; i <= 20; i++) {
			System.out.println(i);
		}

		Thread.sleep(3000);

		System.out.println("Primeiros 30 números inteiros, ordem decrescente:");
		int j = 30;
		while (j > 0) {
			System.out.println(j);
			j--;

		}

		sc.close();
		input.close();

	}

}
