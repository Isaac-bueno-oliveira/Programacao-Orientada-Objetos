package lista_3;

import java.util.Scanner;

public class Aluno {
	protected static final Scanner scan = new Scanner (System.in);
	//	Criacao das variaveis
	private String nome;
	private long matricula;
	private String curso;
	private String [] disciplinas = new String [3]; // Array unidimensional para armazenar os valores de cada curso
	private double [] [] notas = new double [3] [3]; // Aray bidimensional para armazenar as notas de cada curso
	private double [] medias = new double [3]; // Array para unidimensional para armazenar as médias de cada disciplina
	
	//	Criacao dos metodos acessores e modificadores
	
	//		Nome
	public String getNome() {
		return this.nome;
	}
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	//		Matricula
	public long getMatricula() {
		return this.matricula;
	}
	public void setMatricula (long matricula) {
		this.matricula = matricula;
	}
	
	//		Curso
	public String getCurso() {
		return this.curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	//		Disciplinas
	public String getDisciplinas(int indice) {
		if (indice >= 0 && indice < disciplinas.length) {
			return disciplinas[indice];
		} else {
			return null;
		}
	}
	public void setDisciplinas (int indice, String nomeDisciplina) {
		if (indice >= 0 && indice < disciplinas.length) {
			disciplinas[indice] = nomeDisciplina;
		} else {
			System.out.print("Índice inválido para a disciplina.");
		}
	}
	
	//		Notas
	public double getNotas (int linhas, int colunas) {
		return notas[linhas][colunas];
	}
	public void setNotas (int linhas, int colunas, double valor) {
		if (linhas >= 0 && linhas < notas.length && colunas >= 0 && colunas < notas.length) {
			notas[linhas][colunas] = valor;
		}
	else {
		System.out.println("Índice inválido para a disciplina");
		}
	}
	
	//	Metodos construtores
	
	public Aluno() {
	}
	
	public Aluno (String nome, long Matricula, String curso) {
		this.setNome(nome);
		this.setMatricula(Matricula);
		this.setCurso(curso);
	}
	
	
	//	Criacao dos métodos executores
	
	public void escanear () {
		System.out.print("Informe o nome do aluno: ");
		this.setNome(scan.nextLine());
		
		System.out.print("\nInforme a matrícula do aluno: ");
		this.setMatricula(scan.nextLong());
		scan.nextLine();
		
		System.out.print("\nInforme o curso do aluno: ");
		this.setCurso(scan.nextLine());
		
		//		Atribuindo valores ao array disciplina
		for (int i = 0; i < disciplinas.length; i++) {
			System.out.println("\nDigite o nome da disciplina " + (i + 1) + ": ");
			String nomeDisciplina = scan.nextLine();
			setDisciplinas (i, nomeDisciplina);
		}
		
		//		Atribuindo valores ao array notas
		for (int i = 0; i < notas.length; i++) {
			System.out.println("\nNotas da disciplina: " + disciplinas[i]);
			System.out.println();
			for (int j = 0; j < notas.length; j++) {
				System.out.println("Digite a nota: " + (j + 1) + ": ");
				double nota = scan.nextDouble();
				setNotas (i, j, nota);
			}
		}
	}
	
	
	//		Calculando média
	
	public void calculoMedia() {
		for (int i = 0; i < notas.length; i++) {
			double soma = 0;
			for (int j = 0; j < notas.length; j++) {
				soma += getNotas(i, j);
			}
			medias[i] = soma / notas[i].length;
		}
		
	}
	
	
	
	
	public void saida () {
		calculoMedia();
		System.out.println("\nNome do aluno: " + getNome());
		System.out.println("Matricula do aluno: " + getMatricula());
		System.out.println("Curso do aluno: " + getCurso());
		
		System.out.println("Disciplinas cadastradas: ");
		System.out.println();
		
		for (int i = 0; i < disciplinas.length; i++) {
			System.out.println("Disciplina " + (i+1) + ": " + getDisciplinas(i));
		}
		
		System.out.println("\nNotas de cada disciplina: ");
		System.out.println();
		for (int i = 0; i < notas.length; i++) {
			System.out.println("\nNotas disciplina: " + disciplinas[i]);
			for (int j = 0; j < notas.length; j++) {
				System.out.println("Nota " + (j + 1) + ": " + getNotas(i, j));
			}
		}
		
		for (int i = 0; i < notas.length; i ++) {
			System.out.println("\nA média da disciplina " + disciplinas[i] + " é: " + medias[i]);
			if (medias[i] >= 7) {
				System.out.println("Aluno aprovado na disciplina " + disciplinas[i]);
			} else {
				System.out.println("Aluno reprovado na disciplina " + disciplinas[i]);
			}
		}
	}
	
	public void status() {
		System.out.println("Nome do aluno: " + this.getNome());
		System.out.println("Matricula: " + this.getMatricula());
		System.out.println("Curso: " + this.getCurso());
	}
	
	
}
