package exercicio01;

public class Calculadora {
	int num1;
	int num2;
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	public int somar() {
		int soma = num1 + num2;
		return soma;
	}
	public int subtrair() {
		int sub = num1 - num2;
		return sub;
	}
	public int multiplicar() {
		int mult = num1 * num2;
		return mult;
	}
	public int dividir() {
		int div = num1 / num2;
		return div;
	}
	

}
