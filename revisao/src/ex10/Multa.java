package ex10;

public class Multa {
	private int velocidadeMax;
	private int velocidadeVec;
	
	public int getVelocidadeMax() {
		return velocidadeMax;
	}
	public void setVelocidadeMax(int velocidadeMax) {
		this.velocidadeMax = velocidadeMax;
	}
	public int getVelocidadeVec() {
		return velocidadeVec;
	}
	public void setVelocidadeVec(int velocidadeVec) {
		this.velocidadeVec = velocidadeVec;
	}
	
	public void medidor() {
		if (this.velocidadeVec <= this.velocidadeMax) {
            System.out.println("Velocidade dentro do limite permitido.");
		} else if (this.velocidadeVec <= (this.velocidadeMax * 1.2)){
			System.out.println("Infração: Média\nMulta: R$ 130,16");
		} else if (this.velocidadeVec <= (this.velocidadeMax * 1.5)){
			System.out.println("Infração: Grave\nMulta: R$ 195,23");
		} else if (this.velocidadeVec > (this.velocidadeMax * 1.5)){
			System.out.println("Infração: Gravíssima\nMulta: R$ 880,41");
		}
	}
	

}
