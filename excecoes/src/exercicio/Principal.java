package exercicio;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        try {
            Scanner entrada = new Scanner(System.in);

            System.out.println("Digite o primeiro número: ");
            int num1 = entrada.nextInt();

            System.out.println("Digite o segundo número: ");
            int num2 = entrada.nextInt();

            Calculadora cal = new Calculadora(num1, num2);

            System.out.println("Escolha uma operação: ");
            System.out.println("Adição [+] ");
            System.out.println("Subtração [-] ");
            System.out.println("Multiplicação [*] ");
            System.out.println("Divisão [/] ");
            String op = entrada.next();

            switch (op) {
                case "+":
                    cal.somar();
                    break;
                case "-":
                    cal.subtrair();
                    break;
                case "*":
                    cal.multiplicar();
                    break;
                case "/":
                    cal.dividir();
                    break;
                default:
                    System.out.println("Operação inválida.");
            }

            entrada.close();
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
