package br.com.fiap.jogo;

public class Mago extends Jogador implements ElementoVisual {
	
	private int mp;

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public Mago() {
		super();
		this.mp = 10;
	}
	
	@Override
	public void mover(int x, int y) {
	}
	
}