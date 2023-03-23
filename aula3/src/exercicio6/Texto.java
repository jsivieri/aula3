package exercicio6;

public class Texto {
	
	public void texto() {
		System.out.println("Texto não sobrescrito");
	}
	
	
	public void regras() {
		System.out.println("Regras da sobrescrita de métodos:\r\n"
				+ "Deve possuir a mesma lista de parâmetros.\r\n"
				+ "Deve possuir o mesmo tipo de retorno: \r\n"
				+ "Não pode possuir um modificador de acesso mais restritivo: deve possuir um modificador de acesso menos restritivo.\r\n"
				+ "Não deve lançar uma exceção verificada (checked exception) nova ou mais ampla: pode lançar exceções verificadas mais restritas e pode lançar qualquer exceção não verificada.\r\n"
				+ "Apenas métodos herdados podem ser sobrescritos (é necessário um relacionamento É UM).");
	}
 
}


