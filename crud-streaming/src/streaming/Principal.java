package streaming;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		ArrayList<Filme> filmes = new ArrayList<Filme>();
		Scanner entrada = new Scanner(System.in);
		
		int op;
		
		do {
			System.out.println("-------------------------");
			System.out.println("Bem-vindo ao Debbflix! :)");
			System.out.println();
			System.out.println("1 - Cadastrar filme");
			System.out.println("2 - Listar filme");
			System.out.println("3 - Remover filme");
			System.out.println("0 - Sair");
			System.out.print("Escolha uma opção: ");
			
			op = entrada.nextInt();
			
			switch (op) {
			case 1:
				System.out.print("Digite o título do filme: ");
				String titulo = entrada.next();
				System.out.print("Digite o ano do filme: ");
				int ano = entrada.nextInt();
				System.out.print("Digite a duração do filme: ");
				int duracao = entrada.nextInt();
                Filme filme = new Filme(titulo, duracao, ano);
                filmes.add(filme);
                
			case 2:
				for(Filme filme1:filmes) {
					filme1.mostrarDados();
				}
			}
		} while(op != 0);

	}

}
