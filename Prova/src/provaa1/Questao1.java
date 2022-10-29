package provaa1;

import java.util.Locale;
import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		String nome = "Leandro";

		String cpf = "12345678901";
		
		//sc.nextLine();
		char codigo1 = nome.charAt(0);
		char codigo2 = nome.charAt(2);
		
		int somaG = 0;
		int[] soma = new int[11];
		
		for(int i = 0; i <= 10; i++) {
			soma[i] = Character.getNumericValue(cpf.charAt(i));
			
			
		}
		
		for(int i = 0; i <= 10; i++) {
			somaG = somaG + soma[i];
			
		}
		
		int digito3 = Character.getNumericValue(cpf.charAt(2));
		int digito5 = Character.getNumericValue(cpf.charAt(4));
		int digito7 = Character.getNumericValue(cpf.charAt(6));
		int digito;
		System.out.println(digito3+""+""+digito5+""+digito7);
		if(digito5 != 0) {
			digito = digito3 % digito5 + digito7;
		}else{
			digito = digito3 % 1 + digito7;
		}
			
		
		System.out.println(somaG);
		System.out.printf(codigo1+""+codigo2+""+somaG+"-"+digito);
		sc.close();
	}

}
