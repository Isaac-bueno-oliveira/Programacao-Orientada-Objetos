package lista_2;

import java.util.Scanner;

public class ContaCorrente {
	protected static final Scanner scan = new Scanner(System.in);
	long numeroConta;
	double saldoConta;
	boolean contaEspecial;
	double limite;
	boolean saque;
	double deposito;
	boolean chequeEspecial;
	
	// Metodo de saque
	public void saque() {
		if (this.limite > 0) {
			this.saque = true;
			System.out.println("O cliente pode realizar saques.");
		} else {
			this.saque = false;
			System.out.println("O cliente não pode realizar saques devido não haver limite disponível.");
		}	
	}
	
	// Metodo de deposito
	public void depositar() {
		System.out.print("Informe o valor que deseja depositar: R$ ");
		this.deposito = scan.nextDouble();
		System.out.println("Foi depoisitado R$ " + deposito + " na sua conta.");
		this.saldoConta = this.saldoConta + this.deposito;
		System.out.println("Deseja consultar seu saldo atual? (sim/não)");
		scan.nextLine();
		String s = scan.next();
		if (s.equalsIgnoreCase("sim")) {
			System.out.println("O saldo atual é : R$ " + this.saldoConta);
		} else if (s.equalsIgnoreCase("não")){
			System.out.println("Obrigado!");
		}
	}
	
	// Metodo de consulta do saldo
	public void consultarSaldo() {
		System.out.print("O saldo atual é : R$ " + this.saldoConta);
	}
	
	// Metodo consulta cheque-especial
	public void consultaChequeEspecial() {
		if (this.saldoConta < 0) {
			this.chequeEspecial = true;
			System.out.println("O cliente está utilizando o cheque especial.");
		} else {
			this.chequeEspecial = false;
			System.out.println("O cliente não está utilziando o cheque especial.");
		}
	}
		
	// Metodo de fechamento do scanner
	public static void closeScanner() {
		scan.close();
	}
}
