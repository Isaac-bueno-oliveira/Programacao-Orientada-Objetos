package lista_5;

import java.util.Scanner;

public class ContaEspecial extends ContaBancaria {
	//	Variaveis
	private double limite;
	
	//	Getters and setters
	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	//	Contrutor
	public ContaEspecial() {
	}
	
	public ContaEspecial(double saldo) {
		super.setSaldo(saldo);
	}
	
	@Override
	public void sacar(Scanner scan) {
		setLimite(200);
		System.out.print("Informe o valor que deseja sacar: R$ ");
		double valorSaque = scan.nextDouble();
		scan.nextLine();
		
		
		if(valorSaque <= getLimite()) {
			super.setSaldo(getSaldo() - valorSaque);
			System.out.println("Saque realizado com sucesso! Deseja verificar seu saldo atual?");
			String resp = scan.nextLine();
			if (resp.equals("sim")) {
				System.out.println("Saldo atual: R$ " + getSaldo());
			}
			if (resp.equals("nao")) {
				System.out.println("Programa encerrado.");
			}
			
		}
		if(valorSaque > getLimite()) {
			System.out.println("Infelizmente o valor de saque desejado é superior ao limite, gentileza informe outro valor.");
		}
		
		
		scan.close();

	}
}
