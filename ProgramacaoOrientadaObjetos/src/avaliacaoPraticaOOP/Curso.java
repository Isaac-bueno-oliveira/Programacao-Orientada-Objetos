package avaliacaoPraticaOOP;

public class Curso {
    //	Variaveis
	private String codigo;
    private String nome;
    private String duracao;
    
    //	Getters and setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
		this.nome = nome;
	}
    public String getCodigo() {
		return codigo;
	}
	public String getDuracao() {
		return duracao;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}	
	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}
	
	//	Metodos
	public Curso(String codigo, String nome) {
        this.setCodigo(codigo);
        this.setNome(nome);
    }

	
}
