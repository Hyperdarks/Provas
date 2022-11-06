package a3;

import java.util.Locale;
import java.util.Scanner;

public class Biblioteca{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		char resp ='s';
		int resp2 =  0;
		int count = 0;
		int[] array = new int[10];
		array[1] = 12;
		Atributos at = new Atributos();
		ArrayId id = new ArrayId();
		while (resp == 's'|| resp == 'S') {
			resp = 'o';
			System.out.println("1- adicionar um novo livro (objeto) ao seu carrinho"+
			"\n2 - Editar/Atulizar uma informação de um livro no seu carrinho"
			+"\n3- remover um livro do seu carrinho"
					+ "\n4- Ver quais livros você tem no seu carrinho"+"");
			System.out.printf("o que vocè quer fazer? ");
			resp2 = sc.nextInt();
			if(resp2 == 1) {
			sc.nextLine();
			System.out.print("Digite o nome do livro: ");
			at.setNomeLivro(sc.nextLine());
			System.out.print("Digite o autor do livro: ");
			at.setAutorLivro(sc.nextLine());
			System.out.print("Digite o assunto do livro: ");
			at.setAssuntoLivro(sc.nextLine());
			System.out.print("Digite o preco do livro: ");
			at.setPreco(sc.nextDouble());
			System.out.print("Digite a quantidade do mesmo livro: ");
			at.setQuantLivro(sc.nextInt());
			System.out.println(at.atributos());
			count++;
			at.setId(count);
			id.setArrayId(count, count);
			System.out.println("id do produto no carrinho: " +id.getArrayId());
			}
			System.out.print("Você quer continuar no programa? (sim/nao) ");
			resp = sc.next().charAt(0);
		}
		System.out.println("Esse é o seu carrinho final:");
		sc.close();
	}

}
