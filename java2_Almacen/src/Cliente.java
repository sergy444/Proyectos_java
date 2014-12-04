public class Cliente {
//propiedades

private String nombre;
private String apellidos;
private String dni;
private Direccion direccion;
private Double num_socio;
private Double dto;
//constructores
public Cliente(){}

public Cliente(String nombre, String apellidos, String dni,Direccion direccion, Double num_socio, Double dto){
	this.nombre=nombre;
	this.apellidos=apellidos;
	this.dni=dni;
	this.direccion=direccion;
	this.num_socio=num_socio;
	this.dto=dto;
}

//getters y setters

	public String getNombre() {

		return this.nombre;
	}	

	public void setNombre(String nombre) {

		this.nombre = nombre;
	}

	public String getApellidos(){

		return this.apellidos;
	}
	public void setApellidos(String apellidos){

		this.apellidos = apellidos;
	}

	public String getDni(){

		return this.dni;
	}

	public void setDni(String dni){

		this.dni = dni;
	}

	public Direccion getDireccion(){

		return this.direccion;
	}

	public void setDireccion(Direccion direccion){

		this.direccion = direccion;
	}

	public Double getNum_socio(){

		return this.num_socio;
	}

	public void setNum_socio(Double num_socio){

		this.num_socio = num_socio;
	}

	public Double getDto(){

		return this.dto;
	}

	public void setDto(Double dto){

		this.dto = dto;
	}