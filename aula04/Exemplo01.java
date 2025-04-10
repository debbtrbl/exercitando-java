package aula04;

public class Exemplo01 {

	public static void main(String[] args) {
		int[] vetor = new int[5];
		
		vetor[0] = 55;
		vetor[1] = 66;
		vetor[2] = 77;
		vetor[3] = 88;
		vetor[4] = 99;
		
		System.out.println(vetor[3]);
		
		int[] vetor2 = {20, 30, 40, 50, 60};
		
		System.out.println(vetor2[4]);
		
		System.out.println("VETOR 1");
		for(int i = 0; i <= vetor.length - 1; i++) {
			System.out.println(vetor[i]);
		}
		
		System.out.println("VETOR 2");
		for(int i = 0; i <= vetor2.length - 1; i++) {
			System.out.println(vetor2[i]);
		}
		
		System.out.println("VETOR 2 - OUTRA MANEIRA");
		
		for(int elemento : vetor2) {
			System.out.println(elemento);
		}
		
		// ARRAYS MULTIDIMENIONAIS
		
				String [][] exemplo = new String [5][8];
				exemplo[3][5] = "Teste 1";
				exemplo[2][0] = "Teste 2";
				
				System.out.println(exemplo[3][5]);
				System.out.println(exemplo[2][0]);

	}

}
