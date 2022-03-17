package Pratica1_LP;

import java.util.Scanner;
import java.util.Random;

public class Questao4 {

		public static void main(String[] args) {
			
			Scanner ler=new Scanner(System.in);
			
			Random aleatorio = new Random();
			
			short opcao=0;
			
			System.out.println("Escolha: ");
			System.out.println("1 - Cadastrar Passageiro");
			System.out.println("2 - Check in");
			System.out.println("3 - Cancelar voo");
			System.out.println("4 - Sair");
					opcao = ler.nextShort();
				
				switch(opcao){
					case 1:
					System.out.println("Digite seu nome: ");
	        		String nome=ler.next();
	        		
	        		System.out.println("Digite seu CPF: ");
	        		String CPF=ler.next();
	        		
	        		System.out.println("Digite a data do seu voo: ");
	        		String data=ler.next();
	        		
	        		System.out.println("Digite o horário do seu voo: ");
	        		String horario=ler.next();
	        		
	        		System.out.println("Cadastro efeituado com sucesso!");
	        		int numeroaleatorio = aleatorio.nextInt(1000);
	        		System.out.println("Seu voo é o número: "+numeroaleatorio);
	        		break;
					case 2:        		
	        		System.out.println("Digite seu CPF: ");
	        		CPF=ler.next();
	        		
	        		System.out.println("Digite o número do seu voo: ");
	        		int numeroVoo=ler.nextInt();
	        		
	        		System.out.println("Check in realizado com sucesso!");
	        		break;
					case 3:
					System.out.println("Digite seu CPF: ");
	        		CPF=ler.next();
	        		
	        		System.out.println("Digite o número do seu voo: ");
	        		numeroVoo=ler.nextInt();
	        		
	        		System.out.println("Voo Cancelado com sucesso!");
	        		break;
					case 4: 
					System.out.println("Até logo!");
					break;
					default:
					System.out.println("Opção inexistente.");
				}
		}
	}


