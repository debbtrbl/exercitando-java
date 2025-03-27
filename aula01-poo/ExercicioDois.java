import java.util.Scanner;

public class ExercicioDois {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Altura: ");

        int altura = entrada.nextInt();

        System.out.print("Largura: ");

        int largura = entrada.nextInt();

        System.out.print("Comprimento: ");

        int comprimento = entrada.nextInt();

        System.out.println(altura*largura*comprimento);

        entrada.close();

        }
}
