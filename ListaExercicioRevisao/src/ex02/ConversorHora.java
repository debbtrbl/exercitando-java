package ex02;

public class ConversorHora {
	private int hora;

	public int getHora() {
		return hora;
	}

	public void setHora(int horas) {
		this.hora = horas;
	}
	
	public void ConverterSegundos() {
		int res = this.hora * 3600;
		System.out.println(res + " Segundos");
		
	}
	
	public void ConverterMinutos() {
		int res = this.hora * 60;
		System.out.println(res + " Minutos");
	}
	
}
