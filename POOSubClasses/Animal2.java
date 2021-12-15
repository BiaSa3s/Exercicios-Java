package POOSubClasses;

public class Animal2 extends Animal {

	public Animal2(String nome,String som,int altura,
			int peso,int idade)
	{
		super(nome,som,altura,peso,idade);
	}
	public void imprimirInfo()
	{
		System.out.println("\nNome do Cavalo: "+getNome()+"\nSeu som é: "+getSom()+
				"\nCom uma altura de: "+getAltura()+"cm"+"\nSeu peso é: "+getPeso()+"kg"+"\nSua idade é: "+getIdade()+"anos");
	}
}


