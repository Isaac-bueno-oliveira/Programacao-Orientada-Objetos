package lista_6;

public abstract class PedidoBase implements Pedido {
	//	Variaveis
	private String nomeItem;
	private double preco;
	private String status; //	"Pendente", "Em preparo", "Entregue"
	
	//	Construtores
	public PedidoBase() {
	}
	public PedidoBase(String nomeItem, double preco) {
		this.setNomeItem(nomeItem);
		this.setPreco(preco);
		this.setStatus("Pendente");
	}

	//	Getters and setters
	public String getNomeItem() {
		return nomeItem;
	}
	public double getPreco() {
		return preco;
	}
	public String getStatus() {
		return status;
	}

	public void setNomeItem(String nomeItem) {
		this.nomeItem = nomeItem;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	//	Metodos sobrescritos da interface
	@Override
	public void preparar() {
		if (this.getStatus().equalsIgnoreCase("Pendente")) {
			System.out.println("Iniciando o preparo de " + this.getNomeItem());
			this.setStatus("Em preparo");
		} else {
			System.out.println(this.getNomeItem() + " já está " + this.getStatus());
		}
	}
	
	@Override
	public void entregar() {
		if("Em preparo".equalsIgnoreCase(this.getStatus()) || "Pronto".equalsIgnoreCase(this.getStatus())) {
			System.out.println("Entregando " + this.getNomeItem());
			this.setStatus("Entregue");
		} else {
			System.out.println(this.getNomeItem() + " não está pronto para a entrega (Status: " + this.getStatus() + ")");
		}
	}
	
	//	Metodo de exibição dos detalhes de cada pedido
	public abstract void exibirStatus();
}
