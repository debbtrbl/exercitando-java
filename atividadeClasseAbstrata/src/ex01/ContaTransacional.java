package ex01;

public abstract class ContaTransacional extends Conta {
	protected double limite;
	
	public ContaTransacional(int numConta, 
			String titular, double saldo, double limite) {
		super(numConta, titular, saldo);
		this.limite = limite;
		
	}
	
	public double verificarLimite() {
		return limite;
	}
}
