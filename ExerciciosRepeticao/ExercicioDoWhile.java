package ExerciciosRepeticao;

import java.util.Scanner;

public class Exercício5 {
	 public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        Scanner leia = new Scanner(System.in);

	        int num,soma=0;

	        System.out.println("\nInforme um número: ");
	        num =leia.nextInt();

	        do
	        {
	            soma=soma+num;
	            System.out.println("\nInforme um número: ");
	            num =leia.nextInt();
	        }

	        while(num!=0);
	        {
	            System.out.printf("\nA soma é: %d",soma);
	        }
	    }
	}

