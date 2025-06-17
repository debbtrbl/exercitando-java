package exercicioInterface;

public class Serie implements Reproduzivel, Favoritavel {
	private String titulo;
	
	Serie(String titulo){
		this.setTitulo(titulo);
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	@Override
	public void favoritar() {
		System.out.println("Serie " + this.getTitulo() + " adicionado aos favoritos");
		
	}

	@Override
	public void reproduzir() {
		System.out.println("Reproduzindo serie: " + this.getTitulo());
		
	}

}
