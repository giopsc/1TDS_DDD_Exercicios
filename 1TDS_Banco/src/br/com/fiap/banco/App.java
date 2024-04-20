package br.com.fiap.banco;

public class App {

	public static void main(String[] args) {
		var contaPoupanca = new ContaPoupanca(0);
		var contaCorrente= new ContaCorrente(1);		
		
		contaCorrente.depositar(100);
		System.out.println(contaCorrente.getSaldo());
		contaCorrente.sacar(50);
		System.out.println(contaCorrente.getSaldo());
		contaCorrente.transferir(50, 1);
		System.out.println(contaCorrente.getSaldo());
		contaPoupanca.sacar(1);
	}
}
