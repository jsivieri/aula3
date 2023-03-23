package exercicio5;

public class EquipamentoSonoro extends Equipamento {
	
	private int volume;
	private boolean stereo;
	public EquipamentoSonoro(boolean ligado, int volume, boolean stereo) {
		super(ligado);
		this.volume = volume;
		this.stereo = stereo;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public boolean getStereo() {
		return stereo;
	}
	public void setStereo(boolean stereo) {
		this.stereo = stereo;
	}
	
	
	public void mono() {
		this.setStereo(false);
		if (this.getStereo()==false) {
			System.out.println("Equipamento Sonoro mono");
			
		} else {
			if (this.getStereo()==true) {
				System.out.println("Equipamento Sonoro Stereo");
		}
		}
	}
	
	public void stereo() {
		this.setStereo(true);
		if (this.getStereo()==false) {
			System.out.println("Equipamento Sonoro mono");
			
		} else {
			if (this.getStereo()==true) {
				System.out.println("Equipamento Sonoro Stereo");
		}
		}
	}

	public void liga() {
		this.setLigado(true);
		setVolume(5);
		System.out.println("Equipamento Sonoro Volume: "+getVolume());
	}
}
