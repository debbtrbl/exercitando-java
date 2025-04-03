package exercicio01;

public class Principal {

	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		
		calculadora.setNum1(4);
		calculadora.setNum2(2);
		
		System.out.println("Soma de " + calculadora.num1 + " e " + calculadora.num2 + " é igual a " + calculadora.somar());
		System.out.println("Subtração de " + calculadora.num1 + " e " + calculadora.num2 + " é igual a " + calculadora.subtrair());
		System.out.println("Multiplicação de " + calculadora.num1 + " e " + calculadora.num2 + " é igual a " + calculadora.multiplicar());
		System.out.println("Divisão de " + calculadora.num1 + " e " + calculadora.num2 + " é igual a " + calculadora.dividir());

	}

}
