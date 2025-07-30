package lista_6;

public class TesteTransporte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("--- Carro ---");
        Carro meuCarro = new Carro("Sedan X", "ABC-1234");
        meuCarro.exibirDetalhes();
        meuCarro.iniciarViagem();
        meuCarro.exibirDetalhes();
        meuCarro.avaliar(5);
        meuCarro.finalizarViagem();
        meuCarro.exibirDetalhes();
        meuCarro.avaliar(3); // Pode ser avaliado novamente

        System.out.println("\n--- Bicicleta ---");
        Bicicleta minhaBike = new Bicicleta("Mountain Bike Y", 21);
        minhaBike.exibirDetalhes();
        minhaBike.iniciarViagem();
        minhaBike.finalizarViagem();
        minhaBike.avaliar(4);

        System.out.println("\n--- Patinete ---");
        Patinete meuPatinete = new Patinete("Patinete Z", true);
        meuPatinete.exibirDetalhes();
        meuPatinete.iniciarViagem();
        meuPatinete.finalizarViagem();
        meuPatinete.avaliar(2);
	}

}
