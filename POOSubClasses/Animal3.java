package POOSubClasses;

public class Animal3 extends Animal {

	public Animal3(String nome,String som,int altura,
			int peso,int idade)
	{
		super(nome,som,altura,peso,idade);
	}
	public void imprimirInfo()
	{
		System.out.println("\nNome da pregui�a: "+getNome()+"\nEmite um som mais ou menos assim: "+getSom()+
				"\nCom uma altura de: "+getAltura()+"cm"+"\nSeu peso �: "+getPeso()+"kg"+"\nSua idade �: "+getIdade()+"anos");
	}
}


