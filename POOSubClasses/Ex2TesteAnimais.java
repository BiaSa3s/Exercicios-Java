package POOSubClasses;

public class Ex2TesteAnimais {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//("\nNome da pregui�a: "+getNome()+"\nCom uma altura de: "+getAltura()+
		//"\nSeu peso �: "+getPeso()+"\nSua idade �: "+getIdade());

		Ex2Animal1 cachorro = new Ex2Animal1 ("Marley",57,36,1);
		cachorro.setSom("AuAuAu");
		Ex2Animal2 cavalo = new Ex2Animal2 ("Bala no alvo",87,75,2);
		cavalo.setSom("hihihi");
		Ex2Animal3 pregui�a = new Ex2Animal3 ("Jhenifer",60,25,3);
		pregui�a.setSom("ZzZz");
		
		cachorro.imprimirInfo();
		cavalo.imprimirInfo();
		pregui�a.imprimirInfo();
		
		System.out.println("********");
		Ex2Animal[] animais = new Ex2Animal[3];
		animais[0] = cachorro;
		animais[1] = cavalo;
		animais[2] = pregui�a;
		
		for(Ex2Animal animal:animais) {
			System.out.println(animal.getSom());
	}
	}
}

