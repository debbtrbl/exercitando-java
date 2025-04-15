package ex01;

public class Main {

	public static void main(String[] args) {
		ContaBancaria c1 = new ContaBancaria();
		ContaBancaria c2 = new ContaBancaria();
		
		c1.setNome("Eric");
		c1.setNumConta(123456);
		c1.setSaldo(10000.00);
		
		c2.setNome("Deb");
		c2.setNumConta(654321);
		c2.setSaldo(1.00);
		
		c1.status();
		c2.status();
	}

}
