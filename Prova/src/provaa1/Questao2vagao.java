package provaa1;

import java.util.Scanner;

public class Questao2vagao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] vagao = new int[6];
		int azul, amarelo, laranja, vermelha;
		azul = 0;
		amarelo = 0;
		laranja = 0;
		vermelha = 0;
		for (int i = 0; i < 6; i++) {
			System.out.printf("Digite o valor do vagao %d: ", i+1);
			vagao[i] = sc.nextInt();
			while(vagao[i] < 0 || vagao[i] >=251) {
				System.out.printf("Digite outro valor, esse é invalido %d: ", i+1);
				vagao[i] = sc.nextInt();
			}
			
			if(vagao [i] < 51 ) {
				azul++;
			}else if(vagao [i] < 101) {
				amarelo++;
			}else if(vagao [i] < 151) {
				laranja++;
			}else if(vagao[i] < 251) {
				vermelha++;
			}

		}
		
		for (int i = 0; i < 6; i++) {
			if(vagao[i] > 0 && vagao[i] <251) {
			System.out.printf("\nCarro %d: %d", i+1, vagao[i]);
			}
		}
		System.out.printf("\nQuantidade de carro azul: "+azul+"\nQuantidade de carro amarelo: "+amarelo+"\nQuantidade de carro laranja: "
		+laranja+"\nQuantidade de carro vermelho: "+vermelha );
	}

}
