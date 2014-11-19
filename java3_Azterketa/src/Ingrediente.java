public class Ingrediente {

	private String nombreIngrediente;
	private int cantidadGramos;
	private int cantidadUnidad;
	private boolean enGramos;


	public Ingrediente(String nombreIngrediente, int cantidadGramos, int cantidadUnidad, boolean enGramos){
		this.nombreIngrediente=nombreIngrediente;
		this.cantidadGramos=cantidadGramos;
		this.cantidadUnidad=cantidadUnidad;
		this.enGramos=enGramos;
		
	}

	public String getNombreIngrediente() {

		return this.nombreIngrediente;
	}	

	public void setNombreIngrediente(String nombreIngrediente) {

		this.nombreIngrediente = nombreIngrediente;
	}

	public int getCantidadGramos() {

		return this.cantidadGramos;
	}	

	public void setCantidadGramos(int cantidadGramos) {

		this.cantidadGramos = cantidadGramos;
	}

	public int getCantidadUnidad() {

		return this.cantidadUnidad;
	}	

	public void setCantidadUnidad(int cantidadUnidad) {

		this.cantidadUnidad = cantidadUnidad;
	}


	public boolean getEnGramos() {

		return this.enGramos;
	}	

	public void setEnGramos(boolean enGramos) {

		this.enGramos = enGramos;
	}
}