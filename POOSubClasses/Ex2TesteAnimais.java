package POOSubClasses;

public class Ex2TesteAnimais {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//("\nNome da preguiça: "+getNome()+"\nCom uma altura de: "+getAltura()+
		//"\nSeu peso é: "+getPeso()+"\nSua idade é: "+getIdade());

		Ex2Animal1 cachorro = new Ex2Animal1 ("Marley",57,36,1);
		cachorro.setSom("AuAuAu");
		Ex2Animal2 cavalo = new Ex2Animal2 ("Bala no alvo",87,75,2);
		cavalo.setSom("hihihi");
		Ex2Animal3 preguiça = new Ex2Animal3 ("Jhenifer",60,25,3);
		preguiça.setSom("ZzZz");
		
		cachorro.imprimirInfo();
		cavalo.imprimirInfo();
		preguiça.imprimirInfo();
		
		System.out.println("********");
		Ex2Animal[] animais = new Ex2Animal[3];
		animais[0] = cachorro;
		animais[1] = cavalo;
		animais[2] = preguiça;
		
		for(Ex2Animal animal:animais) {
			System.out.println(animal.getSom());
	}
	}
}

