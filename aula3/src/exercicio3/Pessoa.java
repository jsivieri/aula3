package exercicio3;

public class Pessoa {
	
	private String nome, sobrenome;

	
	public Pessoa() {
		super();
	}
	
	public Pessoa(String nome, String sobrenome) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
	}
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	
	public void getNomeCompleto() {
		
		
		System.out.println("Nome: "+getNome()+" "+getSobrenome());
		
		
	}
	
	

}
