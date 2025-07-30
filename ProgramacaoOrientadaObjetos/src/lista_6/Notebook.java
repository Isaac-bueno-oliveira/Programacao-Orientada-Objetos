package lista_6;

public class Notebook extends DispositivoBase implements DispositivoEletronico {
	//	Construtores
	public Notebook() {
		
	}
	public Notebook(String nome, boolean estado, String marca, String garania) {
		this.setNome(nome);
		this.setEstado(estado);
		this.setMarca(marca);
		this.setGarantia(garania);;
	}
	
	//	Metodos implementados da interface
	@Override
	public void ligar() {
		this.setEstado(true);
	}
	
	@Override
	public void desligar() {
		this.setEstado(false);
	}
	
	@Override
	public void exibirStatus() {
		System.out.println("Nome do Notebook: " + this.getNome());
		if(getEstado()) {
			System.out.println("Estado: ligado");
		} else {
			System.out.println("Estado: desligado");
		}
		System.out.println("Marca: " + this.getMarca());
		System.out.println("Garantia: " + this.getGarantia());
	}
	
	@Override
	public void resetar() {
		setNome(null);
		setEstado(false);
		setMarca(null);
		setGarantia(null);
	}
	
}
