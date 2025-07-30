package lista_4;

public class Contador {
	//	Variavel contador
	private static int contador;
	
	//	Metodo acessor e modificador
	public static int getContador() {
		return contador;
	}
	public static void setContador(int contador) {
		Contador.contador = contador;
	}
	
	//	Metodo construtor
	public Contador () {
		setContador(++contador);
	}
	
	//	Metodos executores
	public static void retornarValor() {
		System.out.println("Valor do contador: " + getContador());
	}
	
	public static void zerar() {
		setContador(0);
	}
	
	public static void incrementar() {
		setContador(++contador);
	}
}
