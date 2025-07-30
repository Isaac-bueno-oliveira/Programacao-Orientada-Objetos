package lista_6;

public class PedidoBebida extends PedidoBase {
	//	Variaveis
	private boolean comLimao;
	
	//	Construtor
	public PedidoBebida() {
		
	}
	public PedidoBebida(String nomeItem, double preco, boolean comLimao) {
		super(nomeItem, preco);
		this.setComLimao(comLimao);
		this.setStatus("Pendente");
	}
	
	//	Getters and setters
	public boolean isComLimao() {
		return comLimao;
	}
	public void setComLimao(boolean comLimao) {
		this.comLimao = comLimao;
	}
	
	@Override
	public void preparar() {
		if (this.getStatus().equalsIgnoreCase("Pendente")) {
			//System.out.println(this.getNomeItem() + " solicitada ao garçom");
			this.setStatus("Solicitado ao garçom");
		} else {
			System.out.println(this.getNomeItem() + " já está " + this.getStatus());
		}
	}
	
	@Override
	public void entregar() {
		if("Solicitado ao garçom".equalsIgnoreCase(this.getStatus()) || "Pronto".equalsIgnoreCase(this.getStatus())) {
			System.out.println("Entregando " + this.getNomeItem());
			this.setStatus("Entregue");
		} else {
			System.out.println(this.getNomeItem() + " não está pronto para a entrega (Status: " + this.getStatus() + ")");
		}
	}
	
	@Override
	public void exibirStatus() {
		System.out.println("### STATUS DO PEDIDO ###");
		System.out.println("\nNome do item: " + this.getNomeItem());
		System.out.println("Preço: R$ " + this.getPreco());
		System.out.println("Status: " + this.getStatus());
		if (this.isComLimao()) {
			System.out.println("Bebiba com limão");
		} else {
			System.out.println("Bebida sem limão");
		}
	}
	
}
