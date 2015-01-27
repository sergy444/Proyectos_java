
public abstract class Perro {

	
	private String nombre;
	private int edad;
	private String tamaño;
	
	public Perro(){}
	
	
	public Perro(String nombre, int edad, String tamaño){
		this.nombre=nombre;
		this.edad=edad;
		this.tamaño=tamaño;
	}
	
	public String getNombre(){
		
		return this.nombre;
	}
	
	public void setNombre(String nombre){
		
		this.nombre = nombre;
	}


	public int getEdad() {
		
		return edad;
	}


	public void setEdad(int edad) {
		
		this.edad = edad;
	}


	public String getTamaño() {
		
		return tamaño;
	}


	public void setTamaño(String tamaño) {
		
		this.tamaño = tamaño;
	}
	
	abstract void ladrar();
	
	public void caminar(){
		
		System.out.println("Este perro camina");
	}
	
	public void imprimirPerro(){
		
		System.out.println("Este es un perro");
	}
	
}
