package lista_4;

public class Contato {
	//	Variaveis
	private String nome;
	private String telefone;
	private String email;
	
	//	Getters and setters
	public String getNome() {
		return nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	//	Construtor
	public Contato() {
	}
	
	public Contato(String nome, String telefone, String email) {
		this.setNome(nome);
		this.setTelefone(telefone);
		this.setEmail(email);
	}
	
	//	Metodos executores
	public String getInformacoes () {
		return "Nome: " + getNome() + ", telefone: " + getTelefone() + ", e-mail: " + getEmail();
	}
}
