
public class Persona {

	String nombre;
	String apellidos;
	String dni;
	String email;
	
	public Persona(){}
	
	
	public Persona(String nombre, String apellidos, String dni, String email){
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.dni=dni;
		this.email=email;
	}
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
