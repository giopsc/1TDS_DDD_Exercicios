package br.com.fiap.banco;

public class TransferenciaNaoPermitidaException extends RuntimeException {

	public TransferenciaNaoPermitidaException(String message) {
		super(message);
	}
	
}
