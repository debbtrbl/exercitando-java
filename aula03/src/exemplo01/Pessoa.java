package exemplo01;

public class Pessoa {
	private String nome;
	private int idade;
	private int altura;
	
	// get retorna set atribui
	
	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public void atribuirNome(String nome) {
		this.nome = nome;
		}
	
	public void atribuirIdade(int idade) {
		this.idade = idade;
		}
	
	public String retornarNome() {
		return this.nome;
		}
	
	public int retornarIdade() {
		return this.idade;
		}
	
	
}
