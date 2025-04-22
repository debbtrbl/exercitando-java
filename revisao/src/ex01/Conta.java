package ex01;

public class Conta {
	private double saldo;
	private int numero;
	private String nome;
	
	Conta(String nome, int numero, double saldo){
		this.nome = nome;
		this.numero = numero;
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void status() {
		System.out.println("Nome: " + getNome());
		System.out.println("Conta: " + getNumero());
		System.out.println("Saldo: " + getSaldo());
	}
}
