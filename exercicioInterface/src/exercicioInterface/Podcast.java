package exercicioInterface;

public class Podcast implements Reproduzivel, Compartilhavel{
	private String titulo;
	
	Podcast(String titulo){
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
		System.out.println("Compartilhando podcast " + this.getTitulo() + " no " + redeSocial);
		
	}

	@Override
	public void reproduzir() {
		System.out.println("Reproduzindo podcast: " + this.getTitulo());
		
	}

}
