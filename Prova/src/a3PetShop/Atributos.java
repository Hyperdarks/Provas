package a3PetShop;

import java.util.Scanner;


public class Atributos extends PetShop {
	Scanner sc = new Scanner(System.in);
	private String nome, especie, raca;
	private String banho, tosa, vacina;
	private int id, preco;

	public String getNome() {
		return nome;
	}

	public int getPreco() {
		return preco;
	}

	public void setPreco(int preco) {
		this.preco = preco;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getBanho() {
		return banho;
	}

	public void setBanho(int opcao) {
		if (opcao == 1) {
			this.banho = "70";
			this.preco = preco + 70;
		}else if(opcao ==2){
			this.banho = "110";
			this.preco = preco + 110;
		} else {
			this.banho = "Não selecionado";
		}
	}

	public String getTosa() {
		return tosa;
	}

	public void setTosa(int opcao) {
		if (opcao == 1) {
			this.tosa = "80";
			this.preco = preco + 80;
		}
		else if (opcao == 2) {
			this.tosa = "145";
			this.preco = preco + 145;
		} else {
			this.tosa = "Não selecionado";
		}
	}

	public String getVacina() {
		return vacina;
	}

	public void setVacina(int opcao) {
		if (opcao == 1) {
			this.vacina = "80";
			this.preco = preco + 80;
		} else if (opcao == 2) {
			this.vacina = "130";
			this.preco = preco + 130;
		} else {
			this.vacina = "Não selecionado";
		}
	}
	
	public void construtor() {
		System.out.print("Digite o nome do animal: ");
		setNome(sc.nextLine());
		System.out.print("Digite a especie do animal: ");
		setEspecie(sc.nextLine());
		System.out.print("Digite a raça do animal: ");
		setRaca(sc.nextLine());
		setTosa(5);
		setBanho(5);
		setVacina(5);
		setPreco(0);
	}
	public void padrao() {
		
	}

}