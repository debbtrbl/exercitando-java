package ex02;

public class Conversor {
	private int hora;
	
	Conversor(int hora){
		this.hora = hora;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}
	
	public void converteSegundo() {
		int res = getHora() * 3600;
		System.out.println(res + " Segundos");
	}
	
	public void converteMinuto() {
		int res = getHora() * 60;
		System.out.println(res + " Minutos");
	}
}
