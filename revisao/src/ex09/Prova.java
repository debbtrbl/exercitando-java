package ex09;

public class Prova {
	private char[] gabarito;
	private char[] respostas;
	private int acertos;
	private int erros;
	
	Prova(){
		gabarito = new char[] {'A', 'C', 'B', 'D', 'A', 'B', 'C', 'D', 'A', 'B'};
		respostas = new char[10];
	}

	public int getAcertos() {
		return acertos;
	}

	public int getErros() {
		return erros;
	}

	public void responder(int q, char res) {
		if(q >= 0 && q <10) {
			respostas[q] = Character.toUpperCase(res);
		}
	}
	
	public void correcao() {
		this.acertos = 0;
		this.erros = 0;
		
		for (int i = 0; i < 10; i++) {
			if (respostas[i] == gabarito[i]) {
				acertos++;
			} else {
				erros++;
			}
		}
	}
	
	public void resultado() {
		 System.out.println("Resultado da prova:");
	     System.out.println("Acertos: " + getAcertos());
	     System.out.println("Erros: " + getErros());
	}
}
