package lista_4;

import java.util.ArrayList;
import java.util.Scanner;

public class Curso {
	//	Variaveis
	private String nome;
	private String horario;
	private ArrayList<Aluno> alunos;
	private Professor professor;
	
	
	//	Getters and setters
	public String getNome() {
		return nome;
	}
	public String getHorario() {
		return horario;
	}
	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public void setAlunos (ArrayList<Aluno> alunos) {
		this.alunos = alunos;
	}
	public void setProfessor (Professor professor) {
		this.professor = professor;
	}
	
	//	Construtor
	public Curso() {	
		setAlunos(new ArrayList<>());
	}
	
	//	Metodos executores
	public void criacaoAlunos() {
		Scanner scan = new Scanner(System.in);	
		for (int i = 0; i < 5; i++) {
			System.out.println("\nDigite as notas do aluno " + (i + 1) + ": ");
			
			System.out.println("\nNota 1: ");
			double nota1 = scan.nextDouble();	
			
			System.out.println("\nNota 2: ");
			double nota2 = scan.nextDouble();
			
			System.out.println("\nNota 3: ");
			double nota3 = scan.nextDouble();
			
			System.out.println("\nNota 4: ");
			double nota4 = scan.nextDouble();
			
			Aluno aluno = new Aluno(nota1, nota2, nota3, nota4);
			alunos.add(aluno);
		}
		scan.close();
	}
	
	public void exibirInformacoes() {
	    for (int i = 0; i < alunos.size(); i++) {
	        Aluno aluno = alunos.get(i);
	        System.out.println("\nAluno " + (i + 1) + ":");
	        
	        double[] notas = aluno.getNotas();
	        for (int j = 0; j < notas.length; j++) {
	            System.out.println("  Nota " + (j + 1) + ": " + notas[j]);
	        }

	        System.out.println();
	    }
	}
	
	public void calcMedia() {
		double somaMedias = 0;
		for (int i = 0; i < alunos.size(); i++) {
			Aluno aluno = alunos.get(i);
			double [] notas = aluno.getNotas();
			
			double soma = 0;
			
			for(double nota : notas) {
				soma += nota;
			}
			
			double media = soma / notas.length;
			somaMedias += media;
			
			System.out.println("Aluno " + (i+1) + " Média: " + media);
			
			if (media >= 7) {
				System.out.println("Aluno " + (i+1) + " aprovado!");
			}
			if (media < 7) {
				System.out.println("Aluno " + (i+1) + " reprovado.");
			}
			
			System.out.println();
		}
		
		double mediaTurma = somaMedias / alunos.size();
			
		System.out.println("Média geral da turma: " + mediaTurma);	
	}
	
	
}














