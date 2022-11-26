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
	
	public void construtor(int count) {
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
		System.out.println("Qual opcao você vai querer? \n1- Dar banho \n2- Tosagem \n3-Dar vacina"
				+ " \n4- Banho e tosa \n5-tosa e vacina \n6-banho e vacina \n7- Todos os tres");
		int opcao = sc.nextInt();
		if (opcao == 1) {
			System.out.println(
					"Qual tipo de banho você deseja? \n1- Banho simples (70) \n2- Banho com hidratação (110)");
			opcao = sc.nextInt();
			while (opcao > 2 || opcao < 1) {
				System.out.print("Desculpe essa opcão nao existe, por favor digite novamente");
				opcao = sc.nextInt();
			}
			setBanho(opcao);
		}

		else if (opcao == 2) {
			System.out.println(
					"Qual tipo de tosagem você deseja? \n1- Tosa simples (80) \n2- tosa com tesoura (145)");
			opcao = sc.nextInt();
			setTosa(opcao);
		} else if (opcao == 3) {
			System.out.println("Qual tipo de vacina você deseja? \n1- antirrábica (80) \n2- Gripe (130) ");
			opcao = sc.nextInt();
			setVacina(opcao);
		} else if (opcao == 4) {
			System.out.println(
					"Qual tipo de banho você deseja? \n1- Banho simples (70) \n2- Banho com hidratação (110)");
			opcao = sc.nextInt();
			setBanho(opcao);
			System.out.println(
					"Qual tipo de tosagem você deseja? \n1- Tosa simples (80) \n2- tosa com tesoura (145)");
			opcao = sc.nextInt();
			setTosa(opcao);
		} else if (opcao == 5) {
			System.out.println(
					"Qual tipo de tosagem você deseja? \n1- Tosa simples (80) \n2- tosa com tesoura (145)");
			opcao = sc.nextInt();
			setTosa(opcao);
			System.out.println("Qual tipo de vacina você deseja? \n1- antirrábica (80) \n2- Gripe (130) ");
			opcao = sc.nextInt();
			setVacina(opcao);
		} else if (opcao == 6) {
			System.out.println(
					"Qual tipo de banho você deseja? \n1- Banho simples (70) \n2- Banho com hidratação (110)");
			opcao = sc.nextInt();
			setBanho(opcao);
			System.out.println("Qual tipo de vacina você deseja? \n1- antirrábica (80) \n2- Gripe (130) ");
			opcao = sc.nextInt();
			setVacina(opcao);

		} else if (opcao == 7) {
			System.out.println(
					"Qual tipo de banho você deseja? \n1- Banho simples (70) \n2- Banho com hidratação (110)");
			opcao = sc.nextInt();
			setBanho(opcao);
			System.out.println(
					"Qual tipo de tosagem você deseja? \n1- Tosa simples (80) \n2- tosa com tesoura (145)");
			opcao = sc.nextInt();
			setTosa(opcao);
			System.out.println("Qual tipo de vacina você deseja? \n1- antirrábica (80) \n2- Gripe (130) ");
			opcao = sc.nextInt();
			setVacina(opcao);
		}
		setId(count);
		sc.nextLine();
	}
	public void padrao() {
		
	}

}