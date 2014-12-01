public class Distribuidor {
//propiedades
private String nombre;
private String CIF;
private Direccion direccion;
private Contacto personaContacto;

public Distribuidor(){}

public Distribuidor(String nombre, String CIF, Direccion direccion, Contacto personaContacto){
	this.nombre=nombre;
	this.CIF=CIF;
	this.direccion=direccion;
	this.personaContacto=personaContacto;


}

//métodos getter y setter
	public String getNombre() {

		return this.nombre;
	}	

	public void setNombre(String nombre) {

		this.nombre = nombre;
	}
	public String getCIF() {

		return this.CIF;
	}	

	public void setCIF(String CIF) {

		this.CIF = CIF;
	}
	
	public Direccion getDireccion() {

		return this.direccion;
	}	

	public void setDireccion(Direccion direccion) {

		this.direccion = direccion;
	}
	public Contacto getPersonaContacto() {

		return this.personaContacto;
	}	

	public void setPersonaContacto(Contacto personaContacto) {

		this.personaContacto = personaContacto;
	}
}
