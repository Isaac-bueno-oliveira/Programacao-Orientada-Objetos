package avaliacaoPraticaOOP;

import java.util.ArrayList;

public class Aluno {

    private String nome;
    private String matricula;
    private String cpf;
    private String curso;
    private ArrayList<Disciplina> disciplinas = new ArrayList<>();
    

	public String getNome() {
		return nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public String getCpf() {
		return cpf;
	}

	public String getCurso() {
		return curso;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
    
	 public Aluno(String nome, String matricula, String cpf, String curso) {
	        this.setNome(nome);
	        this.setMatricula(matricula);
	        this.setCpf(cpf);
	        this.setCurso(curso);
	    }

	 public void adicionarDisciplina(Disciplina d) {
	        disciplinas.add(d);
	    }

    public void listarDisciplinas() {
        System.out.println("Disciplinas cursadas por " + nome + ":");
        for (Disciplina d : disciplinas) {
            System.out.println("- " + d.getNome());
        }
    }
    
}
