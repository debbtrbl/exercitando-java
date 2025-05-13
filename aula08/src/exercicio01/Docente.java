package exercicio01;

public class Docente extends Pessoa {
	private String areaAtuacao;
	
	public Docente(String nome, int idade, String area) {
		super(nome, idade);
		this.areaAtuacao = area;
	}

	public String getAreaAtuacao() {
		return areaAtuacao;
	}

	public void setAreaAtuacao(String areaAtuacao) {
		this.areaAtuacao = areaAtuacao;
	}
	
	
}
