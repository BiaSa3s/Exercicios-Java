package POOSubClasses;

public class TesteAnimais {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//("\nNome da pregui�a: "+getNome()+"\nEmite um som mais ou menos assim: "+getSom()+
		//"\nCom uma altura de: "+getAltura()+"\nSeu peso �: "+getPeso()+"\nSua idade �: "+getIdade());

		Animal1 cachorro = new Animal1 ("Marley","AuAuAu",57,36,1);
		
		Animal2 cavalo = new Animal2 ("Bala no alvo","hihihi",87,75,2);
		
		Animal3 pregui�a = new Animal3 ("Jhenifer","ZzZz",60,25,3);
		
		cachorro.imprimirInfo();
		cavalo.imprimirInfo();
		pregui�a.imprimirInfo();
	}

}
