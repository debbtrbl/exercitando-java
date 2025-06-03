package ex01;

public abstract class Conta {
	private int numConta;
	private String titular;
	private double saldo;
	
	public Conta(int numConta, String titular, double saldo) {
		this.numConta = numConta;
		this.titular = titular;
		this.saldo = saldo;
	}
	public abstract void sacar(double valor);
	public abstract void depositar(double valor);
	public abstract void exibirDados();
	public abstract void verificarSaldo();
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
