package lista_6;

public class Bicicleta extends MeioTransporteBase implements Avaliavel {
    //	Variaveis
	private int numeroMarchas;

	//	Construtor
    public Bicicleta(String nome, int numeroMarchas) {
        super(nome);
        this.setNumeroMarchas(numeroMarchas); 
    }

    //	Getters and setters
    public int getNumeroMarchas() {
        return numeroMarchas;
    }
    public void setNumeroMarchas(int numeroMarchas) {
		this.numeroMarchas = numeroMarchas;
	}
	
    @Override
    public void exibirDetalhes() {
        System.out.println("--- Detalhes da Bicicleta ---");
        System.out.println("Modelo: " + this.getNome());
        System.out.println("Marchas: " + this.getNumeroMarchas());
        System.out.println("Em viagem: " + (this.isViagemEmAndamento() ? "Sim" : "Não"));
        System.out.println("-----------------------------");
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