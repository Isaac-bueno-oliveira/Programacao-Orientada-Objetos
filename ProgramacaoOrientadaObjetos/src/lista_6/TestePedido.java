package lista_6;

public class TestePedido {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PedidoPizza pizza = new PedidoPizza("Pizza", 80, "4 queijos", "grande");
		//pizza.exibirStatus();
		//pizza.setStatus("Entregue");
		//pizza.preparar();
		pizza.entregar();
		pizza.exibirStatus();
		System.out.println();
		
		PedidoHamburguer hamburguer = new PedidoHamburguer("Hamburguer de costela", 45, "Costela", "Mal passado");
		hamburguer.exibirStatus();
		//hamburguer.preparar();
		//hamburguer.entregar();
		System.out.println();
		//hamburguer.exibirStatus();
		
		PedidoBebida coca = new PedidoBebida("Coca-cola", 5, true);
		//coca.preparar();
		coca.entregar();
		coca.exibirStatus();
		coca.preparar();
		coca.exibirStatus();
	}

}
