package exercicio3;

public class Professor extends Funcionario {

	public Professor(int matricula, double salario) {
		super(matricula, salario);
		
	}
	
	public double getSalarioPrimeiraParcela() {
		return getSalario();
	}
	
	public double getSalarioSegundaParcela() {
		return 0;
	}

	
	

}
