package ArrayExercicio;

import java.util.Scanner;

public class Exercicio4 {
	public static void main (String args[]) {
	
// Faça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça ao usuário um menu de opções:
//(1) somar as duas matrizes 
//(2) subtrair a primeira matriz da segunda 
//(3) adicionar uma constante as duas matrizes
//(4) imprimir as matrizes 
//Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada.
//Na terceira opção o valor da constante deve ser lido e o resultado da adição da constante deve ser armazenado na própria matriz.

		int[][] m1 = new int [2][2];
		int[][] m2 = new int [2][2];
		int[][] m3 = new int [2][2];
		int somaMatriz=0,linha,coluna,op,subMatriz,matriz;
		Scanner leia = new Scanner (System.in);
		
		for( linha=0;linha<2;linha++)
		{
			for( coluna=0;coluna<2;coluna++) 
			{
				System.out.printf("Entre com o elemento M1: ");
				m1[linha][coluna]= leia.nextInt();
			}
			for( linha=0;linha<2;linha++)
			{
				for( coluna=0;coluna<2;coluna++) 
				{
					System.out.printf("Entre com o elemento M2: ");
					m2[linha][coluna]= leia.nextInt();
				}
		}
			System.out.println("\nEscolha uma das opções abaixo: ");
			System.out.println("\n1 - Somar as duas matrizes.");
			System.out.println("\n2 - Subtrair a primeira matriz da segunda.");
			System.out.println("\n3 - Adicionar uma constante as duas matrizes.");
			System.out.println("\n4 - Imprimir as matrizes.");
			op=leia.nextInt();
		
		while(op <= 0 || op > 4)
		{
			System.out.printf("\nOpção invalida!");
			System.out.printf("\n\n Escolha uma das opçôes abaixo. ");
			System.out.printf("\n 1) somar as duas matrizes. ");
			System.out.printf("\n 2) subtrair a primeira matriz da segunda. ");
			System.out.printf("\n 3) adicionar uma constante as duas matrizes. ");
			System.out.printf("\n 4) imprimir as matrizes. ");
			op = leia.nextInt();
			
		}
			
		
		if(op == 1)
		{
			System.out.printf("\n A soma das duas matrizes é: ");
			for(linha = 0; linha < 2; linha ++)
			{
				System.out.printf("\n");
				
				for(coluna = 0; coluna < 2; coluna ++)
				{
					somaMatriz = m1[linha][coluna] + m2[linha][coluna];
					System.out.printf("\t %d \t",somaMatriz);
				}
			}
		}
		else if(op == 2)
		{
			System.out.printf("\n A subtração das duas matrizes :");
			for(linha = 0; linha < 2; linha ++)
			{
				System.out.printf("\n");
				
				for(coluna = 0; coluna < 2; coluna ++)
				{
					subMatriz = m1[linha][coluna] - m2[linha][coluna];
					System.out.printf("\t %d \t",subMatriz);
				}
			}
		}
		else if(op == 3)
		{
			System.out.printf("\n\nConstante 1° matriz ");
			for(linha = 0; linha < 2; linha ++)
			{
				System.out.printf("\n");
				for(coluna = 0; coluna < 2; coluna ++)
				{
					if(linha == coluna)
					{
						System.out.printf("\t %d \t",m1[linha][coluna]);
					}
				}
			}
			System.out.printf("\n\nConstante 2° matriz ");
			for(linha = 0; linha < 2; linha ++)
			{
				System.out.printf("\n");
				for(coluna = 0; coluna < 2; coluna ++)
				{
					if(linha == coluna)
					{
						System.out.printf("\t %d \t",m2[linha][coluna]);
					}
				}
			}
		}
		else
		{
			System.out.printf("\n\nImprimir 1° matriz ");
			for(linha = 0; linha < 2; linha ++)
			{
				System.out.printf("\n");
				for(coluna = 0; coluna < 2; coluna ++)
				{
					System.out.printf("\t %d \t",m1[linha][coluna]);
				}
			}
			System.out.printf("\n\nImprimir 2° matriz ");
			for(linha = 0; linha < 2; linha ++)
			{
				System.out.printf("\n");
				for(coluna = 0; coluna < 2; coluna ++)
				{
					System.out.printf("\t %d \t",m2[linha][coluna]);
				}
			}
		}		
	}
	}
}