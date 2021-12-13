package ExerciciosRepeticao;

import java.util.Scanner;

public class Exercício2 {

	public static void main (String args[]) {
		{ 
			int x , par=0, impar=0,num;
			Scanner leia = new Scanner(System.in);
			
			for (x=1; x<=10; x++)
			{
				System.out.println("\nInforme o número:");
				num= leia.nextInt();
				
				if (num % 2 == 0)
				{
					par++;
				}
				else 
				{
					impar++;
				}
				
			}System.out.println("\nOs números pares são: " + par);
			System.out.println("\nOs numeros impares são: "+ impar);
		
		}
	}
}

