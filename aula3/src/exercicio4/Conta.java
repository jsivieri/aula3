package exercicio4;

public class Conta {

	private double saldo;

	public Conta(double saldo) {
		super();
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	public void depositar(double valor) {
		this.setSaldo(getSaldo()+valor);
		System.out.println("Saldo atual: "+getSaldo());
	}
	
	public void sacar(double valor) {
		this.setSaldo(getSaldo()-valor);
		System.out.println("Saldo atual: "+getSaldo());
	}
}
