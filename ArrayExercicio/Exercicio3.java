package ArrayExercicio;

import java.util.Scanner;

public class Exercicio3 {
	public static void main (String args[]) {
		// Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.

	int [][] matriz = new int[3][3];
	int somaMaior=0,linha,coluna;
	
	Scanner leia = new Scanner (System.in);
	System.out.println("MATRIZ M[3][3]!! \n");
	
	for( linha=0;linha<3;linha++)
	{
		for( coluna=0;coluna<3;coluna++) 
		{
			System.out.printf("Entre com o elemento M: ");
			matriz[linha][coluna]= leia.nextInt();
			
			if (matriz[linha][coluna]>10)
				
		
			{ somaMaior++;
				
			}
			
		}
		
	}	
		System.out.println("Os números maiores que 10 na Matriz são: "+somaMaior);
	}
}
