package exemplo01;

public class Principal {

	public static void main(String[] args) {
		Veiculo v1 = new Veiculo();
		VeiculoTerrestre v2 = new VeiculoTerrestre();
		VeiculoAereo v3 = new VeiculoAereo();
		
		System.out.println("v1 eh veiculo? " + (v1 instanceof Veiculo));
		System.out.println("v1 eh veiculo terrestre? " +(v1 instanceof VeiculoTerrestre));
		System.out.println("v2 eh veiculo " + (v2 instanceof Veiculo));
		System.out.println("v2 eh veiculo terrestre? " + (v1 instanceof VeiculoTerrestre));
		
		v2.setMarca("Mercedes");
		v2.setNumRodas(4);
		v3.setMarca("sei la");
		v3.setTipoAsa("delta");

	}

}
