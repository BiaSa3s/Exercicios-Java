package POOSubClasses;

public class Animal1 extends Animal {

	public Animal1(String nome,String som,int altura,
			int peso,int idade)
	{
		super(nome,som,altura,peso,idade);
	}
	public void imprimirInfo()
	{
		System.out.println("\nNome do Cachorro: "+getNome()+"\nQuando late seu Som �: "+getSom()+
				"\nCom uma altura de: "+getAltura()+"cm"+"\nSeu peso �: "+getPeso()+"kg"+"\nSua idade �: "+getIdade()+"ano");
	}
}

