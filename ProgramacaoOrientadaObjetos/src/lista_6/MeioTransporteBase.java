package lista_6;

public abstract class MeioTransporteBase implements Transporte {
	//	Variaveis
	private String nome;
	private boolean viagemEmAndamento;
	
	//	Construtores
	public MeioTransporteBase() {
	}
	public MeioTransporteBase(String nome) {
		this.setNome(nome);
		this.setViagemEmAndamento(false);
	}
	
	//	Getters and setters
	public String getNome() {
		return this.nome;
	}
	public boolean isViagemEmAndamento() {
		return viagemEmAndamento;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setViagemEmAndamento(boolean viagemEmAndamento) {
		this.viagemEmAndamento = viagemEmAndamento;
	}
	
	
	@Override
	public void iniciarViagem() {
		if(!this.isViagemEmAndamento()) {
			System.out.println(this.getNome()+ " iniciou a viagem.");
            this.viagemEmAndamento = true;
        } else {
            System.out.println(this.getNome() + " já está em viagem.");
		}
	}
	
	@Override
	public void finalizarViagem() {
		if (this.isViagemEmAndamento()) {
			System.out.println(this.getNome() + " finalizou a viagem.");
            this.viagemEmAndamento = false;
        } else {
            System.out.println(this.getNome() + " não tem viagem em andamento para finalizar.");
		}
	}
	
	public abstract void exibirDetalhes();
}










