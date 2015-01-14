package herencia;

public class Main {

	public static void main(String[] args) {
		
		//Creamos y mostramos un hombre
		Hombre hombre = new Hombre(null, 0, null);
		hombre.setNombre("Pepe");
		hombre.setEdad(20);
		hombre.setSexo("Hombre");
	
		hombre.imprimirHumano();
		hombre.mear();
		//Creamos y mostramos una mujer
		Mujer mujer = new Mujer(null, 0, null);
		mujer.setNombre("Maria");
		mujer.setEdad(16);
		mujer.setSexo("Mujer");
		
		mujer.imprimirHumano();
		mujer.parir();
		
		//Creamos y mostramos un bebé
		Bebe bebe = new Bebe(null, 0, null);
		bebe.setNombre("Fulanito");
		bebe.setEdad(1);
		bebe.setSexo("Hombre");
		
		bebe.imprimirHumano();
		bebe.llorar();
		
	}

}
