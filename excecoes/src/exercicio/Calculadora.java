package exercicio;

public class Calculadora {
    private int num1;
    private int num2;

    Calculadora(int num1, int num2) {
    	if(num1 < 0 || num2 < 0) {
    		throw new IllegalArgumentException("Números negativos não são aceitos!");
    	}
        this.num1 = num1;
        this.num2 = num2;
    }

    public void somar() {
        int res = this.num1 + this.num2;
        System.out.println(res);
    }

    public void subtrair() {
        int res = this.num1 - this.num2;
        System.out.println(res);
    }

    public void multiplicar() {
        int res = this.num1 * this.num2;
        System.out.println(res);
    }

    public void dividir() {
        try {
            int res = this.num1 / this.num2;
            System.out.println(res);
        } catch (ArithmeticException e) {
            System.out.println("Não é possível dividir por zero!");
        }
    }
}
