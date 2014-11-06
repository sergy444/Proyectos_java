public class Inmueble{

	private String calle;
	int precio = 0;
	private char puerta;

	public Inmueble(String calle, int precio, char puerta){
		this.calle=calle;
		this.precio=precio;
		this.puerta=puerta;
		
	}

	public int getPrecio() {

		return precio;
	}	

	public void setPrecio(int precio) {

		precio = precio;
	}

	public String getCalle() {

		return calle;
	}	

	public void setCalle(String calle) {

		calle = calle;
	}

public char getUbicacion() {

		return puerta;
	}	

	public void setUbicacion(char puerta) {

		puerta = puerta;
	}
}
