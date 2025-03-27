package aula01;

public class Principal {

	public static void main(String[] args) {
		Veiculo veiculo = new Veiculo();
		
		veiculo.cor = "Azul";
		veiculo.numeroRodas = 4;
		veiculo.velocidade = 10000;
		veiculo.modelo = "Opala";
		veiculo.placa = "PCY0631";
		
		veiculo.imprimirDados();
		
		veiculo.acelerar(25);
		
		veiculo.imprimirDados();
		
	}

}
