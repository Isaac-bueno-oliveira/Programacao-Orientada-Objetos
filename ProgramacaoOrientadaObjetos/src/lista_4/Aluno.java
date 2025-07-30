package lista_4;

public class Aluno {
	//	Variaveis
	private String nome;
	private String matricula;
	private double [] notas = new double[4];
	
	
	//	Getters and setters
	public String getNome() {
		return nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public double[] getNotas() {
		return notas;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	
	//	Construtor
	public Aluno() {
	}
	
	public Aluno(String nome, String matricula) {
		setNome(nome);
		setMatricula(matricula);
	}
	
	public Aluno(double nota1, double nota2, double nota3, double nota4) {
		double[] entradas = {nota1, nota2, nota3, nota4};
		for(int i = 0; i < entradas.length; i++) {
			notas[i] = entradas[i];
		}	
	}	
	
	public void exibirInformacoes() {
		for(int i = 0; i < notas.length; i++) {
			System.out.println("Nota: " + (i+1) + ": " + notas[i]);
		}
	}
}
