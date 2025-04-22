package ex04;

public class Main {
    public static void main(String[] args){
        // questao 05
        Funcionario f1 = new Funcionario("Kid", 38, 60000.0);
        Funcionario f2 = new Funcionario("Nala", 30, 10000.0);
        Funcionario f3 = new Funcionario("Bob", 45, 1000.0);
        
        f2.dados();
        f1.dados();
        f3.dados();
        
        // questao 06
        
        Funcionario[] funcionarios = new Funcionario[5];
        funcionarios[0] = new Funcionario("Ari", 20, 600.0);
        funcionarios[1] = new Funcionario("Dante", 19, 700.0);
        funcionarios[2] = new Funcionario("Nick", 18, 500.0);
        funcionarios[3] = new Funcionario("Charlie", 18, 500.0);
        funcionarios[4] = new Funcionario("Patrick", 19, 600.0);
        
        for(int i = 0; i < funcionarios.length; i++) {
        	if (funcionarios != null) {
        		funcionarios[i].dados();
        	}
        }
    }
}
