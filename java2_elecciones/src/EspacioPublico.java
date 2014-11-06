public class EspacioPublico{

	private String direccion;
	private int mcuad;
	private String tipoespacio;

	public EspacioPublico(String direccion, int mcuad, String tipoespacio){
		this.direccion=direccion;
		this.mcuad=mcuad;
		this.tipoespacio=tipoespacio;
		
	}

	public int getMcuad() {

		return mcuad;
	}	

	public void setMcuad(int mcuad) {

		mcuad = mcuad;
	}

	public String getDireccion() {

		return direccion;
	}	

	public void setDireccion(String direccion) {

		direccion = direccion;
	}

public char getTipoespacio() {

		return tipoespacio;
	}	

	public void setUbicacion(char tipoespacio) {

		tipoespacio = tipoespacio;
	}
}
