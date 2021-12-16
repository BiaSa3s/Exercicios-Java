package POOSubClasses;

public class Ex2Animal3 extends Ex2Animal {

	public Ex2Animal3(String nome,int altura,
			int peso,int idade)
	{
		super(nome,altura,peso,idade);
	}
	public void imprimirInfo()
	{
		System.out.println("\nNome da preguiça: "+getNome()+"\nCom uma altura de: "+
			getAltura()+"cm"+"\nSeu peso é: "+getPeso()+"kg"+"\nSua idade é: "+getIdade()+"anos");
	}
	public String getSom() {
		return ("Som: "+super.getSom());
	}
}
