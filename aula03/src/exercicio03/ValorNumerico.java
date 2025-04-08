package exercicio03;

public class ValorNumerico {
	private int valor;

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
	public void incrementar() {
		this.setValor(getValor() + 1);
		
	}
	
	public void decrementar() {
		this.setValor(getValor() - 1);
	}
	
	public void zerar() {
		this.valor = 0;
	}
	
	public void multiplicar(int num) {
		this.setValor(getValor() * num);
	}
	
	public void status() {
		System.out.println("O valor número é " + getValor());
	}
	
	
}

