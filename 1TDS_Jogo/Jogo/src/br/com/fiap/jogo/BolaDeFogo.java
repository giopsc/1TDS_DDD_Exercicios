package br.com.fiap.jogo;

public class BolaDeFogo extends Npc{
	
	public BolaDeFogo(int x, int y) {
		super(x, y);
	}
	
	private int poder;
	
	public int getPoder() {
		return poder;
	}
	public void setPoder(int poder) {
		this.poder = poder;
	}
}