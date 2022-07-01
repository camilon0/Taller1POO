package Taller;

import java.util.ArrayList;
/**
 * Representa una Fruta y varias de sus características, atributos y métodos elementales.
 * 
 * @author Juan Camilo García García.
 *
 * Version
 */
class Fruit{
	/**
	 * Representa el nombre de Fruta.
	 */
	private String name;
	/**
	 * Representa el peso promedio.
	 */
	private float averageWeight;
	/**
	 * Representa los colores de la fruta en un arreglo bidimensional.
	 */
	public ArrayList<String> colors = new ArrayList<String>();
	/**
	 * Crea un Constructor de la clase Fruta.
	 */	
	public Fruit() {
		/**
		 * Establece valores para el peso promedio de la clase fruta.
		 */	
		averageWeight = 60;
			
	}
	/**
	 * Establece el nombre de la fruta.
	 * @param name nombre de la fruta.
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * Obtiene el valor del nombre de la fruta.
	 * @return Retorna el nombre de la fruta.
	 */
	public String getName() {
		return name;
	}
	/**
	 * Establece el peso promedio de la fruta.
	 * @param averageWeight peso promedio de la fruta.
	 */
	public void setAverageWeight(float averageWeight) {
		this.averageWeight = averageWeight;
	}
	/**
	 * Obtiene el valor de el peso promedio de la fruta.
	 * @return Retorna el peso promedio de la fruta.
	 */
	public float getAverageWeight() {
		return averageWeight;
	}
	/**
	 * Establece el color de la fruta.
	 * @param colors establece color a la variable.
	 */
	public void setColors(String color) {
		colors.add(color);
	}
	/** 
	 * Obtiene el color de la fruta en una posicion de la lista.
	 * @param Obtiene el color de la fruta en una posicion de la lista.
	 * @return Retorna el color de la fruta del arreglo.
	 */
	public String getColors(int position) {
		return colors.get(position);
	}
}