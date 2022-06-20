package Taller;

import java.util.*;

/**
 * Representa una persona y varias de sus características, atributos y métodos elementales.
 * 
 * @author Juan Camilo García García.
 *
 */
class Person {
	/**
	 * Representa el nombre de la persona.
	 */
	private String name;
	/**
	 * Representa el numero de identificacion la persona.
	 */
	private int ID;
	/**
	 * Representa el primer apellido de la persona.
	 */
	private String lastName1;
	/**
	 * Representa el segundo apellido de la persona.
	 */
	private String lastName2;
	/**
	 * Representa la altura de la persona.
	 */
	private float height;
	/**
	 * Representa el peso de la persona.
	 */
	private float weight;
	/**
	 * Representa el tipo de sangre de la persona.
	 */
	protected String BloodType;
	/**
	 * Representa la fecha de nacimiento de la persona.
	 */
	private Date dateBirth;
	/**
	 * Representa el RH de la persona.
	 */
	protected String RH;
	/**
	 * Crea una instancia de la clase persona, con los parametros enteros de la fecha de cumpleanhos.
	 */
	
	
	public Person(int agno, int mes, int dia) {
		/**
		 * Establece valores para el numero de identificacion de la persona.
		 */
		ID = 123456789;
		/**
		 * Establece valores para la altura de la persona.
		 */
		height = 180;
		/**
		 * Establece valores para el peso de la persona.
		 */
		weight = 75;
		
		GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);
		dateBirth = calendario.getTime();
		
	}
	/**
	 * Establece el nombre de la persona
	 * @param name Nombre de la persona
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * Obtiene el nombre de la persona.
	 * @return name Retorna el nombre de la persona.
	 */
	public String getName() {
		return name;
	}
	/**
	 * Establece el primer apellido de la persona
	 * @param lastName1 primer apellido de la persona
	 */
	public void setLastName1(String lastName1) {
		this.lastName1 = lastName1;
	}
	/**
	 * Obtiene el primer apellido de la persona.
	 * @return lastName1 Retorna el primer apellido de la persona.
	 */
	public String getLastName1() {
		return lastName1;
	}
	/**
	 * Establece el segundo apellido de la persona
	 * @param lastName2 segundo apellido de la persona
	 */
	public void setLastName2(String lastName2) {
		this.lastName2 = lastName2;
	}
	/**
	 * Obtiene el segundo apellido de la persona.
	 * @return lastName2 Retorna el segundo apellido de la persona.
	 */
	public String getLastName2() {
		return lastName2;
	}
	/**
	 * Establece el tipo de sangre de la persona
	 * @param bloodType Tipo de sangre
	 */
	public void setBloodType(String bloodType) {
		BloodType = bloodType;
	}
	/**
	 * Obtiene el tipo de sangre de la persona.
	 * @return BloodType Retorna el tipo de sangre de la persona.
	 */
	public String getBloodType() {
		return BloodType;
	}
	/**
	 * Establece el RH de la persona
	 * @param rH RH de la persona
	 */
	public void setRH(String rH) {
		RH = rH;
	}
	/**
	 * Obtiene el RH de la persona.
	 * @return RH Retorna el RH de la persona.
	 */
	public String getRH() {
		return RH;
	}
	/**
	 * Establece el dia de cumpleaños de la persona
	 * @param dateBirth 
	 * @param dateBirth Cumpleaños de la persona
	 */
	public void setDateBirth(Date dateBirth) {
		this.dateBirth = dateBirth;
	}
	/**
	 * Obtiene el dia de cumpleaños de la persona.
	 * @return Retorna el cumpleaños de la persona.
	 */
	public Date getDateBirth() {
		return dateBirth;
	}
	/**
	 * Obtiene la cedula, la altura y el peso de la persona.
	 * @return Retorna la cedula, la altura y el peso de la persona .
	 */
	public String getData() {		
		return "La cedula de la persona es: " + ID + "\nLa altura es: " + height 
				+ "\nEl peso es " + weight;
		
	}
	
	
	
}