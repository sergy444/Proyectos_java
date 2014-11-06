public class Habitante{
	int edad = 0;
	private String edad;
	private String nombre;
	int vivo = 0;

	public Habitante(String nombre, int edad, String dni){
		this.nombre=nombre;
		this.edad=edad;
		this.dni=dni;
	}

	public int getEdad() {

		return edad;
	}	

	public void setEdad(int edad) {

		edad = edad;
	}

	public String getNombre() {

		return nombre;
	}	

	public void setNombre(String nombre) {

		nombre = nombre;
	}

public String getDni() {

		return dni;
	}	

	public void setDni(String dni) {

		dni = dni;
	}

ublic int getVivo() {

		return vivo;
	}	

	public void setEdad(int vivo) {

		vivo = vivo;
	}


public boolean estado(){

	if(this.vivo=1){

		return true;

		else{
			
			return false;
		}
	}

public boolean votar(){

if (this.edad>=18) {

	return true;

	else{

		return false;
	}
}

}
}
}