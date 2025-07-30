package lista_6;

public class Patinete extends MeioTransporteBase implements Avaliavel {
	//	Variaveis
    private boolean eletrico;

    //	Construtor
    public Patinete(String nome, boolean eletrico) {
        super(nome);
        this.setEletrico(eletrico);
    }

    //	Getters and setters
	public boolean isEletrico() {
        return eletrico;
    }
	public void setEletrico(boolean eletrico) {
		this.eletrico = eletrico;
	}

    @Override
    public void exibirDetalhes() {
        System.out.println("--- Detalhes do Patinete ---");
        System.out.println("Modelo: " + this.getNome());
        System.out.println("Elétrico: " + (this.isEletrico() ? "Sim" : "Não"));
        System.out.println("Em viagem: " + (this.isViagemEmAndamento() ? "Sim" : "Não"));
        System.out.println("----------------------------");
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
