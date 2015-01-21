package herencia;

public class Bebe extends Humano{

	
	public Bebe(String nombre, int edad, String sexo) {
		super(nombre, edad, sexo);
		
	}
	
	public void llorar(){
		System.out.println("El bebe llamado " + nombre + " llora");
	} 
	@Override
	public void mear(){
		super.mear();
		System.out.println("Mea en el pañal");
	}
}
