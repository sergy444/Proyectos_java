package herencia;

public class Bebe extends Humano{

	
	public Bebe(String nombre, int edad, String sexo) {
		super(nombre, edad, sexo);
		
	}
	
	public void llorar(){
		System.out.println("el bebe llamado " + nombre + " llora");
	} 

}
