package Pratica1_LP;

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		
		String placa;
		short ano;
		
		Scanner ler=new Scanner(System.in);
		
		System.out.println("Entre com a placa do carro: ");
		placa=ler.nextLine();
		System.out.println("Entre com o ano de fabricação do carro: ");
		ano=ler.nextShort();
		
		if(ano<=2010) 
			System.out.println("Carro velho");
		else if(ano<=2021)
			System.out.println("Carro semi novo");
			
		else if(ano==2022)
			System.out.println("Carro novo");
			
		else
			System.out.println("Ano inválido");
		
		String novaPlaca=placa
						.replace("A","*")
						.replace("a","*")
						.replace("E","*")
						.replace("e","*")
						.replace("I","*")
						.replace("i","*")
						.replace("O","*")
						.replace("o","*")
						.replace("U","*")
						.replace("u","*");
		
		System.out.println("A nova placa é: "+novaPlaca);
	}

}
