package exercicioInterface;

public class Filme implements Reproduzivel, Favoritavel, Compartilhavel {
	private String titulo;
	
	Filme(String titulo){
		this.setTitulo(titulo);
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public void compartilhar(String redeSocial) {
		System.out.println("Compartilhando filme " + this.getTitulo() + " no " + redeSocial);
		
	}

	@Override
	public void reproduzir() {
		System.out.println("Reproduzindo filme: " + this.getTitulo());
		
	}

	@Override
	public void favoritar() {
		System.out.println("Filme " + this.getTitulo() + " adicionado aos favoritos");
		
	}

	

}
