package avaliacaoPraticaOOP;

public abstract class Funcionario {
	//	Declaracao variaveis
	private String nome;
	private String endereco;
	private long telefone;
	private long cpf;
	private long numeroCTPS;
	private double salarioBase;
	
	//	Getters and Setters
	public String getNome() {
		return nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public long getTelefone() {
		return telefone;
	}
	public long getCpf() {
		return cpf;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}
	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	public double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	public long getNumeroCTPS() {
		return numeroCTPS;
	}
	public void setNumeroCTPS(long numeroCTPS) {
		this.numeroCTPS = numeroCTPS;
	}
	
	//	Metodos
	public Funcionario() {
	}
	
	public Funcionario(String nome, String endereco, long telefone, long cpf, long numeroCTPS, double salarioBase) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.cpf = cpf;
		this.numeroCTPS = numeroCTPS;
		this.salarioBase = salarioBase;
	}
	
	public Funcionario(String nome2, String endereco2, String telefone2, String cpf2, double salarioBase2) {
		// TODO Auto-generated constructor stub
	}
	public abstract double calcSalario();
}








