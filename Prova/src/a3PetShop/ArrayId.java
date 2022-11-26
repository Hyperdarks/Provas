package a3PetShop;

import java.util.Scanner;

public class ArrayId {
	Scanner sc = new Scanner(System.in);
	Atributos at = new Atributos();
	PetShop ps = new PetShop();
	private int total;
	private int var = 8;
	private String[][] arrayId = new String[var][var];

	String[][] arrayId2 = new String[var * 1000][var * 1000];

	public void arrayId(int id, String nome, String especie, String raca, String banho, String tosa, String vacina,
			int preco) {
		Integer preco3 = preco;
		Integer id2 = id;
		String preco2 = preco3.toString();
		if (id < 8) {
			this.arrayId[id][0] = id2.toString();
			this.arrayId[id][1] = nome;
			this.arrayId[id][2] = especie;
			this.arrayId[id][3] = raca;
			this.arrayId[id][4] = banho;
			this.arrayId[id][5] = tosa;
			this.arrayId[id][6] = vacina;
			this.arrayId[id][7] = preco2;
		} else {
			this.arrayId2[id][0] = id2.toString();
			this.arrayId2[id][1] = nome;
			this.arrayId2[id][2] = especie;
			this.arrayId2[id][3] = raca;
			this.arrayId2[id][4] = banho;
			this.arrayId2[id][5] = tosa;
			this.arrayId2[id][6] = vacina;
			this.arrayId2[id][7] = preco2;
		}

	}

