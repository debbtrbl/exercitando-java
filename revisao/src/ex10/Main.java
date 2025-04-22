package ex10;

public class Main {

	public static void main(String[] args) {
		System.out.println("Carro 70km/h - Max 80km/h"); 
        Multa multa1 = new Multa();
        multa1.setVelocidadeMax(80);
        multa1.setVelocidadeVec(70);
        multa1.medidor(); 
        System.out.println("--------------------------");
        
        System.out.println("Carro 120km/h - Max 100km/h");
        Multa multa2 = new Multa();
        multa2.setVelocidadeMax(100);
        multa2.setVelocidadeVec(120);
        multa2.medidor(); 
        System.out.println("--------------------------");

        System.out.println("Carro 150km/h - Max 100km/h"); 
        Multa multa3 = new Multa();
        multa3.setVelocidadeMax(100);
        multa3.setVelocidadeVec(150);
        multa3.medidor(); 
        System.out.println("--------------------------");

        System.out.println("Carro 200km/h - Max 150km/h");
        Multa multa4 = new Multa();
        multa4.setVelocidadeMax(100);
        multa4.setVelocidadeVec(200);
        multa4.medidor();  

	}

}
