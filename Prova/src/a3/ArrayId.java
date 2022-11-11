package a3;

import java.util.Scanner;

public class ArrayId extends Atributos {
	Scanner sc = new Scanner(System.in);
	Atributos at = new Atributos();
	Biblioteca bi = new Biblioteca();
	public int total;
	String armazenaInfo;

	public int var = 6;

	public String[][] arrayId = new String[var][var];

	String[][] arrayId2 = new String[var * 1000][var * 1000];

	public void arrayID(int id, String nome, String autor, String assunto, String preco, String quant) {
		Integer id2 = id;
		if (id2 < 6) {
			this.arrayId[id][0] = id2.toString();
			this.arrayId[id][1] = nome;
			this.arrayId[id][2] = autor;
			this.arrayId[id][3] = assunto;
			this.arrayId[id][4] = preco;
			this.arrayId[id][5] = quant;
			for (int i = 0; i < arrayId.length; i++) {
				this.arrayId2[i][0] = arrayId[i][0];
				this.arrayId2[i][1] = arrayId[i][1];
				this.arrayId2[i][2] = arrayId[i][2];
				this.arrayId2[i][3] = arrayId[i][3];
				this.arrayId2[i][4] = arrayId[i][4];
				this.arrayId2[i][5] = arrayId[i][5];

			}
		} else {
			this.arrayId2[id][0] = id2.toString();
			this.arrayId2[id][1] = nome;
			this.arrayId2[id][2] = autor;
			this.arrayId2[id][3] = assunto;
			this.arrayId2[id][4] = preco;
			this.arrayId2[id][5] = quant;

		}
		this.total= total + (Integer.parseInt(preco) * Integer.parseInt(quant));
	}

	public String getArrayId(int id) {
		if (id < 6) {
			return "\nid do produto: " + arrayId[id][0] + "\n1- Nome do livro: " + arrayId[id][1]
					+ "\n2-Autor do livro: " + arrayId[id][2] + "\n3-Assunto do livro: " + arrayId[id][3]
					+ "\n4-Preco do livro: " + arrayId[id][4] + "\n5-Quantidade do mesmo livro: " + arrayId[id][5];
		} else {
			return "\nid do produto: " + arrayId2[id][0] + "\n1-Nome do livro: " + arrayId2[id][1]
					+ "\n2-Autor do livro: " + arrayId2[id][2] + "\n3-Assunto do livro: " + arrayId2[id][3]
					+ "\n4-Preco do livro: " + arrayId2[id][4] + "\n5-Quantidade do mesmo livro: " + arrayId2[id][5];
		}
	}

	public void removerId(int id2) {
		if (id2 < 6) {

			this.total = total - (Integer.parseInt(arrayId[id2][4]) * Integer.parseInt(arrayId[id2][5]));
			for (int i = id2; i < arrayId.length - 1; i++) {
				this.arrayId[i][0] = arrayId2[i][0];
				this.arrayId[i][1] = arrayId2[i + 1][1];
				this.arrayId[i][2] = arrayId2[i + 1][2];
				this.arrayId[i][3] = arrayId2[i + 1][3];
				this.arrayId[i][4] = arrayId2[i + 1][4];
				this.arrayId[i][5] = arrayId2[i + 1][5];
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
			}
			for (int i = 1; i < 6; i++) {
				this.arrayId[i][i] = arrayId2[i][i];

			}
			
		}
	}
	public String total() {
		return "Esse é o valor do seu carrinho total: "+total;
	}
	public void mudarAtributos(int id2) {
		System.out.println("Digite o que voce quer atualizar\n1- Nome do livro\n2-Autor do livro\n3-Assunto do livro"
				+ "\n4-Preco do livro\n5-Quantidade do mesmo livro");
		int opcao = sc.nextInt();
		System.out.println("Digite a nova informação que deseja substituir a antiga");
		sc.nextLine();
		String opcao2 = sc.nextLine();
		if (id2 < 6) {
			if (opcao == 1) {
				this.arrayId[id2][1] = opcao2;
				this.arrayId2[id2][1] = opcao2;
			}
			if (opcao == 2) {
				this.arrayId[id2][2] = opcao2;
				this.arrayId2[id2][2] = opcao2;
			}
			if (opcao == 3) {
				this.arrayId[id2][3] = opcao2;
				this.arrayId2[id2][3] = opcao2;
			}
			if (opcao == 4) {
				this.total = total - Integer.parseInt(arrayId[id2][4]) * Integer.parseInt(arrayId[id2][5]);
				this.arrayId[id2][4] = opcao2;
				this.arrayId2[id2][4] = opcao2;
				this.total = total + Integer.parseInt(arrayId[id2][4]) * Integer.parseInt(arrayId[id2][5]);
				this.arrayId2[id2][4] = arrayId[id2][4];
			}
			if (opcao == 5) {
				this.total = total - Integer.parseInt(arrayId[id2][4]) * Integer.parseInt(arrayId[id2][5]);
				this.arrayId[id2][5] = opcao2;
				this.arrayId2[id2][5] = opcao2;
				this.total = total + Integer.parseInt(arrayId[id2][4]) * Integer.parseInt(arrayId[id2][5]);
				this.arrayId2[id2][5] = arrayId[id2][5];
			}
		
		}
	}
}
