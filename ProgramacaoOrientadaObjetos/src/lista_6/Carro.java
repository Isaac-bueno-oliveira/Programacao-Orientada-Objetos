package lista_6;

public class Carro extends MeioTransporteBase implements Avaliavel {
    //	Variaveis
	private String placa;

	//	Construtor
    public Carro(String nome, String placa) {
        super(nome);
        this.placa = placa;
    }

    //	Getters and setters
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
		this.placa = placa;
	}

	@Override
    public void exibirDetalhes() {
        System.out.println("--- Detalhes do Carro ---");
        System.out.println("Modelo: " + this.getNome());
        System.out.println("Placa: " + this.getPlaca());
        System.out.println("Em viagem: " + (super.isViagemEmAndamento() ? "Sim" : "Não"));
        System.out.println("-------------------------");
    }
	
	@Override
	public void avaliar(int nota) {
		if (nota >= 1 && nota <= 5) {
            System.out.println(this.getNome() + " avaliado com nota: " + nota + " estrelas.");
        } else {
            System.out.println("Nota inválida para " + this.getNome() + ". Use de 1 a 5.");
        }
	}
}
