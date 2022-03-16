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
			
			if(opcao==1) {
				System.out.println("Digite seu nome: ");
        		String nome=ler.nextLine();
        		
        		System.out.println("Digite seu CPF: ");
        		String CPF=ler.nextLine();
        		
        		System.out.println("Digite a data do seu voo: ");
        		String data=ler.nextLine();
        		
        		System.out.println("Digite o horário do seu voo: ");
        		String horario=ler.nextLine();
        		
        		System.out.println("Cadastro efeituado com sucesso!");
        		int numeroaleatorio = aleatorio.nextInt(1000);
        		System.out.println("Seu voo é o número: "+numeroaleatorio);
        		}
			else if(opcao==2) {       		
        		System.out.println("Digite seu CPF: ");
        		String CPF=ler.nextLine();
        		
        		System.out.println("Digite o número do seu voo: ");
        		int numeroVoo=ler.nextInt();
        		
        		System.out.println("Check in realizado com sucesso!");
			}
			else if(opcao==3) {
				System.out.println("Digite seu CPF: ");
        		String CPF=ler.nextLine();
        		
        		System.out.println("Digite o número do seu voo: ");
        		int numeroVoo=ler.nextInt();
        		
        		System.out.println("Voo Cancelado com sucesso!");
			}
			else if(opcao==4) {
				System.out.println("Até logo!");
			}
			else
				System.out.println("Opção inexistente");
	}
}
