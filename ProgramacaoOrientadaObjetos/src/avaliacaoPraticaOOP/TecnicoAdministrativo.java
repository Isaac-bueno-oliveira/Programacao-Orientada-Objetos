package avaliacaoPraticaOOP;

public class TecnicoAdministrativo extends Funcionario {
	//	Variaveis
	private String cargo;
	private String departamento;
	private double auxTransporte;
	private double alimentacao;
	
	//	Getters and setters
	public String getCargo() {
		return cargo;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public double getAuxTransporte() {
		return auxTransporte;
	}
	public double getAlimentacao() {
		return alimentacao;
	}
	public void setAuxTransporte(double auxTransporte) {
		this.auxTransporte = auxTransporte;
	}
	public void setAlimentacao(double alimentacao) {
		this.alimentacao = alimentacao;
	}
	
	//	Metodos
	public TecnicoAdministrativo(String nome, String endereco, String telefone, String cpf, double salarioBase,
            String cargo, double auxTransporte, double auxAlimentacao) {
		super(nome, endereco, telefone, cpf, salarioBase);
		this.setCargo(cargo);
		this.setAuxTransporte(auxTransporte);
		this.setAlimentacao(auxAlimentacao);
	}
	
	
	@Override
	public double calcSalario() {
		return (getSalarioBase() + getAuxTransporte() + getAlimentacao());
	}
	
	//	Sobrecarga
	public double calcSalario(double qtdHoras, double valorHora) {
		return calcSalario() + (qtdHoras * valorHora);
	}
	
	
}
