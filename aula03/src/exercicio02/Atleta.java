package exercicio02;

public class Atleta {
	private String nome;
	private String esporte;
	private int qntMedalhas;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEsporte() {
		return esporte;
	}

	public void setEsporte(String esporte) {
		this.esporte = esporte;
	}

	public int getQntMedalhas() {
		return qntMedalhas;
	}

	public void setQntMedalhas(int qntMedalhas) {
		this.qntMedalhas = qntMedalhas;
	}
	
	public void acrescentarMedalha(int quantidade) {
		this.setQntMedalhas(getQntMedalhas()+ quantidade);
		System.out.println("Medalha adicionada com sucesso!");
	}
	
	public void retirarMedalha(int quantidade) {
		this.setQntMedalhas(getQntMedalhas()- quantidade);
		if (getQntMedalhas() < 0) {this.setQntMedalhas(0);} 
		System.out.println("Medalha retirada com sucesso!");
	}
	
	public void status() {
		System.out.println("Nome: " + getNome());
		System.out.println("Esporte: " + getEsporte());
		System.out.println("Medalhas: " + getQntMedalhas());
	}
	
	
	
}
