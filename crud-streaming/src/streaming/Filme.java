package streaming;

public class Filme {
	private String titulo;
	private int duracao;
	private int ano;
	
	public Filme(String titulo, int duracao, int ano) {
        this.titulo = titulo;
        this.duracao = duracao;
        this.ano = ano;
    }
	
	 public String getTitulo() {
		return titulo;
	}



	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}



	public int getDuracao() {
		return duracao;
	}



	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}



	public int getAno() {
		return ano;
	}



	public void setAno(int ano) {
		this.ano = ano;
	}


	public void mostrarDados() {
		System.out.println("Título: " + getTitulo());
		System.out.println("Ano: " + getAno());
		System.out.println("Duração: " + getDuracao());
	}
	
	
}
