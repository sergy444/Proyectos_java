
public class Protected2 {

	
	private int edad = 19;
	private String nombre = "Sergy";
	private String ocupacion = "Estudiante";
	
	public Protected2(){}
	
	
	protected void frase(){
		
		System.out.println("Esa es una frase que se puede heredar.");
	}
	
	private void descripcion(){
		
		System.out.println("Este "+ ocupacion + " de nombre " + nombre + " tiene " + edad + " años.");
	}
	
	public void cosasNazis(){
		
		System.out.println("Estas cosas nazis se pueden usar en cualquier lugar.");
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getOcupacion() {
		return ocupacion;
	}


	public void setOcupacion(String ocupacion) {
		this.ocupacion = ocupacion;
	}
}
