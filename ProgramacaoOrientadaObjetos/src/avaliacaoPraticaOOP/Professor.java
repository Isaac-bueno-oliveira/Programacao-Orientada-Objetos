package avaliacaoPraticaOOP;

public class Professor extends Funcionario {
	//	Declaracao variaveis
	private String titulacao;
	private String areaPesquisa;
	private double valorDedicacaoExclusiva;
	private double retribTitulacao;
	
	//	Getters and Setters
	public String getTitulacao() {
		return titulacao;
	}

	public String getAreaPesquisa() {
		return areaPesquisa;
	}

	public double getValorDedicacaoExclusiva() {
		return valorDedicacaoExclusiva;
	}

	public double getRetribTitulacao() {
		return retribTitulacao;
	}

	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}

	public void setAreaPesquisa(String areaPesquisa) {
		this.areaPesquisa = areaPesquisa;
	}

	public void setValorDedicacaoExclusiva(double valorDedicacaoExclusiva) {
		this.valorDedicacaoExclusiva = valorDedicacaoExclusiva;
	}

	public void setRetribTitulacao(double retribTitulacao) {
		this.retribTitulacao = retribTitulacao;
	}
	
	//	Metodos
	 public Professor(String nome, String endereco, String telefone, String cpf, double salarioBase,String titulacao, double valorDedicacaoExclusiva, double retribTitulacao) {
		 super(nome, endereco, telefone, cpf, salarioBase);
		 this.setTitulacao(titulacao);
		 this.setValorDedicacaoExclusiva(valorDedicacaoExclusiva);
		 this.setRetribTitulacao(retribTitulacao);
	 }
	
	public void exibirInfos() {
		System.out.println("Nome: " + getNome());
		System.out.println("Endereco: " + getEndereco());
		System.out.println("CPF: " + getCpf());
		System.out.println("Salario base: R$ " + getSalarioBase());
		System.out.println("Titulacao: " + getTitulacao());
		System.out.println("Valor dedicacao exclusiva: R$ " + getValorDedicacaoExclusiva());
		System.out.println("Retribuicao Titulacao: R$ " + getRetribTitulacao());
	}
	
	@Override
	public double calcSalario() {
		return (getSalarioBase() + getValorDedicacaoExclusiva() + getRetribTitulacao());
	}

	
}
