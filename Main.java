package Taller;
/**
 * Representa una clase main que sirve en la creacion de objetos de las clases del paquete Taller y ejecutar funciones.
 * 
 * @author Juan Camilo García García.
 *
 */
public class Main {

	public static void main(String[] args) {		
		/**
         * Creación de un objeto de la clase carro.
         */
		Car ferrari = new Car();
		/**
         * Establece el modelo del carro.
         */
		ferrari.setModel();
		
		System.out.println("--CLASE CARRO--");
		/**
         * Imprime todos los datos con sus valores de la clase carro exceptuando el modelo.
         */
		System.out.println(ferrari.getData());
		/**
         * Imprime el modelo del carro.
         */
		System.out.println(ferrari.getModel());
		/**
         * Creación de un objeto de la clase Animal.
         */
		Animal perro = new Animal();
		/**
         * Establece el nombre del animal.
         */
		perro.setName("Perro");
		/**
         * Establece el genero alimenticio del animal.
         */
		perro.setFeed("Carnivoro");		
		/**
         * Obtiene el numero de patas del animal.
         */
		perro.getNumFoot();
		/**
         * Establece la clasificación del animal.
         */
		perro.setClassification("Vertebrado");
		
		System.out.println("--CLASE ANIMAL--");
		/**
         * Imprime el nombre del animal.
         */
		System.out.println("El animal es: " + perro.getName() );
		/**
         * Imprime el tipo de alimentación del animal.
         */
		System.out.println("El tipo de alimentacion del animal es: " + perro.getFeed());
		/**
         * Imprime la clasificación del animal.
         */
		System.out.println("La clasificacion es: " + perro.classification);
		/**
         * Imprime el numero de patas del animal.
         */
		System.out.println("El numero de patas que tiene el animal es: " + perro.getNumFoot());
		/**
         * Creación de un objeto de la clase celular.
         */
		Cellphone iphone13= new Cellphone();
		/**
         * Establece el nombre del celular.
         */
		iphone13.setName("iPhone 13");
		/**
         * Establece la marca del celular.
         */
		iphone13.setBrand("Apple");
		System.out.println("--CLASE CELULAR--");
		/**
         * Imprime el nombre del celular.
         */
		System.out.println("El celular es un: " + iphone13.getName() );
		/**
         * Imprime la marca del celular.
         */
		System.out.println("La marca del celular es: " + iphone13.getBrand());
		/**
         * Imprime las especificaciones del celular.
         */
		System.out.println("Las especificaciones del celular son: " + "\n" +iphone13.getDataCell() );
		/**
         * Creación de un objeto de la clase fruta.
         */
		Fruit banano=new Fruit();
		/**
         * Establece el nombre de la fruta.
         */
		banano.setName("Banano");
		/**
         * Establece el peso promedio de la fruta.
         */
		banano.setAverageWeight(100);
		/**
         * Establece el color de la fruta.
         */
		banano.setColors("Amarillo");
				
		System.out.println("--CLASE FRUTA--");
		/**
         * Imprime el nombre de la fruta.
         */
		System.out.println("La fruta es: " + banano.getName() );
		/**
         * Imprime el peso promedio de la fruta.
         */
		System.out.println("El peso promedio es de "+ banano.getAverageWeight()+ "g");
		/**
         * Imprime el color de la fruta en la primera posicion de la lista.
         */
		System.out.println("El color de esa fruta es: " + banano.getColors(0));
		/**
         * Creación de un objeto de la clase cuenta de banco.
         */		
		BankAccount id=new BankAccount();
		
		System.out.println("--CLASE CUENTA BANCARIA--");
		/**
         * Imprime numero de la cuenta de banco.
         */
		System.out.println("La cuenta es: " + id.getAccountNumber());
		/**
         * Imprime el estado de la cuenta.
         */
		System.out.println("La cuenta se encuentra: " +id.getAccount());
		
		/**
         * Creación de un objeto de la clase persona.
         */
		Person camilo=new Person();
		/**
         * Establece el nombre de la persona.
         */
		camilo.setName("Camilo");
		/**
         * Establece el primer apellido de la persona.
         */
		camilo.setLastName1("Garcia");
		/**
         * Establece el segundo apellido de la persona.
         */
		camilo.setLastName2("Garcia");
		/**
         * Establece el tipo de sangre de la persona.
         */
		camilo.setBloodType("O");
		/**
         * Establece el RH de la persona.
         */
		camilo.setRH("+");
		/**
         * Establece la fecha de cumpleaños de la persona.
         */
		camilo.setDateBirth();
		
		System.out.println("--CLASE PERSONA--");
		/**
         * Imprime la cedula, el peso y la altura de la persona.
         */
		System.out.println(camilo.getData());
		/**
         * Imprime el nombre, los dos apellidos, el tipo de sangre y su RH de la persona.
         */
		System.out.println(camilo.getDateBirth());
		System.out.println("El nombre completo es " + camilo.getName() +" " +camilo.getLastName1() +" "+ camilo.getLastName2() + " "
				+ "con un tipo de sangre "+ camilo.getBloodType() + camilo.getRH());
	}
	

}
