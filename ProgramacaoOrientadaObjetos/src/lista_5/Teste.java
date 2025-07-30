package lista_5;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		// Criar Conta Poupança
        ContaPoupanca contaPoup = new ContaPoupanca(1000);
        contaPoup.setNomeCliente("Joana");
        contaPoup.setNumConta("12345-7");
        
        // Sacar da poupança
        contaPoup.sacar(scan);

        // Depositar na poupança
        contaPoup.depositar(scan);

        // Calcular novo saldo com rendimento
        contaPoup.calcularNovoSaldo();

        // Mostrar dados da conta poupança
        System.out.println("\n--- Conta Poupança ---");
        System.out.println("Cliente: " + contaPoup.getNomeCliente());
        System.out.println("Número da Conta: " + contaPoup.getNumConta());
        System.out.println("Saldo atual: R$ " + String.format("%.2f", contaPoup.getSaldo()));

        /*
        // Criar Conta Especial
        ContaEspecial contaEsp = new ContaEspecial(500);
        contaEsp.setNomeCliente("Carlos");
        contaEsp.setNumConta("67890-3");

        // Sacar da conta especial
        contaEsp.sacar(scan);

        // Depositar na conta especial
        contaEsp.depositar(scan);

        // Mostrar dados da conta especial
        System.out.println("\n--- Conta Especial ---");
        System.out.println("Cliente: " + contaEsp.getNomeCliente());
        System.out.println("Número da Conta: " + contaEsp.getNumConta());
        System.out.println("Saldo atual: R$ " + String.format("%.2f", contaEsp.getSaldo()));
        */
        scan.close();
	}

}
