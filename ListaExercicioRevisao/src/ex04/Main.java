package ex04;

public class Main {

	public static void main(String[] args) {
		// questões 4, 5 e 6
		Funcionario[] lista_funcionarios = new Funcionario[5];
		lista_funcionarios[0] = new Funcionario("Isabelly", 19, 10000.00);
		lista_funcionarios[1] = new Funcionario("Débora", 12, 5000.00);
		lista_funcionarios[2] = new Funcionario("Victor", 56, 1.00);
		
		for (int i = 0; i < lista_funcionarios.length; i++) {
			if (lista_funcionarios[i] != null) {
				lista_funcionarios[i].dados();
			}
		}	
	}
}
