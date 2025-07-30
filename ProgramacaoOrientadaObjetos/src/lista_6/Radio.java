package lista_6;

public class Radio extends DispositivoBase implements DispositivoEletronico {
	//	Construtores
	public Radio() {
	}
	
	public Radio (String nome, boolean estado, String marca, String garantia) {
		this.setNome(nome);
		this.setEstado(estado);
		this.setMarca(marca);
		this.setGarantia(garantia);
	}
	
	//	Metodos implementados da interface
	@Override
	public void ligar() {
		this.setEstado(true);
		System.out.println("Radio ligado");
	}
	
	@Override
	public void desligar() {
		this.setEstado(false);
		System.out.println("Radio desligado");
	}
	
	@Override
	public void exibirStatus() {
		System.out.println("Nome do radio: " + this.getNome());
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
		setGarantia(getGarantia());
	}
}