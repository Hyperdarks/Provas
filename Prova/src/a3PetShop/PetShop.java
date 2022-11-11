package a3PetShop;

import java.util.Locale;
import java.util.Scanner;

public class PetShop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		char resp = 's';
		int resp2 = 0;
		int[] array = new int[10];
		int count = 1;
		int opcao;
		Atributos at = new Atributos();
		ArrayId id = new ArrayId();
		while (resp == 's' || resp == 'S') {
			System.out.println(
					"O que você quer fazer? \n1- adicionar um novo pedido \n2- Atualizar uma informação de um pedido ");
			resp2 = sc.nextInt();
			if (resp2 == 1) {
				sc.nextLine();
				System.out.println("Digite o nome do animal: ");
				at.setNome(sc.nextLine());
				System.out.println("Digite a especie do animal: ");
				at.setEspecie(sc.nextLine());
				System.out.println("Digite a raça do animal: ");
				at.setRaca(sc.nextLine());
				System.out.println("Qual opcao você vai querer? \n1- Dar banho \n2- Tosagem \n3-Dar vacina"
						+ " \n4- Banho e tosa \n5-tosa e vacina \n6-banho e vacina \n7- Todos os tres");
				opcao = sc.nextInt();
				if (opcao == 1) {
					System.out.println(
							"Qual tipo de banho você deseja? \n1- Banho simples (70) \n2- Banho com hidratação (110)");
					opcao = sc.nextInt();
					while (opcao > 2 || opcao < 1) {
						System.out.println("Desculpe essa opcão nao existe, por favor digite novamente");
						opcao = sc.nextInt();
					}
					at.setBanho(opcao);
				}

				else if (opcao == 2) {
					System.out.println(
							"Qual tipo de tosagem você deseja? \n1- Tosa simples (80) \n2- tosa com tesoura (145)");
					opcao = sc.nextInt();
					at.setTosa(opcao);
				} else if (opcao == 3) {
					System.out.println("Qual tipo de vacina você deseja? \n1- antirrábica (80) \n2- Gripe (130) ");
					opcao = sc.nextInt();
					at.setVacina(opcao);
				} else if (opcao == 4) {
					System.out.println(
							"Qual tipo de banho você deseja? \n1- Banho simples (70) \n2- Banho com hidratação (110)");
					opcao = sc.nextInt();
					at.setBanho(opcao);
					System.out.println(
							"Qual tipo de tosagem você deseja? \n1- Tosa simples (80) \n2- tosa com tesoura (145)");
					opcao = sc.nextInt();
					at.setTosa(opcao);
				} else if (opcao == 5) {
					System.out.println(
							"Qual tipo de tosagem você deseja? \n1- Tosa simples (80) \n2- tosa com tesoura (145)");
					opcao = sc.nextInt();
					at.setTosa(opcao);
					System.out.println("Qual tipo de vacina você deseja? \n1- antirrábica (80) \n2- Gripe (130) ");
					opcao = sc.nextInt();
					at.setVacina(opcao);
				} else if (opcao == 6) {
					System.out.println(
							"Qual tipo de banho você deseja? \n1- Banho simples (70) \n2- Banho com hidratação (110)");
					opcao = sc.nextInt();
					at.setBanho(opcao);
					System.out.println("Qual tipo de vacina você deseja? \n1- antirrábica (80) \n2- Gripe (130) ");
					opcao = sc.nextInt();
					at.setVacina(opcao);

				} else if (opcao == 7) {
					System.out.println(
							"Qual tipo de banho você deseja? \n1- Banho simples (70) \n2- Banho com hidratação (110)");
					opcao = sc.nextInt();
					at.setBanho(opcao);
					System.out.println(
							"Qual tipo de tosagem você deseja? \n1- Tosa simples (80) \n2- tosa com tesoura (145)");
					opcao = sc.nextInt();
					at.setTosa(opcao);
					System.out.println("Qual tipo de vacina você deseja? \n1- antirrábica (80) \n2- Gripe (130) ");
					opcao = sc.nextInt();
					at.setVacina(opcao);
				}
				at.setId(count);
				id.arrayId(at.getId(), at.getNome(), at.getEspecie(), at.getRaca(), at.getBanho(), at.getTosa(),
						at.getVacina(), at.getPreco());
				System.out.println(id.getArrayId(count));
				count++;
				at.setTosa(5);
				at.setBanho(5);
				at.setVacina(5);
				at.setPreco(0);

			}
			if (resp2 == 2) {
				System.out.println("Digite o ID do pedido que voce deseja atualizar um atributo");
				int esc = sc.nextInt();
				System.out.println(
						"Digite o que voce quer atualizar\n1- Nome do animal\n2-Especie do animal\n3-raça do animal"
								+ "\n4-Tipo de banho\n5-Tipo de tosa\n6- Tipo de vacina");
				int esc2 = sc.nextInt();
				id.mudarAtributos(esc, esc2);
				System.out.println(id.getArrayId(esc));
			}
			if (resp2 == 4) {
				System.out.println("Digite o ID do pedido que voce deseja atualizar um atributo");
				int esc = sc.nextInt();
				System.out.println(id.getArrayId(esc));
			}
			System.out.println("Você quer continuar o programa? (s)/(n)");
			resp = sc.next().charAt(0);
		}
	}
}
