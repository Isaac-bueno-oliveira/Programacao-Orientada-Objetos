package avaliacaoPraticaOOP;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//        Curso PJP = new Curso("ADS", "Análise e Desenvolvimento de Sistemas");
        Disciplina poo = new Disciplina("POO1", "Programação Orientada a Objetos", 60);
        Disciplina bd = new Disciplina("BD1", "Banco de Dados", 60);

        Aluno aluno = new Aluno("Maria Silva", "2021001", "12345678900", "Adm");
        aluno.adicionarDisciplina(poo);
        aluno.adicionarDisciplina(bd);
        aluno.listarDisciplinas();

        Professor prof = new Professor("João", "Rua A", "9999-9999", "11111111111", 3000.0, "Doutor", 1000.0, 500.0);
        System.out.println("Salário do Professor: R$ " + prof.calcSalario());

        TecnicoAdministrativo tecnico = new TecnicoAdministrativo("Carlos", "Rua B", "8888-8888", "22222222222", 2000.0, "TI", 400.0, 300.0);
        System.out.println("Salário base do Técnico: R$ " + tecnico.calcSalario());
        System.out.println("Salário com hora extra: R$ " + tecnico.calcSalario(10, 25));
	}

}
