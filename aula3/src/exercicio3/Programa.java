package exercicio3;

public class Programa {

	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setNome("João");
		pessoa1.setSobrenome("Medeiros");
		
		Funcionario pessoa2 = new Funcionario(0, 0);
		pessoa2.setNome("Leonardo");
		pessoa2.setSobrenome("Messias");
		pessoa2.setSalario(1000);
		pessoa2.setMatricula(100);
		
		Professor pessoa3 = new Professor(0, 0);
		pessoa3.setNome("Antônio");
		pessoa3.setSobrenome("Silva");
		pessoa3.setSalario(1500);
		pessoa3.setMatricula(200);
		
		
		pessoa1.getNomeCompleto();
		pessoa2.getNomeCompleto();
		pessoa3.getNomeCompleto();
		System.out.println("Primeira parcela: "+pessoa2.getSalarioPrimeiraParcela());
		System.out.println("Segunda parcela: "+pessoa2.getSalarioSegundaParcela());
		System.out.println("Primeira parcela: "+pessoa3.getSalarioPrimeiraParcela());
		System.out.println("Segunda parcela: "+pessoa3.getSalarioSegundaParcela());

	}

}
