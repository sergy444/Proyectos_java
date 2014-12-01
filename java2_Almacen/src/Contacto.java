public class Contacto {
	//propiedades
	private String nombreContacto;
	private String apellidoContacto;
	private int numTelefono;
	private String email;

	public Contacto(){}

	public Contacto(String nombreContacto, String apellidoContacto, int numTelefono, String email){
		this.nombreContacto=nombreContacto;
		this.apellidoContacto=apellidoContacto;
		this.numTelefono=numTelefono;
		this.email=email;
	}
	//metodos getter y setter
	public String getNombreContacto() {

		return this.nombreContacto;
	}	

	public void setNombreContacto(String nombreContacto) {

		this.nombreContacto = nombreContacto;
	}
	public String getApellidoContacto() {

		return this.apellidoContacto;
	}	

	public void setApellidoContacto(String apellidoContacto) {

		this.apellidoContacto = apellidoContacto;
	}
	public int getNumTelefono() {

		return this.numTelefono;
	}	

	public void setNumTelefono(int numTelefono) {

		this.numTelefono = numTelefono;
	}
	public String getEmail() {

		return this.email;
	}	

	public void setEmail(String email) {

		this.email = email;
	}
}