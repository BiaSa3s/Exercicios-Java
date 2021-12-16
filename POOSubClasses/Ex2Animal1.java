package POOSubClasses;

public class Ex2Animal1 extends Ex2Animal {
	
	public Ex2Animal1(String nome,int altura,
			int peso,int idade)
	{
		super(nome,altura,peso,idade);
	}
	public void imprimirInfo()
	{
		System.out.println("\nNome do Cachorro: "+getNome()+"\nCom uma altura de: "
				+getAltura()+"cm"+"\nSeu peso é: "+getPeso()+"kg"+"\nSua idade é: "+getIdade()+"ano");
	}

	
	public String getSom() {
		return ("Som: "+super.getSom());
	}

}


