package ExercicioJava;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
	Scanner leia = new Scanner (System.in);
	
	int horas, minutos, segundos , dia, duracao1, duracao2, duracao3;
			
	System.out.print("\nQuantos dia(s) de duração? ");
	dia=leia.nextInt();
	
	duracao1= dia*24;
	duracao2= duracao1*60;
	duracao3= duracao2*60;
	
	System.out.print("\nO evento durou "+duracao1+ " horas \nEquivalente a " +duracao2+ " minutos \nE " +duracao3+ " segundos ");
	
	}

}

