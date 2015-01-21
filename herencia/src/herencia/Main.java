package herencia;

public class Main {

	public static void main(String[] args) {
		
		//Creamos y mostramos un hombre
		Hombre hombre = new Hombre("Pepe", 20, "Hombre");
		hombre.setNombre("Pepe");
		hombre.setEdad(20);
		hombre.setSexo("Hombre");
	
		hombre.imprimirHumano();
		hombre.mear();
		//Creamos y mostramos una mujer
		Mujer mujer = new Mujer("Maria", 16, "Mujer");
		
		mujer.imprimirHumano();
		mujer.parir();
		
		//Creamos y mostramos un bebé
		Bebe bebe = new Bebe("Fulanito", 1, "Hombre");
		
		bebe.imprimirHumano();
		bebe.llorar();
		
	}

}
