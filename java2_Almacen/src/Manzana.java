public class Manzana {
//propiedades
private String tipoManzana;
private String procedencia;
private String color;
private Double eurosKilo;
private Distribuidor distribuidor;
private int cod_barras;

public Manzana(){}

public Manzana(String tipoManzana, String procedencia, String color, Double eurosKilo, Distribuidor distribuidor, int cod_barras){
	this.tipoManzana=tipoManzana;
	this.procedencia=procedencia;
	this.color=color;
	this.eurosKilo=eurosKilo;
	this.distribuidor=distribuidor;
	this.cod_barras=cod_barras;


}
//métodos getter y setter
	public String getTipoManzana() {

		return this.tipoManzana;
	}	

	public void setTipoManzana(String tipoManzana) {

		this.tipoManzana = tipoManzana;
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
	public Double getEurosKilo() {

		return this.eurosKilo;
	}	

	public void setEurosKilo(Double eurosKilo) {

		this.eurosKilo = eurosKilo;
	}
	public Distribuidor getDistribuidor() {

		return this.distribuidor;
	}	

	public void setDistribuidor(Distribuidor distribuidor) {

		this.distribuidor = distribuidor;
	}

	public int getCod_barras() {

		return this.cod_barras;
	}	

	public void setCod_barras(int cod_barras) {

		this.cod_barras = cod_barras;
	}
}
