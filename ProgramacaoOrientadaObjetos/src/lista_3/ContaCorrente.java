package lista_3;

import java.util.Scanner;

public class ContaCorrente {
	protected static final Scanner scan = new Scanner(System.in);
	private long numeroConta;
	private double saldoConta;
	private boolean contaEspecial;
	private double limite;
	private boolean saque;
	private double deposito;
	private boolean chequeEspecial;
	
	
	//	Metodos acessores e modeificadores
		
	public long getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(long numeroConta) {
		this.numeroConta = numeroConta;
	}

	public double getSaldoConta() {
		return saldoConta;
	}

	public void setSaldoConta(double saldoConta) {
		this.saldoConta = saldoConta;
	}

	public boolean isContaEspecial() {
		return contaEspecial;
	}

	public void setContaEspecial(boolean contaEspecial) {
		this.contaEspecial = contaEspecial;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public boolean isSaque() {
		return saque;
	}

	public void setSaque(boolean saque) {
		this.saque = saque;
	}

	public double getDeposito() {
		return deposito;
	}

	public void setDeposito(double deposito) {
		this.deposito = deposito;
	}

	public boolean isChequeEspecial() {
		return chequeEspecial;
	}

	public void setChequeEspecial(boolean chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}

	
	// Metodos construtores
	
		public ContaCorrente() {
			this.setSaldoConta(0);
		}
		
		public ContaCorrente(double saldo) {
			this.setSaldoConta(saldo);
		}
		
		public ContaCorrente (long numeroConta, double saldo, double limite) {
			this.setNumeroConta(numeroConta);
			this.setSaldoConta(saldo);
			this.setLimite(limite);
		}
	
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
		this.setDeposito(scan.nextDouble());
		System.out.println("Foi depoisitado R$ " + this.getDeposito() + " na sua conta.");
		this.setSaldoConta(this.getSaldoConta() + this.getDeposito()); 
		System.out.println("Deseja consultar seu saldo atual? (sim/não)");
		scan.nextLine();
		String s = scan.next();
		if (s.equalsIgnoreCase("sim")) {
			System.out.println("O saldo atual é : R$ " + this.getSaldoConta());
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
	
	public void status() {
		System.out.println("Número da conta: " + this.getNumeroConta());
		System.out.println("Saldo: R$ " + this.getSaldoConta());
		System.out.println("Limite: R$ " + this.getLimite());
	}
	
	
//	numeroConta;
//	private double saldoConta;
//	private boolean contaEspecial;
//	private double limite;
//	private boolean saque;
//	private double deposito;
//	private boolean chequeEspecial;
	
	
		
	// Metodo de fechamento do scanner
	public static void closeScanner() {
		scan.close();
	}
}
