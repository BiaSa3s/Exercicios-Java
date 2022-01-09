package ExercicioJava;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
//2. Faça um sistema que leia a idade de uma pessoa expressa em dias e
// mostre-a expressa em anos, meses e dias. 

		final int DIAS_NO_ANO = 365;
		final int DIAS_NO_MES = 30;
		int dias, meses , anos;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe a sua idade.");
		System.out.print("Anos: ");
		anos = leia.nextInt();
		
		System.out.print("Meses: ");
		meses = leia.nextInt();
		
		System.out.print("Dias: ");
		dias = leia.nextInt();
		
		dias += (anos * DIAS_NO_ANO) + (meses * DIAS_NO_MES);
		
		System.out.println("\n\nVocê tem " + anos + " anos, com idade em dias de " + dias + " e "+ meses + " meses! ");
	}
}