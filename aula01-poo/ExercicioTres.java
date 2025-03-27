import java.util.Scanner;

public class ExercicioTres {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Base: ");
        float base = entrada.nextInt();

        System.out.print("Altura: ");
        float altura = entrada.nextInt();

        float area = (base*altura)/2;

        System.out.println(area);

        entrada.close();
    }
}
