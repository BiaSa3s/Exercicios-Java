// EXERCICIO 2

//Crie uma classe avi�o e apresente os atributos e m�todos referentes esta classe,
//em seguida crie um objeto avi�o, defina as instancias deste objeto e
//apresente as informa��es deste objeto no console.

package POO;

public class Aviao {
	//declara��o dos atributos da classe
	
	private String nomeProprietario;
	private String modelo;
	private int ano;
	
	//declara��o do m�todo construtor
		public void imprimirInfo()
			{
		System.out.println("\nNome do Avi�o: "+getNomeProprietario()+"\nSeu modelo �: "+getModelo()+
						"\nSeu ano �: "+getAno());
			}
			public Aviao (String nomeProprietario,String modelo,int ano)
			
			{
				this.nomeProprietario = nomeProprietario;
				this.modelo = modelo;
				this.ano = ano;
			}
			//declara��o dos demais m�todos da classe
			
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