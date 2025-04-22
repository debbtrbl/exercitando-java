package ex07e08;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Cadastro[] funcionarios = new Cadastro[10];
		int contador = 0;
		double soma = 0;
	
		System.out.println("Cadastro de funcionários (digite fim para finalizar)");
		
		for(int i = 0; i < 10; i++) {
			System.out.print("Nome: ");
			String nome = entrada.nextLine();
			
			if (nome.equals("fim")){
				break;
			}
			
			System.out.print("Idade: ");
			int idade = entrada.nextInt();
			entrada.nextLine(); 
			
			System.out.print("Salário: ");
			double salario = entrada.nextDouble();
			entrada.nextLine(); 
			
			funcionarios[i] = new Cadastro(nome, idade, salario);
			contador++;
			soma += salario;
			System.out.println("Cadastrado com sucesso! ");
		}
		
		System.out.println("--------------------------");
		System.out.println("Funcionários cadastrados: ");
		System.out.println("--------------------------");
		for(int i = 0; i < funcionarios.length; i++) {
			if (funcionarios[i] != null) {
				funcionarios[i].dados();
			}
		}
		
		System.out.println("Quantidade de funcioários: " + contador);
		
		if (contador > 0) {
			double media = soma/contador;
			System.out.println("Média dos salários: " + media);
		} else {
			System.out.println("Nenhum funcionário cadastrado");
		}
		entrada.close();
	}

}
