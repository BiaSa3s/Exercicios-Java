package ExerciciosRepeticao;

import java.util.Scanner;

public class Exerc�cio2 {

	public static void main (String args[]) {
		{ 
			int x , par=0, impar=0,num;
			Scanner leia = new Scanner(System.in);
			
			for (x=1; x<=10; x++)
			{
				System.out.println("\nInforme o n�mero:");
				num= leia.nextInt();
				
				if (num % 2 == 0)
				{
					par++;
				}
				else 
				{
					impar++;
				}
				
			}System.out.println("\nOs n�meros pares s�o: " + par);
			System.out.println("\nOs numeros impares s�o: "+ impar);
		
		}
	}
}

