package aula04;
import java.util.Scanner;

public class exercicio01 {
	

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[] vetor = new int[5];
//		System.out.print("Digite o primeiro número: ");
//		vetor[0] = entrada.nextInt();
//		System.out.print("Digite o segundo número: ");
//		vetor[1] = entrada.nextInt();
//		System.out.print("Digite o terceiro número: ");
//		vetor[2] = entrada.nextInt();
//		System.out.print("Digite o quarto número: ");
//		vetor[3] = entrada.nextInt();
//		System.out.print("Digite o quinto número: ");
//		vetor[4] = entrada.nextInt();
		for(int i = 0; i <= 4; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = entrada.nextInt();
		}
		
		System.out.println("Os números da sua lista são: ");
		for(int elemento : vetor) {
			System.out.println(elemento);
		}
		
		
		

	}

}
