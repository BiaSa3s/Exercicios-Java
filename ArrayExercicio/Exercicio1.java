package ArrayExercicio;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);

    int a[] = {1, 0, 5, -2, -5, 7};
    int soma, x; 


    soma=a[0]+a[1]+a[5];
        System.out.printf("\nO valor da soma é: %d",soma);

    a[3] = 100;

    for(x=0;x<6;x++)
    {
        System.out.printf("\nO valor do vetor é: %d", a[x]);
    }
}

}


