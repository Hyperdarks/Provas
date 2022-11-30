package a3PetShop;

import java.util.Locale;
import java.util.Scanner;

public class PetShop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int resp = 1;
		int resp2 = 0;
		int count = 1;
		Atributos at = new Atributos();
		ArrayId id = new ArrayId();
		while (resp == 1) {
			System.out.println(
					"O que você quer fazer? \n1- adicionar um novo pedido \n2- Atualizar uma informação de um pedido "
							+ "\n3- remover um pedido do carrinho \n4- Ver a informação do pedido");
			resp2 = sc.nextInt();
			if (resp2 == 1) {
				at.construtor(count);
				id.arrayId(at.getId(), at.getNome(), at.getEspecie(), at.getRaca(), at.getBanho(), at.getTosa(),
						at.getVacina(), at.getPreco());
				System.out.println(id.getArrayId(count));
				count++;

			}
			if (resp2 == 2) {
				System.out.print("Digite o ID do pedido que voce deseja atualizar um atributo: ");
				int esc = sc.nextInt();
				System.out.println(
						"Digite o que voce quer atualizar\n1- Nome do animal\n2-Especie do animal\n3-raça do animal"
								+ "\n4-Tipo de banho\n5-Tipo de tosa\n6- Tipo de vacina");
				int esc2 = sc.nextInt();
				id.mudarAtributos(esc, esc2);
				System.out.println(id.getArrayId(esc));
			}
			if (resp2 == 3) {
				System.out.print("Digite o ID do pedido que voce deseja remover: ");
				int esc = sc.nextInt();
				id.removerId(esc);
				System.out.println(id.getArrayId(esc));
			}
			if (resp2 == 4) {
				System.out.print("Digite o ID do pedido que voce deseja visualizar as informações: ");
				int esc = sc.nextInt();
				System.out.println(id.getArrayId(esc));
			}
			System.out.print("Você quer continuar o programa? (1) Sim /(2) não ");
			resp = sc.nextInt();
		}
		System.out.println("Você decidiu sair do programa.");
		sc.close();

	}
}