package lista_2;

import java.util.Scanner;

public class Aluno {
	protected static final Scanner scan = new Scanner(System.in);	
	String nomeAluno;
	double matricula;
	String curso;
	String disciplina1;
	String disciplina2;
	String disciplina3;
	double notaDisciplina1;
	double notaDisciplina2;
	double notaDisciplina3;
	double teste = (notaDisciplina1 + notaDisciplina2 + notaDisciplina3)/3;
	
	public Aluno(String string, String string2, String string3) {
		// TODO Auto-generated constructor stub
	}

	// Método que solicita as informações para o usuário
	public void escanear() {
		System.out.println("Informe o nome do aluno: ");
		this.nomeAluno = scan.nextLine();
		System.out.println("Informe a matrícula do aluno: ");
		this.matricula = scan.nextInt();
		scan.nextLine();
		System.out.println("Informe o curso do aluno: ");
		this.curso = scan.nextLine();
		
		System.out.println("\nInforme as três disciplinas que o aluno está cursando: ");
		System.out.print("\nDisciplina 1: ");
		this.disciplina1 = scan.nextLine();
		System.out.print("Disciplina 2: ");
		this.disciplina2 = scan.nextLine();
		System.out.print("Disciplina 3: ");
		this.disciplina3 = scan.nextLine();
		
		System.out.println("\nInforme a nota do aluno em cada disciplina: ");
		System.out.print("\nNota disciplina 1: ");
		this.notaDisciplina1 = scan.nextFloat();
		System.out.print("Nota disciplina 2: ");
		this.notaDisciplina2 = scan.nextFloat();
		System.out.print("Nota disciplina 3: ");
		this.notaDisciplina3 = scan.nextFloat();
	}
	
	// Metodo para retornar informações do usuário
	public void retornarInformacoesUsuario() {
		System.out.println("\nResumo: ");
		System.out.println("\nAluno: " + this.nomeAluno);
		System.out.println("Curso: " + this.curso);
		System.out.println("Disciplinas: ");
		System.out.println(" - " + this.disciplina1);
		System.out.println(" - " + this.disciplina2);
		System.out.println(" - " + this.disciplina3);
		System.out.println("Notas: ");
		System.out.println(" - " + this.disciplina1 + ": " + this.notaDisciplina1);
		System.out.println(" - " + this.disciplina2 + ": " + this.notaDisciplina2);
		System.out.println(" - " + this.disciplina3 + ": " + this.notaDisciplina3);
	}
	
	// Metodo para verificar se o aluno está aprovado
	public void verificaoAprovacao() {
		System.out.println("Resultado final: ");
		if (this.notaDisciplina1 >= 7) {
			System.out.println("- " + this.disciplina1 + ": aprovado");
		} else if (this.notaDisciplina1 < 7) {
			System.out.println("- " + this.disciplina1 + ": reprovado");
		}
		
		if (this.notaDisciplina2 >= 7) {
			System.out.println("- " + this.disciplina2 + ": aprovado");
		} else if (this.notaDisciplina2 < 7) {
			System.out.println("- " + this.disciplina2 + ": reprovado");
		}
		
		if (this.notaDisciplina3 >= 7) {
			System.out.println("- " + this.disciplina3 + ": aprovado");
		} else if (this.notaDisciplina3 < 7) {
			System.out.println("- " + this.disciplina3 + ": reprovado");
		}
	}
	
	// Metodo de fechamento do scanner
		public static void closeScanner() {
			scan.close();
		}

		public void setNome(String string) {
			// TODO Auto-generated method stub
			
		}
}
