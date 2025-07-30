package lista_2;

// Lista_1 - Questao 1

public class Lampada {
	String marca;
	int potencia;
	String voltagem;
	String numPeca;
	String tipoLuz;
	boolean smart;
	String modelo;
	boolean funcionamentoBateria;
	boolean garantia;
	boolean ligada;
	int teste0 = 2;
	int teste1 = 6;
	int teste2 = (teste0 + teste1)/2;
	
// Lista_2 - Questao 1
	
	public void ligar() {
		this.ligada = true;
	}
	
	public void desligar() {
		this.ligada = false;
	}
	
	public void status() {
		System.out.println("Ligada?" + this.ligada);
	}
}
