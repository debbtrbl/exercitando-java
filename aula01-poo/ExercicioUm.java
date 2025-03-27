import java.util.Scanner;

public class ExercicioUm
{
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite seu primeiro nome: ");
		
		String primeiro = entrada.nextLine();
		
	    System.out.print("Digite seu sobrenome: ");
	
		String sobrenome = entrada.nextLine();
		
		String completo = primeiro + " " + sobrenome;
		
		System.out.println(completo);

		entrada.close();
		
	}
}
