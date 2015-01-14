package herencia;

public class Hombre extends Humano{
	
	

	public Hombre(String nombre, int edad, String sexo) {
		super(nombre, edad, sexo);
	}
	 

	public void mear(){
		System.out.println("Mea de pie");
	}
}
