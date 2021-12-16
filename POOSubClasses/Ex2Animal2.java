package POOSubClasses;

public class Ex2Animal2 extends Ex2Animal {

	public Ex2Animal2(String nome,int altura,
			int peso,int idade)
	{
		super(nome,altura,peso,idade);
	}
	public void imprimirInfo()
	{
		System.out.println("\nNome do Cavalo: "+getNome()+"\nCom uma altura de: "+
				getAltura()+"cm"+"\nSeu peso é: "+getPeso()+"kg"+"\nSua idade é: "+getIdade()+"anos");
	}
	public String getSom() {
		return ("Som: "+super.getSom());
	}
	
}


