package herencia;

public class Humano {

	protected String nombre;
	protected int edad;
	protected String sexo;
	

	public Humano(String nombre, int edad, String sexo){
		this.nombre=nombre;
		this.edad=edad;
		this.sexo=sexo;
	}
	
	public String getNombre(){
		
		return this.nombre;
	}
	public void setNombre(String nombre){
		
		this.nombre = nombre;
	}
	
	public int getEdad(){
		
		return this.edad;
	}

	public void setEdad(int edad) {
		
		this.edad = edad;
	}
	
	public String getSexo() {
		
		return this.sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public void imprimirHumano() {
			
		System.out.println(nombre + " tiene " + edad + " años y es " + sexo);
	}

}
