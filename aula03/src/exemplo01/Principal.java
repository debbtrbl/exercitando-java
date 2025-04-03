package exemplo01;

public class Principal {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		
		pessoa.atribuirNome("João");
		pessoa.atribuirIdade(20);
		pessoa.setAltura(175);
		
		System.out.println("Nome: " + pessoa.retornarNome());
		System.out.println("Idade: " + pessoa.retornarIdade());
		System.out.println("Altura: " + pessoa.getAltura()+ "cm");
		
		

	}

}
