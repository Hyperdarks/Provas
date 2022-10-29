package provaa1;

import java.util.Scanner; // Importação do Scanner

public class Questao1Jogo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Aqui eu chamo o Scanner
		System.out.println("Primeiro jogador - Digite a resposta do jogo (escolha um numero entre 0 a 1000)");//peço pro primeiro jogador digitar a resposta
		int resposta1 = scanner.nextInt(); // armazeno a reposta na variavel resp1
		System.out.println("Segundo jogador - Digite um numero (entre 0 a 1000) que voce acha que possa ser a resposta"); //peço pro segundo jogador digitar a resposta que ele acha que é correta
		int resposta2 = scanner.nextInt();// armazeno a resposta na variavel resp2
		int countador = 0; // contador de quantas vezes foi preciso tentar pra conseguir
		while (resposta2 != resposta1) { // aqui eu faço um laço while pra o segundo jogador continuar entrando com outra resposta se nao for igual a do primeiro jogador
			
			if(resposta2 > resposta1) { // verifico se a reposta é maiorque a do primeiro jogador
				System.out.println("Boa tentativa, mas você inseriu um numero maior que a resposta do primeiro jogador, tente novamente");
				countador++;
			}else {//verifico se a reposta é maiorque a do primeiro jogador
				System.out.println("Boa tentativa, mas você inseriu um numero menor que a resposta do primeiro jogador, tente novamente");
				countador++;
			}
			
			System.out.println("Segundo jogador - Digite outro numero (entre 0 a 1000) que voce acha que possa ser a resposta");//peço pro segundo jogador digitar a resposta que ele acha que é correta novamente
			resposta2 = scanner.nextInt();// armazeno novamente na variavel
			
			
		}
			
			
		System.out.printf("Parabens, você inseriu um numero correto"+ " e foram necessarias "+countador+" tentativas");	
		// se passar do laço while com a resposta certa printo aqui que ele venceu o jogo e coloco quantas vezwes foi necessario
			
		}
	}

