import java.util.Scanner;
import java.lang.Math;

public class ExercicioQuatro {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Raio: ");

        float raio = entrada.nextFloat();

        double potencia = Math.pow(raio, 2);

        float pi = 3.14159f;

        double area = pi*potencia;

        System.out.printf("%.4f%n", area);

        entrada.close();
    
    }
}
