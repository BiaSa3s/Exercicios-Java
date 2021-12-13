package ExerciciosRepeticao;

import java.util.Scanner;

public class Exercício3 {

	public static void main (String args[]) {
		
        int  x,idade,idMaior50=0,idMenor21=0;
        
        Scanner leia = new Scanner(System.in);

        System.out.println("\nInforme sua idade: ");
        idade=leia.nextInt();

            while(idade!=-99)
            { 

                if(idade<=21)
                {
                    idMenor21++;
                }
                else if(idade>=50)
                {
                    idMaior50++;
                }
                else
                {
                    System.out.println("\nDado sem registro!");
                }
                System.out.println("\nInforme sua idade: ");
                idade=leia.nextInt();
        }
            System.out.println("\n A quantidade de pessoas com menos de 21 anos é "+idMenor21);
            System.out.println("\n A quantidade de pessoas com maior de 50 anos é "+idMaior50);
    }

}