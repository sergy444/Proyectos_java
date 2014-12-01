public class Direccion {
	//propiedades
	private String ciudad;
	private String calle;
	private int codigoPostal;
	private int piso;
	private char letra;


	public Direccion(){}

	public Direccion(String ciudad, String calle, int codigoPostal, int piso, char letra){
		this.ciudad=ciudad;
		this.calle=calle;
		this.codigoPostal=codigoPostal;
		this.piso=piso;
		this.letra=letra;
	}

//métodos getter y setter
	public String getCiudad() {

		return this.ciudad;
	}	

	public void setCiudad(String ciudad) {

		this.ciudad = ciudad;
	}
	public String getCalle() {

		return this.calle;
	}	

	public void setCalle(String calle) {

		this.calle = calle;
	}
	public int getCodigoPostal() {

		return this.codigoPostal;
	}	

	public void setCodigoPostal(int codigoPostal) {

		this.codigoPostal = codigoPostal;
	}
	public int getPiso() {

		return this.piso;
	}	

	public void setPiso(int piso) {

		this.piso = piso;
	}
	public char getLetra() {

		return this.letra;
	}	

	public void setLetra(char letra) {

		this.letra = letra;
	}
}

