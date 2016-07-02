package consola;

import genericos.ListaArray;

public class App {
	public static void main(String[] args) {
		ListaArray lista = new ListaArray(3);
		
		lista.addArray(0, 1);
		lista.addArray(1, 2);
		lista.addArray(2, 3);
		
		System.out.println(lista);
	}
}//fin class App
