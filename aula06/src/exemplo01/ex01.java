package exemplo01;

import java.util.ArrayList;

public class ex01 {

	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<String>();
		String texto = "Teste 1";
		
		lista.add(texto);
		lista.add("Teste 2");
		System.out.println(lista);
		System.out.println(lista.get(1));
		for(String item:lista) {
			System.out.println(item);
		}
		lista.remove(0);
		System.out.println(lista);
		lista.clear();
		System.out.println("A lista é: " + lista);

	}

}