	public void mudarAtributos(int id2, int opcao) {

		if (opcao == 1) {
			System.out.println("Digite um novo nome");
			String opcao2 = sc.nextLine();
			this.arrayId[id2][1] = opcao2;
			this.arrayId2[id2][1] = opcao2;
		} else if (opcao == 2) {
			System.out.println("Digite um novo especie");
			String opcao2 = sc.nextLine();
			this.arrayId[id2][2] = opcao2;
			this.arrayId2[id2][2] = opcao2;
		} else if (opcao == 3) {
			System.out.println("Digite um novo raça");
			String opcao2 = sc.nextLine();
			this.arrayId[id2][3] = opcao2;
			this.arrayId2[id2][3] = opcao2;
		}
		if (opcao == 4) {
			System.out
					.println("Qual tipo de banho você deseja? \n1- Banho simples (70) \n2- Banho com hidratação (110)");
			int opcao2 = sc.nextInt();
			if (opcao2 == 1) {
				if (arrayId2[id2][4] == "110" || arrayId[id2][4] == "110") {
					total = Integer.parseInt(arrayId2[id2][7]) - 110 + 70;
					Integer tot = total;
					this.arrayId2[id2][7] = tot.toString();
					this.arrayId[id2][7] = tot.toString();
					this.arrayId[id2][4] = "70";
					this.arrayId2[id2][4] = "70";
				} else if (arrayId2[id2][4] == "70" || arrayId[id2][4] == "70") {
					this.arrayId[id2][4] = arrayId[id2][4];
					this.arrayId2[id2][4] = arrayId2[id2][4];
				} else {
					if (arrayId2[id2][7] == null || arrayId[id2][7] == null) {
						arrayId2[id2][7] = "0";
						arrayId[id2][7] = "0";
					}
					this.arrayId[id2][4] = "70";
					this.arrayId2[id2][4] = "70";
					total = Integer.parseInt(arrayId[id2][7]) + 70;
					Integer tot = total;
					this.arrayId2[id2][7] = tot.toString();
					this.arrayId[id2][7] = tot.toString();
				}

			}
			if (opcao2 == 2) {
				if (arrayId2[id2][4] == "70" || arrayId[id2][4] == "70") {
					total = Integer.parseInt(arrayId2[id2][7]) + 110 - 70;
					Integer tot = total;
					this.arrayId2[id2][7] = tot.toString();
					this.arrayId[id2][7] = tot.toString();
					this.arrayId[id2][4] = "110";
					this.arrayId2[id2][4] = "110";
				} else if (arrayId2[id2][4] == "110" || arrayId[id2][4] == "110") {
					this.arrayId[id2][4] = arrayId[id2][4];
					this.arrayId2[id2][4] = arrayId2[id2][4];
				} else {
					if (arrayId2[id2][7] == null || arrayId[id2][7] == null) {
						arrayId2[id2][7] = "0";
						arrayId[id2][7] = "0";
					}
					this.arrayId[id2][4] = "110";
					this.arrayId2[id2][4] = "110";
					total = Integer.parseInt(arrayId[id2][7]) + 110;
					Integer tot = total;
					this.arrayId2[id2][7] = tot.toString();
					this.arrayId[id2][7] = tot.toString();
				}
			}

		}
		if (opcao == 5) {
			System.out.println("Qual tipo de tosa você deseja? \n1- Tosa simples (80) \n2- tosa com tesoura (145)");
			int opcao2 = sc.nextInt();
			if (opcao2 == 1) {
				if (arrayId2[id2][5] == "145" || arrayId[id2][5] == "145") {
					total = Integer.parseInt(arrayId2[id2][7]) - 145 + 80;
					Integer tot = total;
					this.arrayId2[id2][7] = tot.toString();
					this.arrayId[id2][7] = tot.toString();
					this.arrayId[id2][5] = "80";
					this.arrayId2[id2][5] = "80";
				} else if (arrayId2[id2][5] == "80" || arrayId[id2][5] == "80") {
					this.arrayId[id2][5] = arrayId[id2][5];
					this.arrayId2[id2][5] = arrayId2[id2][5];
				} else {
					if (arrayId2[id2][7] == null || arrayId[id2][7] == null) {
						arrayId2[id2][7] = "0";
						arrayId[id2][7] = "0";
					}
					this.arrayId[id2][5] = "80";
					this.arrayId2[id2][5] = "80";
					total = Integer.parseInt(arrayId[id2][7]) + 80;
					Integer tot = total;
					this.arrayId2[id2][7] = tot.toString();
					this.arrayId[id2][7] = tot.toString();

				}
			}
			if (opcao2 == 2) {
				if (arrayId2[id2][5] == "80" || arrayId[id2][5] == "80") {
					total = Integer.parseInt(arrayId2[id2][7]) + 145 - 80;
					Integer tot = total;
					this.arrayId2[id2][7] = tot.toString();
					this.arrayId[id2][7] = tot.toString();
					this.arrayId[id2][5] = "145";
					this.arrayId2[id2][5] = "145";
				} else if (arrayId2[id2][5] == "145" || arrayId[id2][5] == "145") {
					this.arrayId[id2][5] = arrayId[id2][5];
					this.arrayId2[id2][5] = arrayId2[id2][5];

				} else {
					if (arrayId2[id2][7] == null || arrayId[id2][7] == null) {
						arrayId2[id2][7] = "0";
						arrayId[id2][7] = "0";
					}
					this.arrayId[id2][5] = "145";
					this.arrayId2[id2][5] = "145";
					total = Integer.parseInt(arrayId2[id2][7]) + 145;
					Integer tot = total;
					this.arrayId2[id2][7] = tot.toString();
					this.arrayId[id2][7] = tot.toString();
				}
			}
		}
		if (opcao == 6) {
			System.out.println("Qual tipo de vacina você deseja? \n1- antirrábica (80) \n2- Gripe (130) ");
			int opcao2 = sc.nextInt();
			if (opcao2 == 1) {
				if (arrayId[id2][6] == "130" || arrayId2[id2][6] == "130") {
					total = Integer.parseInt(arrayId2[id2][7]) - 130 + 80;
					Integer tot = total;
					this.arrayId2[id2][7] = tot.toString();
					this.arrayId2[id2][7] = tot.toString();
					this.arrayId[id2][6] = "80";
					this.arrayId2[id2][6] = "80";
				} else if (arrayId[id2][6] == "80" || arrayId2[id2][6] == "80") {
					this.arrayId[id2][6] = arrayId[id2][6];
					this.arrayId2[id2][6] = arrayId2[id2][6];

				} else {
					if (arrayId2[id2][7] == null || arrayId[id2][7] == null) {
						arrayId2[id2][7] = "0";
						arrayId[id2][7] = "0";
					}
					this.arrayId[id2][6] = "80";
					this.arrayId2[id2][6] = "80";
					total = Integer.parseInt(arrayId2[id2][7]) + 80;
					Integer tot = total;
					this.arrayId2[id2][7] = tot.toString();
					this.arrayId[id2][7] = tot.toString();
				}
			}
			if (opcao2 == 2) {
				at.setPreco(0);
				if (arrayId[id2][6] == "130" || arrayId2[id2][6] == "130") {
					this.arrayId[id2][6] = arrayId[id2][6];
					this.arrayId2[id2][6] = arrayId2[id2][6];
				} else if (arrayId[id2][6] == "80" || arrayId2[id2][6] == "80") {
					total = Integer.parseInt(arrayId2[id2][7]) + 130 - 80;
					Integer tot = total;
					this.arrayId[id2][6] = "130";
					this.arrayId2[id2][6] = "130";
					this.arrayId[id2][7] = tot.toString();
					this.arrayId2[id2][7] = tot.toString();
				} else {
					if (arrayId2[id2][7] == null || arrayId[id2][7] == null) {
						arrayId2[id2][7] = "0";
						arrayId[id2][7] = "0";
					}
					this.arrayId[id2][6] = "130";
					this.arrayId2[id2][6] = "130";
					total = Integer.parseInt(arrayId2[id2][7]) + 130;
					Integer tot = total;
					this.arrayId2[id2][7] = tot.toString();
					this.arrayId[id2][7] = tot.toString();
				}
			}
		}

	}

