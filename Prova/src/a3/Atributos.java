package a3;

import java.util.Scanner;

public class Atributos extends Biblioteca {
	Scanner sc = new Scanner(System.in);
	private String atributo;
	private int id;
	private String quantLivro;
	private String assuntoLivro, autorLivro, nomeLivro;
	private String preco;

	public String getAssuntoLivro() {
		return assuntoLivro;
	}

	public void setAssuntoLivro(String assuntoLivro) {
		this.assuntoLivro = assuntoLivro;
	}

	public String getAutorLivro() {
		return autorLivro;
	}

	public void setAutorLivro(String autorLivro) {
		this.autorLivro = autorLivro;
	}

	public String getNomeLivro() {
		return nomeLivro;
	}

	public void setNomeLivro(String nomeLivro) {
		this.nomeLivro = nomeLivro;
	}

	public String getPreco() {
		return preco;
	}

	public void setPreco(String preco) {
		this.preco = preco;
	}

	public String getQuantLivro() {
		return quantLivro;
	}

	public void setQuantLivro(String quantLivro) {
		this.quantLivro = quantLivro;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String atributo() {
		return atributo = "Nome do livro: " + getNomeLivro() + "\nAutor do livro: " + getAutorLivro()
				+ "\nAssunto do livro: " + getAssuntoLivro() + "\npreco do livro: " + getPreco()
				+ "\nQuantidade de livros: " + getQuantLivro();
	}
	public void construtor() {
		System.out.print("Digite o nome do livro: ");
		setNomeLivro(sc.nextLine());
		System.out.print("Digite o autor do livro: ");
		setAutorLivro(sc.nextLine());
		System.out.print("Digite o assunto do livro: ");
		setAssuntoLivro(sc.nextLine());
		System.out.print("Digite o preço do livro: ");
		setPreco(sc.nextLine());
		System.out.print("Digite a quantidade do mesmo livro: ");
		setQuantLivro(sc.nextLine());
	}

}
