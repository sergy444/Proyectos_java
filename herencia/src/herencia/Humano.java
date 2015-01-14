package herencia;

public class Humano {

	private String nombre;
	private int edad;
	
	public void imprimirHumano(){
		
		System.out.println(nombre + "tiene " + edad + "años");
	}
	
	public Humano(String nombre, int edad){
		this.nombre=nombre;
		this.edad=edad;
	}
}
