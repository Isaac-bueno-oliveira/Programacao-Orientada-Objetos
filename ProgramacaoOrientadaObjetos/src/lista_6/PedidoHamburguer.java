package lista_6;

public class PedidoHamburguer extends PedidoBase {
	//	Variaveis
	private String tipoHam;
	private String pontoCarne;
	
	//	Construtor
	public PedidoHamburguer() {

	}
	public PedidoHamburguer(String nomeItem, double preco, String tipoHam, String pontoCarne) {
		super(nomeItem, preco);
		this.setTipoHam(tipoHam);
		this.setPontoCarne(pontoCarne);	
		super.setStatus("Pendente");
	}

	//	Getters and setters
	public String getTipoHam() {
		return tipoHam;
	}
	public String getPontoCarne() {
		return pontoCarne;
	}
	public void setTipoHam(String tipoHam) {
		this.tipoHam = tipoHam;
	}
	public void setPontoCarne(String pontoCarne) {
		this.pontoCarne = pontoCarne;
	}
	
	@Override
	public void exibirStatus() {
		System.out.println("### STATUS DO PEDIDO ###");
		System.out.println("\nNome do item: " + this.getNomeItem());
		System.out.println("Ponto da carne: " + this.getPontoCarne());
		System.out.println("Tipo do hamburguer: " + this.getTipoHam());
		System.out.println("Preço: R$ " + this.getPreco());
		System.out.println("Status: " + this.getStatus());
	}
}
