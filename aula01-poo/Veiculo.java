package aula01;

public class Veiculo {
	String cor;
	int velocidade;
	int numeroRodas;
	String modelo;
	String placa;
	
	public void acelerar(int incremento){
		this.velocidade += incremento;
	}
	
	public void imprimirDados() {
		System.out.println("Cor: " + this.cor);
		System.out.println("Número de rodas: " + this.numeroRodas);
		System.out.println("Velocidade: " + this.velocidade);
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Placa: " + this.placa);
	}
	
}