	public String getArrayId(int id) {
		if (id < 6) {
			return "\nid do produto: " + arrayId[id][0] + "\n1- Nome do animal: " + arrayId[id][1]
					+ "\n2-Especie do animal: " + arrayId[id][2] + "\n3-Raca do animal: " + arrayId[id][3]
					+ "\n4-Preco do banho: " + arrayId[id][4] + "\n5-Preco da tosa: " + arrayId[id][5]
					+ "\n6-Preco da vacina: " + arrayId[id][6] + "\n7-Preco total: " + arrayId[id][7];
		} else {
			return "\nid do produto: " + arrayId2[id][0] + "\n1- Nome do animal: " + arrayId2[id][1]
					+ "\n2-Especie do animal: " + arrayId2[id][2] + "\n3-Raca do animal: " + arrayId2[id][3]
					+ "\n4-Preco do banho: " + arrayId2[id][4] + "\n5-Preco da tosa: " + arrayId2[id][5]
					+ "\n6-Preco da vacina: " + arrayId2[id][6] + "\n7-Preco total: " + arrayId2[id][7];
		}

	}

	public void removerId(int id2) {
		if (id2 < 6) {

			for (int i = id2; i < arrayId.length - 1; i++) {
				this.arrayId[i][0] = arrayId2[i][0];
				this.arrayId[i][1] = arrayId2[i + 1][1];
				this.arrayId[i][2] = arrayId2[i + 1][2];
				this.arrayId[i][3] = arrayId2[i + 1][3];
				this.arrayId[i][4] = arrayId2[i + 1][4];
				this.arrayId[i][5] = arrayId2[i + 1][5];
				this.arrayId[i][6] = arrayId2[i + 1][6];
				this.arrayId[i][7] = arrayId2[i + 1][7];
			}
			for (int i = 1; i < arrayId.length; i++) {
				this.arrayId2[i][i] = arrayId[i][i];

			}
		} else {

			this.total = total - (Integer.parseInt(arrayId[id2][4]) * Integer.parseInt(arrayId[id2][5]));
			for (int i = id2; i < arrayId2.length - 1; i++) {
				this.arrayId2[i][0] = arrayId2[i][0];
				this.arrayId2[i][1] = arrayId2[i + 1][1];
				this.arrayId2[i][2] = arrayId2[i + 1][2];
				this.arrayId2[i][3] = arrayId2[i + 1][3];
				this.arrayId2[i][4] = arrayId2[i + 1][4];
				this.arrayId2[i][5] = arrayId2[i + 1][5];
				this.arrayId2[i][6] = arrayId2[i + 1][6];
				this.arrayId2[i][7] = arrayId2[i + 1][7];
			}
			for (int i = 1; i < 6; i++) {
				this.arrayId[i][i] = arrayId2[i][i];

			}

		}
	}

}