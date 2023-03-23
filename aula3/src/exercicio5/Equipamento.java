package exercicio5;

public class Equipamento {
	
	private boolean ligado;

	public Equipamento(boolean ligado) {
		super();
		this.ligado = ligado;
	}

	public boolean getLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	
	public void liga() {
		this.setLigado(true);
		if (this.getLigado()==true) {
			System.out.println("Equipamento ligado");
			
		} else {
			if (this.getLigado()==false) {
				System.out.println("Equipamento desligado");
		}
		}
	}
	
	public void desliga() {
		this.setLigado(false);
		if (this.getLigado()==true) {
			System.out.println("Equipamento ligado");
			
		} else {
			if (this.getLigado()==false) {
				System.out.println("Equipamento desligado");
		}
		}
	}

}
