package br.com.fiap.banco;

public class ContaPoupanca extends Conta{
	
	private double taxa;

	public ContaPoupanca(int numero) {
		super(numero);
	}
	
	@Override
	public void sacar(double valor) throws TransferenciaNaoPermitidaException {
		throw new TransferenciaNaoPermitidaException("Operação inválida para essa conta!");
	}
}
