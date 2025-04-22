package ex09;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Prova a1 = new Prova();
		System.out.println("Digite as respostas do aluno: ");
		for (int i = 0; i < 10; i++) {
			 System.out.print("Questão " + (i + 1) + ": ");	
			 char resposta = entrada.next().charAt(0);
			 a1.responder(i, resposta);
		}
		
		a1.correcao();
		a1.resultado();
		
		entrada.close();

	}

}
