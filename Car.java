package Taller;
/**
 * Representa un carro y varias de sus características, atributos y métodos elementales.
 * 
 * @author Juan Camilo García García.
 *
 */
public class Car {
	/**
	 * Representa el peso del carro.
	 */
	private double weight;
	/**
	 * Representa la altura del carro.
	 */
	private double height;
	/**
	 * Representa el ancho del carro.
	 */
	private double width;
	/**
	 * Representa el largo del carro.
	 */
	private double length;
	/**
	 * Representa el numero de puertas del carro.
	 */
	protected int numDoors;
	/**
	 * Representa la marca del carro.
	 */
	public String model;	
	/**
	 * Crea una instancia de la clase Car.
	 */
	public Car(){
		/**
		 * Establece valores para el peso de la clase car
		 */
		weight = 500;
		/**
		 * Establece valores para la altura de la clase car
		 */
		height = 1.90;
		/**
		 * Establece valores para el ancho de la clase car
		 */
		width = 4;
		/**
		 * Establece valores para el peso de la clase car
		 */
		length = 10;
		/**
		 * Establece valores para el peso de la clase car
		 */
		numDoors = 2;
	}
	/**
	 * Obtiene los valores para peso, altura, ancho, largo y numero de puertas del carro.
	 * @return Retorna los valores para peso, altura, ancho, largo y numero de puertas del carro.
	 */
	public String getData() {
		
		return "El peso del carro es: " + weight + " kg \nLa altura es de: " + height +
				" m \nEl ancho es de " + width + " m \nEl largo es de " + length + " m\n Numero de puertas: " 
				+ numDoors ;		
	}
	/**
	 * Establece la marca del carro
	 * @param model Modelo del carro
	 */
	public void setModel() {		
		this.model = "Ferrari";		
	}
	/**
	 * Obtiene el valor del modelo del carro
	 * @return Retorna la marca o el modelo del carro.
	 */
	public String getModel() {		
		return "La marca del carro es " + model;
	}
	
}
	








