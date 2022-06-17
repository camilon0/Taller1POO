package Taller;
/**
 * Representa un celular y varias de sus características, atributos y métodos elementales.
 * 
 * @author Juan Camilo García García.
 *
 */
class Cellphone {
	/**
	 * Representa el nombre del celular.
	 */
	private String name;
	/**
	 * Representa la marca del celular.
	 */
	private String brand;
	/**
	 * Representa la capacidad de almacenamiento del celular.
	 */
	private int storage;
	/**
	 * Representa la memoria RAM del celular.
	 */
	private int ram;
	/**
	 * Representa la calidad de la camara del celular.
	 */
	private double megapixels;
	/**
	 * Representa el ancho del celular.
	 */
	protected double width;
	/**
	 * Representa el largo del celular.
	 */
	protected double length;
	/**
	 * Crea una instancia de la clase celular.
	 */
	public Cellphone() {
		/**
		 * Establece valores para el almacenamiento del la clase celular
		 */
		storage = 128;
		/**
		 * Establece valores para la ram del la clase celular
		 */
		ram = 16;
		/**
		 * Establece los valores en megapixeles de la camara del celular
		 */
		megapixels = 32;
		/**
		 * Establece valores para el ancho del celular.
		 */
		width = 10;
		/**
		 * Establece valores para el largo del celular.
		 */
		length = 25;		
				
	}
	/**
	 * Establece la marca del celular
	 * @param brand Marca del celular
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}
	/**
	 * Obtiene la marca del celular
	 * @return Retorna la marca del celular
	 */
	public String getBrand() {
		return brand;
	}
	/**
	 * Establece el nombre del celular.
	 * @param name Nombre del celular.
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * Obtiene el nombre del celular.
	 * @return Retorna el nombre del celular
	 */
	public String getName() {
		return name;
	}
	/**
	 * Obtiene los valores del almacenamiento, la ram, la calidad de la camara, el largo y el ancho del celular.  
	 * @return Retorna los valores del almacenamiento, la ram, la calidad de la camara, el largo y el ancho del celular.
	 */
	public String getDataCell() {
		
		return "El almacenamiento es de: " + storage + " Gb \nLa RAM es de: " + ram +
				" Gb \nLa calidad de la camara es de: " + megapixels + " Megapixeles" + "  \n"
						+ "El largo es de: " + length + "cm\nEl ancho es de: " + width + "cm";
	}
	
	
}
