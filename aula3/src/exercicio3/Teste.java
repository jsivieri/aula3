package exercicio3;

public class Teste {

	public static void main(String[] args) {
	

		Pessoa p1 = new Pessoa(null, null);
		p1.setNome("João");
		p1.setSobrenome("Sivieri");
		
		Funcionario f1 = new Funcionario(0, 0);
		f1.setSalario(0);
		
		Funcionario f2 = new Funcionario(0, 0);
		f2.setSalario(1000);
		
		Professor pr1 = new Professor(0, 0);
		pr1.setSalario(5000);
		
		f1.setSalario();
		f2.setSalario();
		

		p1.getNomeCompleto();
		System.out.println("Primeira parcela: "+f2.getSalarioPrimeiraParcela());
		System.out.println("Segunda parcela: "+f2.getSalarioSegundaParcela());
		System.out.println("Professor 1 parcela: "+pr1.getSalarioPrimeiraParcela());
		System.out.println("Professor 2 parcela: "+pr1.getSalarioSegundaParcela());

	}

}
