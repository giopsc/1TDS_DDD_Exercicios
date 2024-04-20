package br.com.fiap.banco;

public class SaqueNaoPermitidoException extends RuntimeException {

	public SaqueNaoPermitidoException(String message) {
		super(message);
	}	

}
