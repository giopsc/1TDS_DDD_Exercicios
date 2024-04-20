package br.com.fiap.banco;

public class ContaCorrente extends Conta{
	
	private double tarifa;

	public ContaCorrente(int numero) {
		super(numero);
	}
	
	public void transferir(float valor, int numero) {

		if (valor < 0 || valor > this.saldo)
			throw new ValorInvalidoException("Valor inválido!");
		if (numero != this.numero)
			throw new ValorInvalidoException("Conta destino inválida!");
		
		saldo += valor;
	}

}
