package br.com.fiap.jogo;

public abstract class Jogador implements ElementoVisual {
	
	//atributos
	private String nome;
	private int xp;
	private int hp;
	private boolean envenenado;
	private int x;
	private int y;
	

	//metodos
	public Jogador() {
		this.nome = "a";
		this.hp = 15;
		this.xp = 5;
		this.envenenado = false;
	}
	
	public Jogador(String nome) {
		this.nome = nome;
		this.hp = 10;
		this.xp = 10;
		this.envenenado = false;
	}
	
	public int getXp() {
		return xp;
	}
	
	public int getHp() {
		return hp;
	}
	
	public boolean isEnvenenado() {
		return envenenado;
	}
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public void receberDano(int dano) {
		hp -= dano;
		if (this.hp <= 0) {
			System.out.println(this.nome + " está morto!");
		}else {
			System.out.println("HP: " + this.hp);
		}
	}
	public void receberCura(int cura) {
		if (this.hp <= 0) {
			System.out.println("O jogador está morto!");
		}else {
			hp += cura;
			System.out.println("Cura recebita: " + cura + "\r\nVida: " + this.hp);
		}
	}
	
	public void ganharExperiencia (int ganharXp) {
		xp += ganharXp;
		System.out.println("XP atual: " + this.xp);
	}
	
	public void receberAntidoto() {
//		if (isEnvenenado()) {
//			this.envenenado = false;
//		}
//		if (!isEnvenenado()){
//			this.envenenado = true;
//		}
		
		envenenado = !envenenado; //inverte o valor booleano
	}
	
	public void atacar (Jogador alvo) {
		alvo.receberDano(this.getXp());
		if (alvo.getHp() <= 0) {
			this.ganharExperiencia(alvo.getXp());
		}	
	}
}
