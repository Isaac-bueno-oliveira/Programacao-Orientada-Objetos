package lista_4;

import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {
	//	Variaveis
	private ArrayList<Contato> contatos;
	private String nomeAgenda;
	
	//	Getters and setters
	public ArrayList<Contato> getContatos() {
		return contatos;
	}
	public void setContatos(ArrayList<Contato> contatos) {
		this.contatos = contatos;
	}
	
	public String getNomeAgenda() {
		return nomeAgenda;
	}
	public void setNomeAgenda(String nomeAgenda) {
		this.nomeAgenda = nomeAgenda;
	}
	
	//	Construtor
	public Agenda() {
		setContatos(new ArrayList<>());
	}
	
	//	Metodos executores
	public void iniciarAgenda() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o nome da agenda: ");
		setNomeAgenda(scan.nextLine());
		
		for (int i = 0; i <= 2; i++) {
			
			System.out.println("Digite o nome do contato: ");
			String nome = scan.nextLine();
			
			System.out.println("Digite o telefone do contato: ");
			String telefone = scan.nextLine();
					
			System.out.println("Digite o e-mail do contato: ");
			String email = scan.nextLine();
			
			Contato novoContato = new Contato(nome, telefone, email);
			contatos.add(novoContato);
			
			System.out.println(contatos.size());
		}
		scan.close();
	}
	
	public void adicionarContato(String nome, String telefone, String email) {
		Contato contato = new Contato(nome, telefone, email);
		contatos.add(contato);
	}
	
	public void exibirContatos() {
		System.out.println("\nAgenda: " + getNomeAgenda());
		System.out.println("\nContatos: "    );
		
		for (Contato contato : contatos) {
			System.out.println(contato.getInformacoes());
		}
	}
}
	

	

