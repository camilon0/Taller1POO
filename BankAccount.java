package Taller;
/**
 * Representa una Cuenta de banco y varias de sus características, atributos y métodos elementales.
 * @author Juan Camilo Garcia Garcia
 *
 */
class BankAccount {
	/**
	 * Representa el numero de cuenta de la cuenta de banco.
	 */
	private int accountNumber;
	/**
	 * Representa si la cuenta de banco esta activa.
	 */
	private boolean activated = true ;
	/**
	 * Crea una instancia de la clase cuenta de banco.
	 */
	public BankAccount(){
		/**
		 * Establece valores para el numero de la cuenta de banco
		 */
		accountNumber = 123456789;
		
	}
	/**
	 * Establece el numero de la cuenta de banco.
	 * @param accountNumber Numero de la cuenta.
	 */
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	/**
	 * Obtiene el numero de la cuenta de banco
	 * @return Retorna el numero de la cuenta.
	 */
	public int getAccountNumber() {
		return accountNumber;
	}
	/**
	 * Establece si la cuenta esta activa.
	 * @param account estado de la cuenta.
	 */
	public void setAccount(String account) {
		
		if(activated==true) {
			this.activated = true;
		}else {
			this.activated = false;
		}		
		
	}
	/**
	 * Obtiene el estado de la cuenta.
	 * @return Retorna el estado de la cuenta.
	 */
	public String getAccount() {
		if(activated == true) {
			return "Activa";
		
		}else {
			return "Inactiva";
		}
		
	}
	
}
