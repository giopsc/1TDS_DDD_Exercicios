package br.com.fiap.banco;

public class Conta extends Object{
	
	public int numero;
	public double saldo;
	
	public Conta(int numero) {
		super();
		this.numero = numero;
	}
	
	public void depositar(double valor) throws ValorInvalidoException {
		
		if (valor < 0)
			throw new ValorInvalidoException("Valor de depósito inválido!");
		
		saldo =+ valor;
		
	}
	
	public void sacar(double valor) throws ValorInvalidoException {
		
		if (valor > this.saldo)
			throw new ValorInvalidoException("Valor maior que o saldo disponível!");
			
		saldo -= valor;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}
	
}
