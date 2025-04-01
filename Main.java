
public class Main {

	public static void main(String[] args) {
		Caneta caneta = new Caneta();
		
		caneta.marca = "Faber-Castell";
		caneta.cor = "Vermelho";
		caneta.ponta = 0.8f;
		caneta.tampada = false;
		
		caneta.destampar();
		caneta.escrever("UAU ESTOU ESCREVENDO ESTE TEXTO!!! :b");
		caneta.tampar();
		caneta.escrever("oi HAHAHAHA");

	}

}
