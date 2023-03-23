package exercicio4;

public class Poupanca {
	
	private int diaRendimento; 
	private double saldo;



	public Poupanca(int diaRendimento, int saldo) {
		super();
		this.diaRendimento = diaRendimento;
		this.saldo = saldo;
	}

	public int getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(int diaRendimento) {
		this.diaRendimento = diaRendimento;
	}
		
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		if (saldo>0) {
			this.saldo = saldo;
			
		} else {
			System.out.println("Saldo nao pode ser negativo");
		}

	}
	
	
	
	public void depositar(double valor) {
		this.setSaldo(getSaldo()+valor);
		System.out.println("Saldo atual: "+getSaldo());
	}
	
	
	public void sacar(double saldo) {
		if (getSaldo()-saldo<0) {
			System.out.println("Saldo insuficiente");		
		} else { 
			setSaldo(getSaldo()-saldo);
			System.out.println("Saldo atual: "+getSaldo());

		}
	}
		
	
	}
	



