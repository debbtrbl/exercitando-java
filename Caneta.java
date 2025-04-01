
public class Caneta {
	String marca;
	String cor;
	float ponta;
	boolean tampada;
	
	Caneta(){
		this.marca = "BIC";
		this.cor = "Azul";
		this.ponta = 0.5f;
		this.tampada = true;
	}
	
	public void tampar() {
		this.tampada = true;
		System.out.println("Tampei :)");
	}
	
	public void destampar() {
		this.tampada = false;
		System.out.println("Destampei :O");
	}
	
	public void escrever(String texto) {
		if (tampada == false) {System.out.println("Escrevendo..." + texto);} 
		else {System.out.println("Oops! Não consigo escrever com tampa");}
	}
	
}
