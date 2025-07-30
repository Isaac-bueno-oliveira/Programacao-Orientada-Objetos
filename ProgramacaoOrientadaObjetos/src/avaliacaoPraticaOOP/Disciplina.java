package avaliacaoPraticaOOP;

public class Disciplina {
	//	Variaveis
	private String codigo;
    private String nome;
    private int cargaHoraria;

    //	Getters and setters
	public String getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	//	Metodos
	public Disciplina(String codigo, String nome, int cargaHoraria) {
		this.setCodigo(codigo);
		this.setNome(nome);
		this.setCargaHoraria(cargaHoraria);
    }
}
