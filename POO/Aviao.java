// EXERCICIO 2

//Crie uma classe avião e apresente os atributos e métodos referentes esta classe,
//em seguida crie um objeto avião, defina as instancias deste objeto e
//apresente as informações deste objeto no console.

package POO;

public class Aviao {
	//declaração dos atributos da classe
	
	private String nomeProprietario;
	private String modelo;
	private int ano;
	
	//declaração do método construtor
		public void imprimirInfo()
			{
		System.out.println("\nNome do Avião: "+getNomeProprietario()+"\nSeu modelo é: "+getModelo()+
						"\nSeu ano é: "+getAno());
			}
			public Aviao (String nomeProprietario,String modelo,int ano)
			
			{
				this.nomeProprietario = nomeProprietario;
				this.modelo = modelo;
				this.ano = ano;
			}
			//declaração dos demais métodos da classe
			
			public String getNomeProprietario() {
				return nomeProprietario;
			}

			public void setNomeProprietario(String nomeProprietario) {
				this.nomeProprietario = nomeProprietario;
			}

			public String getModelo() {
				return modelo;
			}

			public void setModelo(String modelo) {
				this.modelo = modelo;
			}

			public int getAno() {
				return ano;
			}

			public void setAno(int ano) {
				this.ano = ano;
				{
		}
	}
}