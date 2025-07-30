package lista_6;

public abstract class DispositivoBase {
	//	Variaveis
	private String nome;
	private boolean estado;
	private String marca;
	private String garantia;
	
	//	Construtor
	public DispositivoBase() {
	}
	
	public DispositivoBase(String nome, boolean estado, String marca, String garantia) {
		setNome(nome);
		setEstado(estado);
		setMarca(marca);
		setGarantia(garantia);
	}
	
	//	Getters and setters
	public String getNome() {
		return nome;
	}
	public boolean getEstado() {
		return estado;
	}
	public String getMarca() {
		return marca;
	}
	public String getGarantia() {
		return garantia;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public void setGarantia(String garantia) {
		this.garantia = garantia;
	}
}