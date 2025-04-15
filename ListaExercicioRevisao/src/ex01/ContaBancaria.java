package ex01;

public class ContaBancaria {
	private double saldo;
	private int numConta;
	private String nome;
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void status() {
		System.out.println("---------------------");
		System.out.println("Nome: " + this.getNome());
		System.out.println("Nº da Conta: " + this.getNumConta());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("---------------------");
	}
}
