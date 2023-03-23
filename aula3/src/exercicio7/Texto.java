package exercicio7;

public class Texto {
	
	public void texto() {
        System.out.println("Texto");
    }
    public void texto(String palavra) {
        System.out.println("Texto" + palavra);
    }
    
	public void regras() {
		System.out.println("Regras da sobrecarga de métodos:\r\n"
				+ "\r\n"
				+ "Precisa ter uma lista de parâmetros diferente.\r\n"
				+ "Pode possuir tipos de retorno diferentes.\r\n"
				+ "Pode possuir modificadores de acesso diferentes.\r\n"
				+ "Pode lançar exceções diferentes.");
	}
}



