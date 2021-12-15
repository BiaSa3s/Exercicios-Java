package POOSubClasses;

public class Animal {
	
	private String nome;
	private String som;
	private int altura;
	private int peso;
	private int idade;

	public Animal(String nome,String som,int altura,int peso,int idade)
	{
		this.nome = nome;
		this.som = som;
		this.altura = altura;
		this.peso = peso;
		this.idade = idade;
	}
	
	public Animal(String nome)
	{
		this.nome = nome;
}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	
	}
	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}
	public int getAltura() {
		return altura;
	}



	public void seAltura(int altura) {
		this.altura = altura;
	}
	
	public int getPeso() {
		return peso;
	}



	public void setPeso(int peso) {
		this.peso = peso;
	}



	public int getIdade() {
		return idade;
	}



	public void setIdade(int idade) {
		this.idade = idade;
	}


}

