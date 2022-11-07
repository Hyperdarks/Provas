package a3;

import java.util.Scanner;

public class ArrayId extends Atributos {
	Scanner sc = new Scanner(System.in);
	Atributos at = new Atributos();
	Biblioteca bi = new Biblioteca();
	String armazenaInfo;
	// private int i = 0;

	public int var = 10;
	String[][] arrayId = new String[var][var];

	public void arrayID(int id, String nome, String autor, String assunto, String preco, String quant) {
		Integer id2 = id;
		
		this.arrayId[id][0] = id2.toString();
		this.arrayId[id][1] = nome;
		this.arrayId[id][2] = autor;
		this.arrayId[id][3] = assunto;
		this.arrayId[id][4] = preco;
		this.arrayId[id][5] = quant;
	}
	
	public String getArrayId(int id) {
		return "\nid do produto: "+arrayId[id][0]+"\nNome do livro: "+arrayId[id][1]+"\nAutor do livro: "+arrayId[id][2]+
				"\nAssunto do livro: "+arrayId[id][3]+"\nPreco do livro: "+arrayId[id][4]+"\nQuantidade do mesmo livro: "+arrayId[id][5];
		
	
	}
	public void removerId(int id2) {
		System.out.println("Digite o que voce quer remover\n1- Nome do livro\n2-Autor do livro\n3-Assunto do livro"
				+ "\n4-Preco do livro\n5-Quantidade do mesmo livro");
		int opcao = sc.nextInt();
		String nul = "null";
		if(opcao == 1) {
			this.arrayId[id2][1] = nul;
		}if(opcao == 2) {
			this.arrayId[id2][2] = nul;
		}if(opcao == 3) {
			this.arrayId[id2][3] = nul;
		}if(opcao == 4) {
			this.arrayId[id2][4] = nul;
		}if(opcao == 5) {
			this.arrayId[id2][5] = nul;
		}
	}

	public void mudarAtributos(int id2) {
		System.out.println("Digite o que voce quer atualizar\n1- Nome do livro\n2-Autor do livro\n3-Assunto do livro"
				+ "\n4-Preco do livro\n5-Quantidade do mesmo livro");
		int opcao = sc.nextInt();
		System.out.println("Digite a nova informação que deseja substituir a antiga");
		sc.nextLine();
		String opcao2 = sc.nextLine();
		if(opcao == 1) {
			this.arrayId[id2][1] = opcao2;
		}if(opcao == 2) {
			this.arrayId[id2][2] = opcao2;
		}if(opcao == 3) {
			this.arrayId[id2][3] = opcao2;
		}if(opcao == 4) {
			this.arrayId[id2][4] = opcao2;
		}if(opcao == 5) {
			this.arrayId[id2][5] = opcao2;
		}
	}
	
	
	//String[] strArray = new String[]{id2.toString(), nome, autor, assunto, preco, quant };
	
	/*
	 * public void mudarAtributo(int id, int i) { setArrayId(id); if (i == 1) {
	 * nomeLivro2[id] = sc.nextLine(); System.out.println("Nome do livro: " +
	 * nomeLivro2[id] + "\nAutor do livro: " + autorLivro2[id] +
	 * "\nAssunto do livro: " + assuntoLivro2[id] +"\npreco do livro: "+preco2[id] +
	 * "\nQuantidade de livros: "+ quantLivro2[id]); } if (i == 2) { autorLivro2[id]
	 * = sc.nextLine(); System.out.println("Nome do livro: " + nomeLivro2[id] +
	 * "\nAutor do livro: " + autorLivro2[id] + "\nAssunto do livro: " +
	 * assuntoLivro2[id] +"\npreco do livro: "+preco2[id] +
	 * "\nQuantidade de livros: "+ quantLivro2[id]); }if(i ==3) { assuntoLivro2[id]
	 * = sc.nextLine(); System.out.println("Nome do livro: " + nomeLivro2[id] +
	 * "\nAutor do livro: " + autorLivro2[id] + "\nAssunto do livro: " +
	 * assuntoLivro2[id] +"\npreco do livro: "+preco2[id] +
	 * "\nQuantidade de livros: "+ quantLivro2[id]); }if(i ==4) { preco2[id] =
	 * sc.nextLine(); System.out.println("Nome do livro: " + nomeLivro2[id] +
	 * "\nAutor do livro: " + autorLivro2[id] + "\nAssunto do livro: " +
	 * assuntoLivro2[id] +"\npreco do livro: "+preco2[id] +
	 * "\nQuantidade de livros: "+ quantLivro2[id]); }if(i==5) { quantLivro2[id] =
	 * sc.nextLine(); System.out.println("Nome do livro: " + nomeLivro2[id] +
	 * "\nAutor do livro: " + autorLivro2[id] + "\nAssunto do livro: " +
	 * assuntoLivro2[id] +"\npreco do livro: "+preco2[id] +
	 * "\nQuantidade de livros: "+ quantLivro2[id]); }
	 * 
	 * }
	 */

}
