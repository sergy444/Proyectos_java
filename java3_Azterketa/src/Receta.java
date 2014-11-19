import java.util.*;
public class Receta {

	private String nombreReceta;
	private String preparacion;
	ArrayList<Ingrediente> ingredientes= null;

	

	public Receta(String nombreReceta, String preparacion, ArrayList<Ingrediente> ingredientes){

		this.nombreReceta=nombreReceta;
		this.preparacion=preparacion;
		this.ingredientes=ingredientes;
	}

public String getNombreReceta() {

		return this.nombreReceta;
	}	

	public void setNombreReceta(String nombreReceta) {

		this.nombreReceta = nombreReceta;
	}

	public String getPreparacion() {

		return this.preparacion;
	}	

	public void setPreparacion(String preparacion) {

		this.preparacion = preparacion;
	}

	public ArrayList<Ingrediente> getIngredientes() {

    	return this.ingredientes;
}

	public void setIngredientes(ArrayList<Ingrediente> ingredientes) {

    	this.ingredientes = ingredientes;

	}
}