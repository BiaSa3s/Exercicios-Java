package ExercicioJava;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner leia = new Scanner (System.in);
		
		float idade,ano,dias,totalemDias,mes;
		ano = 365;
		mes = 12;
		dias = 30;
		
		System.out.println("\n Digite sua idade: ");
		ano=leia.nextFloat();
		
		totalemDias= ano*365+mes*30+dias;
				
		System.out.println("\n Você tem " +totalemDias +" dias de vida!!!");
		
	}

}

