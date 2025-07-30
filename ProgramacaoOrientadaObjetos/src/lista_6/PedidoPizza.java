package lista_6;

public class PedidoPizza extends PedidoBase {
	//	Variaveis
	private String sabor;
	private String tamanho;
	
	//	Construtor
	public PedidoPizza() {
	}
	public PedidoPizza(String nomeItem, double preco, String sabor, String tamanho) {
		super(nomeItem, preco);
		this.setSabor(sabor);
		this.setTamanho(tamanho);
	}
	
	//	Getters and setters
	public String getSabor() {
		return sabor;
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setSabor(String sabor) {
		this.sabor = sabor;	
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
		
	@Override
	public void exibirStatus() {
		System.out.println("### STATUS DO PEDIDO ###");
		System.out.println("\nNome do item: " + this.getNomeItem());
		System.out.println("Preço: R$ " + this.getPreco());
		System.out.println("Sabor: " + this.getSabor());
		System.out.println("Tamanho: " + this.getTamanho());
		System.out.println("Status: " + this.getStatus());
	}
}






