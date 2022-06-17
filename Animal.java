package Taller;
/**
 * Representa un Animal y varias de sus características, atributos y métodos elementales.
 * 
 * @author Juan Camilo García García.
 *
 */
class Animal {
	/**
	 * Representa el nombre de un Animal.
	 */
	private String name;
	/**
	 * Representa a que genero alimenticio pertenece.
	 */
	private String feed;
	/**
	 * Representa la clasificacion a la que pertenece.
	 */
	protected String classification;
	/**
	 * Representa el numero de patas.
	 */
	private int numFoot;
	/**
	 * Crea una instancia de la clase Animal.
	 */
	public Animal() {
		/**
		 * Establece valores para el numero de patas de la clase Animal
		 */
		numFoot = 4;
		
	}
	/**
	 * Establece el nombre del animal.
	 * @param name nombre del animal.
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * Obtiene el valor del nombre del animal.
	 * @return Retorna el nombre del animal.
	 */
	public String getName() {
		return name;
	}
	/**
	 * Establece el genero alimenticio al que pertenece el animal.
	 * @param feed genero alimenticio del animal.
	 */
	public void setFeed(String feed) {
		this.feed = feed;
	}
	/**
	 * Obtiene el valor del genero alimenticio al que pertenece el animal.
	 * @return feed Retorna el genero alimenticio del animal.
	 */
	public String getFeed() {
		return feed;
	}
	/**
	 * Establece el numero de patas las cuales tiene el animal.
	 * @param numFoot numero de patas.
	 */
	public void setNumFoot(int numFoot) {
		this.numFoot = numFoot;
	}
	/**
	 * Obtiene el numero de patas las cuales tiene el animal.
	 * @return numFoot Retorna el numero de patas las cuales tiene el animal.
	 */
	public int getNumFoot() {
		return numFoot;
	}	
	/**
	 * Establece la clasificación a la que pertenece el animal.
	 * @param classification clasificación del animal.
	 */
	public void setClassification(String classification) {
		this.classification = classification;
	}
	/**
	 * Obtiene la clasificación a la que pertenece el animal.
	 * @return classification Retorna la clasificación del animal.
	 */
	public String getClassification() {
		return classification;
	}
		
}