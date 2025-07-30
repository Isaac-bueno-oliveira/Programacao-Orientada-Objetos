package lista_6;

public class Televisao extends DispositivoBase implements DispositivoEletronico {
	//	Construtores
	public Televisao() {
	}
	public Televisao (String nome, boolean estado, String marca, String garantia) {
		super(nome, estado, marca, garantia);
	}
	
	//	Metodos implementados da interface
	@Override
	public void ligar() {
		this.setEstado(true);
		System.out.println("TV está ligada");
	}
	
	@Override
	public void desligar() {
		this.setEstado(false);
	}
	
	@Override
	public void exibirStatus() {
		System.out.println("Nome do dispositivo: " + this.getNome());
		if (this.getEstado()) {
			System.out.println("Estado: ligado");
		} else {
			System.out.println("Estado: desligado");
		}
		System.out.println("Marca: " + this.getMarca());
		System.out.println("Garantia: " + this.getGarantia());
	}
	
	@Override
	public void resetar() {
		this.setNome(null);
		this.setEstado(false);
		this.setMarca(null);
		this.setGarantia(null);
	}
}
