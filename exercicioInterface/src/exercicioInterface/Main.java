package exercicioInterface;

public class Main {

	public static void main(String[] args) {
		PlataformaStreaming plataforma = new PlataformaStreaming();
		
		Filme f1 = new Filme("Shrek");
		Serie s1 = new Serie("The Witcher");
		Podcast p1 = new Podcast("PodPah");
		
		plataforma.reproduzirMidia(f1);
		plataforma.favoritarMidia(f1);
		plataforma.compartilharMidia(f1, "Instagram");
		
		plataforma.reproduzirMidia(s1);
		plataforma.favoritarMidia(s1);
		
		
		plataforma.reproduzirMidia(p1);
		plataforma.compartilharMidia(p1, "Twitter");

	}

}
