
public class Producto {
	
	protected String procedencia;
	protected String color;
	
	public Producto(){}
	
	public Producto(String procedencia, String color){
		this.procedencia=procedencia;
		this.color=color;
	}
	
	public String getProcedencia() {
		
		return procedencia;
	}
	public void setProcedencia(String procedencia) {
		
		this.procedencia = procedencia;
	}
	public String getColor() {
		
		return color;
	}
	public void setColor(String color) {
		
		this.color = color;
	}
	

}
