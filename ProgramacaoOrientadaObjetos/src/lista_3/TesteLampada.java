package lista_3;

//	Questao_1

public class TesteLampada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lampada lampada = new Lampada();
		lampada.ligar();
		lampada.status();	
		System.out.println();
		Lampada lampada1 = new Lampada("Positivo", "Lampada LED", "110V", false); 
		lampada1.status();
	}

}
