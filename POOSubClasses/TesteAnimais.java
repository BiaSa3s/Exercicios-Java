package POOSubClasses;

public class TesteAnimais {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//("\nNome da preguiça: "+getNome()+"\nEmite um som mais ou menos assim: "+getSom()+
		//"\nCom uma altura de: "+getAltura()+"\nSeu peso é: "+getPeso()+"\nSua idade é: "+getIdade());

		Animal1 cachorro = new Animal1 ("Marley","AuAuAu",57,36,1);
		
		Animal2 cavalo = new Animal2 ("Bala no alvo","hihihi",87,75,2);
		
		Animal3 preguiça = new Animal3 ("Jhenifer","ZzZz",60,25,3);
		
		cachorro.imprimirInfo();
		cavalo.imprimirInfo();
		preguiça.imprimirInfo();
	}

}
