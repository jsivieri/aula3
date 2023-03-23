package exercicio4;

public class Teste {

	public static void main(String[] args) {


		Conta c1 = new Conta(0);
		c1.setSaldo(5000);
		
		c1.depositar(3000);
		
		
		Conta c2 = new Conta(0);
		c2.depositar(10000);
		c2.sacar(15000);
		
		
		Poupanca p1 = new Poupanca(0, 0);
		p1.depositar(15000);
		p1.sacar(20000);
		
	}

}
