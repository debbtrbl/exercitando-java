package ex01;

public class ContaCorrente extends ContaTransacional{
	public ContaCorrente(int numConta, String titular, double saldo, double limite) {
		super(numConta, titular, saldo, limite);
		// TODO Auto-generated constructor stub
	}

	protected int taxa;
	
	@Override
	public void sacar(double valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void depositar(double valor) {
		this.setSaldo(this.getSaldo() + valor);
		
	}

	@Override
	public void exibirDados() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void verificarSaldo() {
		// TODO Auto-generated method stub
		
	}
	
}
