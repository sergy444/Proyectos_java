public class Ayuntamiento{

	private String ubicacion;
	private int numsalas;
	private String alcalde;
	
	

	public Ayuntamiento(String calle, int numsalas){
		this.calle=calle;
		this.numsalas=numsalas;
		
	}

	public int getNumsalas() {

		return numsalas;
	}	

	public void setNumsalas(int numsalas) {

		numsalas = numsalas;
	}



public String getUbicacion() {

		return ubicacion;
	}	

	public void setUbicacion(String ubicacion) {

		ubicacion = ubicacion;
	}

	public String getAlcalde() {

		return alcalde;
	}	

	public void setAlcalde(String alcalde) {

		alcalde = alcalde;
	}
}
