package teste;

import lista_2.Aluno;

public class PassagemReferencia {
	
	/*public static void minhaFuncao(int valor) {
	    valor += 5;
	    System.out.println(valor);
	}*/
	
//	private String nome;
	
	public static void testePassagemValorReferencia(int valor, Aluno aluno) {
			int novovalor = valor + 10;
			valor = novovalor;
			aluno.setNome("Jose" + valor);
			
			}

	

	
	
	
}
