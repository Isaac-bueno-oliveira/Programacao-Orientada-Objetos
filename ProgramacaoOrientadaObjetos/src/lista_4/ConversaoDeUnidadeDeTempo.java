package lista_4;

public class ConversaoDeUnidadeDeTempo {
	//	Declaracao das variaveis
	private static double segundos, minutos, horas, dias, semanas, mes, anos;
	
	//	Getters and Setters
	public static double getSegundos() {
		return segundos;
	}
	public static void setSegundos(double novosSegundos) {
		segundos = novosSegundos;
	}
	
	public static double getMinutos() {
		return minutos;
	}
	public static void setMinutos(double novoMinuto) {
		minutos = novoMinuto;
	}
	
	public static double getHoras() {
		return horas;
	}
	public static void setHoras(double novaHora) {
		horas = novaHora;
	}
	
	public static double getDias() {
		return dias;
	}
	public static void setDias(double novoDia) {
		dias = novoDia;
	}
	
	public static double getSemanas() {
		return semanas;
	}
	public static void setSemanas(double novaSemana) {
		semanas = novaSemana;
	}
	
	public static double getMes() {
		return mes;
	}
	public static void setMes(double novoMes) {
		mes = novoMes;
	}
	
	public static double getAnos() {
		return anos;
	}
	public static void setAnos(double novoAno) {
		anos = novoAno; 
	}
	
	//	Metodos construtores
	public void COnversaoDeUnidadeDeTempo() {
	}
	
	
	//	Metodos executores
	public static void minutosParaSegundos(double minutos) {
		setSegundos(minutos * 60);
		System.out.println("\n" + minutos + " minutos = " + getSegundos() + " segundos.");
	}
	
	public static void horasParaMinutos(double horas) {
		setMinutos(horas * 60);
		System.out.println("\n" + horas + " horas = " + getMinutos() + " minutos.");
	}
	
	public static void diasParaHoras(double dias) {
		setHoras(dias * 24);
		System.out.println("\n" + dias + " dias = " + getHoras() + " horas.");
	}
	
	public static void semanasParaDias(double semanas) {
		setDias(semanas * 7);
		System.out.println("\n" + semanas+ " semanas = " + getDias() + " dias.");
	}
	
	public static void mesesParaDias(double meses) {
		setDias(meses + 30);
		System.out.println("\n" + meses + " meses = " + getDias() + " dias.");
	}
	
	public static void anoParaDias(double anos) {
		setDias(anos * 365.25);
		System.out.println("\n" + anos + " anos = " + getDias() + " dias.");
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
