package exercicio5;

public class Programa {

	public static void main(String[] args) {

		Equipamento e1 = new Equipamento(false);
		e1.setLigado(true);
		
		e1.liga();
		e1.desliga();
		
		
		EquipamentoSonoro ES1 = new EquipamentoSonoro(false, 0, false);
		ES1.setLigado(true);
		ES1.setStereo(true);
		ES1.setVolume(20);
		
		ES1.stereo();
		ES1.mono();
		ES1.liga();
		
	}

}
