public class Partido{

	private String lider;
	private int numafiliados;
	private String posicionideologica;
	
	

	public Partido(String lider, int numafiliados, String posicionideologica){
		this.lider=lider;
		this.numafiliados=numafiliados;
		this.posicionideologica=posicionideologica;
		
	}

	public int getNumsalas() {

		return numafiliados;
	}	

	public void setNumsalas(int numafiliados) {

		numafiliados = numafiliados;
	}



public String getLider() {

		return lider;
	}	

	public void setLider(String lider) {

		lider = lider;
	}

	public String getPosicionideologica() {

		return lider;
	}	

	public void setPosicionideologica(String posicionideologica) {

		posicionideologica = posicionideologica;
	}
}
