package lista_4;

public class TesteAgenda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Agenda agenda = new Agenda();
		agenda.iniciarAgenda();
		agenda.adicionarContato("Julia", "4712349020", "julia123@teste.com");
		agenda.exibirContatos();

		}	

}
