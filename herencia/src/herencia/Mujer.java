package herencia;

public class Mujer extends Humano{

	

	
	public Mujer(String nombre, int edad, String sexo){
		super(nombre, edad, sexo);
	}
	
	public void parir(){
		System.out.println("Esta mujer llamada " + nombre + " esta pariendo un bebe"); ;
		
	}
}
