package exercicio3;

public class Funcionario extends Pessoa{
	
	public int matricula;
	private double salario;
	
	public Funcionario(int matricula, double salario) {
		super();
		this.matricula = matricula;
		this.salario = salario;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	public void setSalario() {
		if (this.getSalario() > 0) {
			this.setSalario(salario);
			System.out.println("Salario: "+getSalario());
			
		} else {
			

		}
	}
		
	
	public double getSalarioPrimeiraParcela() {
		return getSalario()*0.6;
	}
	
	public double getSalarioSegundaParcela() {
		return getSalario()*0.4;
	}
	

}
