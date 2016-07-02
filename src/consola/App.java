package consola;

import genericos.ListaArray;

public class App {
	public static void main(String[] args) {
		ListaArray<Integer> lista = new ListaArray<>(3); 
		
		lista.addArray(0, 1);
		lista.addArray(1, 2);
		lista.addArray(2, 3);
		
		System.out.println(lista);
		
		//---------------------------------------------
		ListaArray<String> lista2 = new ListaArray<>(3); 
		
		lista2.addArray(0, "a");
		lista2.addArray(1, "b");
		lista2.addArray(2, "c");
		
		System.out.println(lista2);
	}
}//fin class App
