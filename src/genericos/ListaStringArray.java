package genericos;

import java.util.Arrays;

public class ListaStringArray {
	private String[] array; 
	
	public ListaStringArray(int tamanho){
		array = new String[tamanho];//creamos el array 
	}
	
	/**
	 * A�ade un elemento al array
	 * @param posicion - posicion array
	 * @param elemento - contenido array
	 */
	public void addArray(int posicion, String elemento){
		if(posicion>=0 && posicion < array.length)//Estamos dentro del rango
		array[posicion] = elemento; 
		else 
			throw new RuntimeException("La posici�n no existe en el array."); 
	}

	@Override
	public String toString() {
		return Arrays.toString(array); 
	}
}//fin class ListaArray
