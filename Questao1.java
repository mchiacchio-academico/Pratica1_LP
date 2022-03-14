package Pratica1_LP;

import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		float tempo, velMedia, kmLitro,	distancia,consumoFinal;
		
		System.out.printf("Entre com o tempo de viagem: ");
		tempo=ler.nextFloat();
		System.out.printf("Entre com a velocidade média: ");
		velMedia=ler.nextFloat();
		System.out.printf("Entre com o consumo do carro: ");
		kmLitro=ler.nextFloat();
		
		distancia=velMedia*tempo;
		consumoFinal=distancia/kmLitro;
		
				System.out.printf("O consumo final foi: "+ consumoFinal);
	}

}
