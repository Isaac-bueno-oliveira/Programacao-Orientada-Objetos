package lista_5;

import java.util.Scanner;

public class ContaBancaria {
	//	Variaveis
	private String nomeCliente;
	private String numConta;
	private double saldo;
	
	//	Getters and setters
	public String getNomeCliente() {
		return nomeCliente;
	}
	public String getNumConta() {
		return numConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	//	Construtor
	public ContaBancaria() {
		
	}
	
	public ContaBancaria(double saldo) {
		setSaldo(saldo);
	}
	
	//	Metodos executores
	public void sacar(Scanner scan) {
		System.out.print("Informe o valor que deseja sacar: R$ ");
		String input = scan.nextLine();
		double valorSaque = Double.parseDouble(input);
		setSaldo(getSaldo() - valorSaque);
		
		System.out.println("Saque realizado com sucesso. Deseja visualizar seu saldo? (sim/nao)");
		String resp = scan.nextLine();
		
		if (resp.equals("sim")) {
			System.out.println("Seu saldo atual é: R$ " + getSaldo());
		}
		if (resp.equals("nao")) {
			System.out.println("Programa encerrado.");
		}
	}
	
	public void depositar(Scanner scan) {
		System.out.print("\nInforme o valor que deseja depositar: R$ ");
		double valorDeposito = scan.nextDouble();
		scan.nextLine();
		setSaldo(getSaldo()+valorDeposito);

		System.out.println("Deposito realizado com sucesso! Deseja visualizar seu saldo?");
		String resp = scan.nextLine();
		
		if (resp.equals("sim")) {
			System.out.println("Seu saldo atual é: R$ " + getSaldo());
		}
		if (resp.equals("nao")) {
			System.out.println("Programa encerrado.");
		}
	}
}
