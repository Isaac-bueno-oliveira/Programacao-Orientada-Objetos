package lista_3;

//Lista_3 - Questao 1

public class Lampada {
	private String marca;
	private int potencia;
	private String voltagem;
	private String numPeca;
	private String tipoLuz;
	private boolean smart;
	private String modelo;
	private boolean funcionamentoBateria;
	private boolean garantia;
	private boolean ligada;
	
	//	Metodos de acesso
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public String getVoltagem() {
		return voltagem;
	}

	public void setVoltagem(String voltagem) {
		this.voltagem = voltagem;
	}

	public String getNumPeca() {
		return numPeca;
	}
	

	public void setNumPeca(String numPeca) {
		this.numPeca = numPeca;
	}
	

	public String getTipoLuz() {
		return tipoLuz;
	}
	

	public void setTipoLuz(String tipoLuz) {
		this.tipoLuz = tipoLuz;
	}
	

	public boolean getSmart() {
		return smart;
	}
	

	public void setSmart(boolean smart) {
		this.smart = smart;
	}
	

	public String getModelo() {
		return modelo;
	}
	

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	

	public boolean getFuncionamentoBateria() {
		return funcionamentoBateria;
	}
	

	public void setFuncionamentoBateria(boolean funcionamentoBateria) {
		this.funcionamentoBateria = funcionamentoBateria;
	}
	

	public boolean getGarantia() {
		return garantia;
	}
	

	public void setGarantia(boolean garantia) {
		this.garantia = garantia;
	}
	

	public boolean getLigada() {
		return ligada;
	}
	

	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}
	
	
	//	Metodos construtores
	
	public Lampada () {
		this.setLigada(false);
	}
	
	public Lampada (String marca, String modelo, String voltagem, boolean Smart) {
		this.setMarca(marca);
		this.setModelo(modelo);
		this.setVoltagem(voltagem);
		this.setSmart(Smart);
		this.setLigada(false);
	}
	
	
	//	Metodos Executores
	

	public void ligar() {
		this.setLigada(true);
	}

	
	public void desligar() {
		this.ligada = false;
		this.setLigada(false);
	}
	
	public void status() {
		System.out.println("Ligada?" + this.getLigada());
		System.out.println("Marca: " + this.getMarca());
		System.out.println("Modelo: " + this.getModelo());
		System.out.println("Voltagem: " + this.getVoltagem());
		System.out.println("Smart? " + this.getSmart());
	}
}
