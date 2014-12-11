public class Leche {

//propiedades
private String tipo;
private String procedencia;
private Double eurosLitro;
private Distribuidor distribuidor;
private int cod_barras;

public Leche(){}

public Leche(String tipo, String procedencia, Double eurosLitro, Distribuidor distribuidor, int cod_barras){
	this.tipo=tipo;
	this.procedencia=procedencia;
	this.eurosLitro=eurosLitro;
	this.distribuidor=distribuidor;
	this.cod_barras=cod_barras;


}
//métodos getter y setter
	public String getTipo() {

		return this.tipo;
	}	

	public void setTipo(String tipo) {

		this.tipo = tipo;
	}
	public String getProcedencia() {

		return this.procedencia;
	}	

	public void setProcedencia(String procedencia) {

		this.procedencia = procedencia;
	}
	
	public Double getEurosLitro() {

		return this.eurosLitro;
	}	

	public void setEurosLitro(Double eurosLitro) {

		this.eurosLitro = eurosLitro;
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
