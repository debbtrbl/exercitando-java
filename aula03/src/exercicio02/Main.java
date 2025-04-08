package exercicio02;

public class Main {

	public static void main(String[] args) {
		Atleta atleta = new Atleta();
		atleta.setQntMedalhas(3);
		atleta.setNome("Paulinho do Arrocha");
		atleta.setEsporte("Ping Pong de mesa");
		
		atleta.status();
		
		System.out.println("---------------------");
		
		atleta.acrescentarMedalha(3);
		
		atleta.retirarMedalha(7);
		
		atleta.status();

	}

}
