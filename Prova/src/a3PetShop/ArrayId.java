package a3PetShop;

import java.util.Scanner;

public class ArrayId {
	Scanner sc = new Scanner(System.in);
	Atributos at = new Atributos();
	PetShop ps = new PetShop();
	private int var = 8;
	private Object[][] arrayId = new Object[var][var];

	Object[][] arrayId2 = new Object[var * 1000][var * 1000];

	public void arrayId(int id, String nome, String especie, String raca, String banho, String tosa, String vacina,
			int preco) {
		if (id < 8) {
			this.arrayId[id][0] = id;
			this.arrayId[id][1] = nome;
			this.arrayId[id][2] = especie;
			this.arrayId[id][3] = raca;
			this.arrayId[id][4] = banho;
			this.arrayId[id][5] = tosa;
			this.arrayId[id][6] = vacina;
			this.arrayId[id][7] = preco;

			this.arrayId2[id][0] = id;
			this.arrayId2[id][1] = nome;
			this.arrayId2[id][2] = especie;
			this.arrayId2[id][3] = raca;
			this.arrayId2[id][4] = banho;
			this.arrayId2[id][5] = tosa;
			this.arrayId2[id][6] = vacina;
			this.arrayId2[id][7] = preco;
		} else {
			this.arrayId2[id][0] = id;
			this.arrayId2[id][1] = nome;
			this.arrayId2[id][2] = especie;
			this.arrayId2[id][3] = raca;
			this.arrayId2[id][4] = banho;
			this.arrayId2[id][5] = tosa;
			this.arrayId2[id][6] = vacina;
			this.arrayId2[id][7] = preco;
		}

	}

	public void mudarAtributos(int id2, int opcao) {

		if (opcao == 1) {
			System.out.println("Digite um novo nome");
			String opcao2 = sc.nextLine();
			this.arrayId2[id2][1] = opcao2;
		} else if (opcao == 2) {
			System.out.println("Digite um novo especie");
			String opcao2 = sc.nextLine();
			this.arrayId2[id2][2] = opcao2;
		} else if (opcao == 3) {
			System.out.println("Digite um novo raça");
			String opcao2 = sc.nextLine();
			this.arrayId2[id2][3] = opcao2;
		}
		if (opcao == 4) {
			System.out
					.println("Qual tipo de banho você deseja? \n1- Banho simples (70) \n2- Banho com hidratação (110)");
			int opcao2 = sc.nextInt();
			if (opcao2 == 1) {
				if (arrayId2[id2][4] == "110") {
					this.arrayId2[id2][7] = (int) arrayId2[id2][7] - 110 + 70;
					this.arrayId2[id2][4] = "70";
				} else if (arrayId2[id2][4] == "70") {
					this.arrayId2[id2][4] = arrayId2[id2][4];
				} else {
					if (arrayId2[id2][7] == null) {
						arrayId2[id2][7] = 0;
					}
					this.arrayId2[id2][4] = "70";
					this.arrayId2[id2][7] = (int) arrayId2[id2][7] + 70;
				}

			}
			if (opcao2 == 2) {
				if (arrayId2[id2][4] == "70") {
					this.arrayId2[id2][7] = (int) arrayId2[id2][7] + 110 - 70;
					this.arrayId2[id2][4] = "110";
				} else if (arrayId2[id2][4] == "110") {
					this.arrayId2[id2][4] = arrayId2[id2][4];
				} else {
					if (arrayId2[id2][7] == null) {
						arrayId2[id2][7] = 0;
					}
					this.arrayId2[id2][4] = "110";
					this.arrayId2[id2][7] = (int) arrayId2[id2][7] + 110;
				}
			}

		}
		if (opcao == 5) {
			System.out.println("Qual tipo de tosa você deseja? \n1- Tosa simples (80) \n2- tosa com tesoura (145)");
			int opcao2 = sc.nextInt();
			if (opcao2 == 1) {
				if (arrayId2[id2][5] == "145") {
					this.arrayId2[id2][7] = (int) arrayId2[id2][7] - 145 + 80;;
					this.arrayId2[id2][5] = "80";
				}if (arrayId2[id2][5] == "80") {
					this.arrayId2[id2][5] = arrayId2[id2][5];
				} else {
					if (arrayId2[id2][7] == null) {
						arrayId2[id2][7] = 0;
					}
					this.arrayId2[id2][5] = "80";
					this.arrayId2[id2][7] = (int) arrayId2[id2][7] + 80;

				}
			}
			if (opcao2 == 2) {
				if (arrayId2[id2][5] == "80") {
					this.arrayId2[id2][7] = (int) arrayId2[id2][7] + 145 - 80;
					this.arrayId2[id2][5] = "145";
				}if (arrayId2[id2][5] == "145") {
					this.arrayId2[id2][5] = arrayId2[id2][5];

				} else {
					if (arrayId2[id2][7] == null) {
						arrayId2[id2][7] = 0;
					}
					this.arrayId2[id2][5] = "145";
					this.arrayId2[id2][7] = (int) arrayId2[id2][7] + 145;
				}
			}
		}
		if (opcao == 6) {
			System.out.println("Qual tipo de vacina você deseja? \n1- antirrábica (80) \n2- Gripe (130) ");
			int opcao2 = sc.nextInt();
			if (opcao2 == 1) {
				if (arrayId2[id2][6] == "130") {
					this.arrayId2[id2][7] = (int) arrayId2[id2][7] - 130 + 80;
					this.arrayId2[id2][6] = "80";
				}if (arrayId2[id2][6] == "80") {
					this.arrayId2[id2][6] = arrayId2[id2][6];

				} else {
					if (arrayId2[id2][7] == null) {
						arrayId2[id2][7] = 0;
					}
					this.arrayId2[id2][6] = "80";
					this.arrayId2[id2][7] = (int) arrayId2[id2][7] + 80;
				}
			}
			if (opcao2 == 2) {
				at.setPreco(0);
				if (arrayId2[id2][6] == "130") {
					this.arrayId2[id2][6] = arrayId2[id2][6];
				}if (arrayId2[id2][6] == "80") {
					this.arrayId2[id2][6] = "130";
					this.arrayId2[id2][7] = (int) arrayId2[id2][7] + 130 - 80;
				} else {
					if (arrayId2[id2][7] == null) {
						arrayId2[id2][7] = 0;
					}
					this.arrayId2[id2][6] = "130";
					this.arrayId2[id2][7] = (int) arrayId2[id2][7] + 130;
				}
			}
		}

	}

	public String getArrayId(int id) {

		return "\nid do produto: " + arrayId2[id][0] + "\n1- Nome do animal: " + arrayId2[id][1]
				+ "\n2-Especie do animal: " + arrayId2[id][2] + "\n3-Raca do animal: " + arrayId2[id][3]
				+ "\n4-Preco do banho: " + arrayId2[id][4] + "\n5-Preco da tosa: " + arrayId2[id][5]
				+ "\n6-Preco da vacina: " + arrayId2[id][6] + "\n7-Preco total: " + arrayId2[id][7];

	}

	public void removerId(int id) {
		Object[] newArray = new Object[arrayId2.length - 1];
		if (id > 7) {
			for (int i = 0; i < arrayId2.length - 1; i++) {
				if (i < id) {
					arrayId2[id][i] = newArray[i];
				} else if (i > id) {
					arrayId2[id][i - 1] = newArray[i];
				}
			}

		}
	}
}
