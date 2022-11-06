package a3;

public class Atributos extends Biblioteca{
	private String atributo;
	private int id;
	private int quantLivro;
	private String assuntoLivro, autorLivro, nomeLivro;
	private double preco;

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

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantLivro() {
		return quantLivro;
	}

	public void setQuantLivro(int quantLivro) {
		this.quantLivro = quantLivro;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String atributos() {
		return atributo = "Nome do livro: " + nomeLivro + "\nAutor do livro: " + autorLivro + "\nAssunto do livro: " + assuntoLivro
				+"\npreco do livro: "+preco + "\nQuantidade de livros: "+ quantLivro;
	}



}
