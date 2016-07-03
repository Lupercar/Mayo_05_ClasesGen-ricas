package genericos;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ListaArray<T> {
	private T[] array; 
	
	/**
	 * Creo array en constructor
	 * @param tamanho - dimension del array
	 */
	public ListaArray(int tamanho){
		array = (T[])new Object[tamanho];//creamos el array 
	}
	
	/**
	 * Añade un elemento al array
	 * @param posicion - posicion del array
	 * @param elemento - contenido array
	 */
	public void addArray(int posicion, T elemento){
		if(posicion>=0 && posicion < array.length)//Estamos dentro del rango
		array[posicion] = elemento; 
		else 
			throw new RuntimeException("La posición no existe en el array."); 
	}
	
	@Override
	public String toString() {
		return Arrays.toString(array); 
	}
}//fin class ListaArray
