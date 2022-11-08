package a3;

import java.util.Locale;
import java.util.Scanner;

public class Biblioteca {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		char resp = 's';
		int resp2 = 0;
		int[] array = new int[10];
		array[1] = 12;
		Atributos at = new Atributos();
		ArrayId id = new ArrayId();
		int count = 1;
		while (resp == 's' || resp == 'S') {
			resp = 'O';
			System.out.println("1- adicionar um novo livro (objeto) ao seu carrinho"
					+ "\n2 - Editar/Atualizar uma informação de um livro no seu carrinho"
					+ "\n3- remover um atributo de um livro do seu carrinho"
					+ "\n4- Ver um livro especifico no seu carrinho" + "");
			System.out.printf("O que vocè quer fazer? ");
			resp2 = sc.nextInt();
			if (resp2 < 0 || resp2 > 4) {
				while (resp2 < 0 || resp2 > 4) {
					System.out.println("Desculpe, esse valor não é valido, digite novamente");
					System.out.println("1- adicionar um novo livro (objeto) ao seu carrinho"
							+ "\n2 - Editar/Atualizar uma informação de um livro no seu carrinho"
							+ "\n3- remover um atributo de um livro do seu carrinho"
							+ "\n4- Ver um livro especifico no seu carrinho" + "");
					resp2 = sc.nextInt();
				}
			}
			if (resp2 == 1) {
				at.construtor();
				at.setId(count);
				id.arrayID(at.getId(), at.getNomeLivro(), at.getAutorLivro(), at.getAssuntoLivro(), at.getPreco(),
						at.getQuantLivro());
				count++;
			}
			if (resp2 == 2) {
				System.out.println("Digite o ID do carrinho que voce deseja atualizar um atributo");
				int esc = sc.nextInt();
				id.mudarAtributos(esc);
				System.out.println(id.getArrayId(esc));
				//asdasdasd

			}
			if (resp2 == 3) {
				System.out.print("Digite o id do carrinho que você deseja remover:");
				int esc = sc.nextInt();
				id.removerId(esc);
				System.out.println(id.getArrayId(esc));
			}
			if (resp2 == 4) {
				System.out.print("Digite o id do carrinho que você deseja visualizar");
				System.out.println(id.getArrayId(sc.nextInt()));
			}

			System.out.print("Você quer continuar no programa? (sim/nao) ");
			resp = sc.next().charAt(0);
			at.setId(count);
		}
		System.out.println(id.total());
		sc.close();
	}
}
