import java.util.ArrayList;
public class Pintxo {

	private int id;
	private int clase; //1:Basico 2:Selecto
	private ArrayList<Ingrediente> ingrediente;
	private String nombre;


	public Pintxo (int id, double precio, int clase, double dto, ArrayList<Ingrediente> ingrediente){
		this.id=id;
		this.clase=clase;
		this.ingrediente=ingrediente;
		this.nombre;
	}

	public int getNombre(){

		return this.id;
	}

	public void setNombre(int id){

		this.id = id;
	}

	public int getClase(){

		return this.clase;
	}

	public void setClase(int clase){

		this.clase = clase;
	}

	public ArrayList<Ingrediente> getIngrediente(){

		return this.ingrediente;
	}

	public void setIngrediente(ArrayList<Ingrediente> ingrediente){

		this.ingrediente = ingrediente;
	}

	public String getNombre(){

		return this.nombre;
	}

	public void setNombre(String nombre){

		this.nombre = nombre;
	}
}