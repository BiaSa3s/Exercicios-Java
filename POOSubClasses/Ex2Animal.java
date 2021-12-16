//Exercicio2
//Implemente um programa que crie os 3 tipos de animais definidos no exercício anterior 
//e invoque o método que emite o som de cada um de forma polimórfica, isto é, 
//independente do tipo de animal.

package POOSubClasses;

public class Ex2Animal {
	private String nome;
	private String som;
	private int altura;
	private int peso;
	private int idade;
	
	public Ex2Animal(String nome,int altura,int peso,int idade)
	{
	
		this.nome=nome;
		this.altura = altura;
		this.peso = peso;
		this.idade = idade;
		
}
	
	public Ex2Animal(String nome)
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

