package exercicioInterface;

public class PlataformaStreaming {
	public void reproduzirMidia(Reproduzivel conteudo) {
		conteudo.reproduzir();
	}
	
	public void favoritarMidia(Favoritavel conteudo) {
		conteudo.favoritar();
	}
	
	public void compartilharMidia(Compartilhavel conteudo, String redeSocial) {
		conteudo.compartilhar(redeSocial);
	}
}
