package lista_5;

public class ContaPoupanca extends ContaBancaria {
	//	Variaveis
	private double diaRendimento;

	//	Getters and setters
	public double getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(double diaRendimento) {
		this.diaRendimento = diaRendimento;
	}
	
	//	Construtor
	public ContaPoupanca() {

	}
	
	public ContaPoupanca(double saldo) {
		super.setSaldo(saldo);
	}
	
	//	Metodos executores
	public void calcularNovoSaldo() {
		setDiaRendimento(0.01);
		int dias = 30;
		super.setSaldo(super.getSaldo()*Math.pow(1+getDiaRendimento(), dias));
		System.out.print("\nRendimentos da aplicação: R$ " + String.format("%.2f", super.getSaldo()));
	}
}
