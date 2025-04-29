package exercicio01;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
		
		System.out.println("Cadastro de novo funcionário");

		while(true) {
			System.out.print("Nome: ");
			String nome = entrada.nextLine();
			
			System.out.print("Idade: ");
			int idade = entrada.nextInt();
			entrada.nextLine(); 
			
			System.out.print("Salário: ");
			double salario = entrada.nextDouble();
			entrada.nextLine();
			
			Funcionario funcionario = new Funcionario(nome, idade, salario);
			funcionarios.add(funcionario);
			
			System.out.println("Deseja cadastrar mais funcionários? (s/n)");
			String op = entrada.nextLine();
			
			if (op.equals("n")){
				break;}
		}
		
	}
}
