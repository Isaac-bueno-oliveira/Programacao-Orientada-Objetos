package lista_4;

public class Calculadora {
	//	Definindo atributos
	private static double x, y, res;
	
	//	Getters and Setters
	public static double getX() {
		return x;
	}
	public static void setX(double x) {
		Calculadora.x = x;
	}
	
	public static double getY() {
		return y;
	}
	public static void setY(double y) {
		Calculadora.y = y;
	}
	
	public static double getRes() {
		return res;
	}
	public static void setRes(double res) {
		Calculadora.res = res;
	}
	
	//	Metodo construtor
	public Calculadora() {
	}
	
	//	Metodos executores
	
	/**
	 * Dividir
	 * elevar a potencia n
	 */
	
	public static void somar(double x, double y) {
		setRes(x + y);
	}
	
	public static void subtrair(double x, double y) {
		setRes(x - y);
	}
	
	public static void multiplicar(double x, double y) {
		setRes(x * y);
	}
	
	public static void dividir (double x, double y) {
		setRes(x / y);
	}
	
	public static void elevarPotencia (double x, double y) {
		setRes(Math.pow(x, y));
	}
	
	public static void resultado() {
		System.out.println("Resultado: " + getRes());
	}
}











