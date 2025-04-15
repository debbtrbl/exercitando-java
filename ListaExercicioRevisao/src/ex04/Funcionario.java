package ex04;

public class Funcionario {
	private String nome;
	private int idade;
	private double salario;
	
	Funcionario(String nome, int idade, double salario){
		this.nome = nome;
		this.idade = idade;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void dados() {
		System.out.println("--------------");
		System.out.println("Nome: " + getNome());
		System.out.println("Idade: " + getIdade() + " anos");
		System.out.println("Salário: " + getSalario());
		System.out.println("--------------");
	}
}
