public class Lechuga {
//propiedades
private String tipoLechuga;
private String procedencia;
private String color;
private Double eurosUnidad;
private Distribuidor distribuidor;

public Lechuga(){}

public Lechuga(String tipoLechuga, String procedencia, String color, Double eurosUnidad, Distribuidor distribuidor){
	this.tipoLechuga=tipoLechuga;
	this.procedencia=procedencia;
	this.color=color;
	this.eurosUnidad=eurosUnidad;
	this.distribuidor=distribuidor;


}
//métodos getter y setter
	public String getTipoLechuga() {

		return this.tipoLechuga;
	}	

	public void setTipoLechuga(String tipoLechuga) {

		this.tipoLechuga = tipoLechuga;
	}
	public String getProcedencia() {

		return this.procedencia;
	}	

	public void setProcedencia(String procedencia) {

		this.procedencia = procedencia;
	}
	public String getColor() {

		return this.color;
	}	

	public void setColor(String color) {

		this.color = color;
	}
	public Double getEurosUnidad() {

		return this.eurosUnidad;
	}	

	public void setEurosUnidad(Double eurosUnidad) {

		this.eurosUnidad = eurosUnidad;
	}
	public Distribuidor getDistribuidor() {

		return this.distribuidor;
	}	

	public void setDistribuidor(Distribuidor distribuidor) {

		this.distribuidor = distribuidor;
	}
}
