package lista_1;

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
	
// Lista_2 - Questao 1
	
	public void ligar() {
		this.ligada = true;
	}
	
	public void desligar() {
		this.ligada = false;
	}
}
