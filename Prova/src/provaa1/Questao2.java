package provaa1;

import java.util.Locale;
import java.util.Scanner;

public class Questao2 {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			Locale.setDefault(Locale.US);
			int[] resp = new int[5];
			int[] respComparativa = new int[5];
			int[] respUnica = new int[5];
			for (int i = 0; i <= 4; i++) {
				respComparativa[i] = 0;
			}

			System.out.println("Escreva 5 numeros entre 10 e 100 ");
			for (int i = 0; i <= 4; i++) {
				resp[i] = sc.nextInt();
				respComparativa[i] = resp[i];
				if (i == 0) {
					respUnica[i] = resp[i];
					System.out.println("Resposta unicas até então: " + resp[i]);

				}
				if (i == 1) {
					if (resp[i] != respComparativa[i + 1] && resp[i] != respComparativa[i + 2]
							&& resp[i] != respComparativa[i + 3] && resp[i] != respComparativa[i - 1]) {
						respUnica[i] = resp[i];
						System.out.println("Resposta unicas até então: " + respUnica[i - 1] + " " + respUnica[i]);

					}
				}
				if (i == 2) {
					if (resp[i] != respComparativa[i + 1] && resp[i] != respComparativa[i + 2]
							&& resp[i] != respComparativa[i - 1] && resp[i] != respComparativa[i - 2]) {
						respUnica[i] = resp[i];
						System.out.println("Resposta unicas até então: " + respUnica[i - 2] + " " + respUnica[i - 1] + " "
								+ respUnica[i]);
					}
				}
				if (i == 3) {
					if (resp[i] != respComparativa[i + 1] && resp[i] != respComparativa[i - 1]
							&& resp[i] != respComparativa[i - 2] && resp[i] != respComparativa[i - 3]) {
						respUnica[i] = resp[i];
						System.out.println("Resposta unicas até então: " + respUnica[i - 3] + " " + respUnica[i - 2] + " "
								+ respUnica[i - 1] + " " + respUnica[i]);
					}
				}
				if (i == 4) {
					if (resp[i] != respComparativa[i - 1] && resp[i] != respComparativa[i - 2]
							&& resp[i] != respComparativa[i - 3] && resp[i] != respComparativa[i - 4]) {
						respUnica[i] = resp[i];
						System.out.println("Resposta unicas até então: " + respUnica[i - 4] + " " + respUnica[i - 3] + " "
								+ respUnica[i - 2] + " " + respUnica[i - 1] + " " + respUnica[i]);
					}

				}
			}
			System.out.println("Fim do programa.");
	}
}