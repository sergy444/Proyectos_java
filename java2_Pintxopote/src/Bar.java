import java.util.ArrayList;
public class Bar {

	private String nombre;
	private int idBar;
	private String direccion;
	private ArrayList<Pintxo> pintxo;
	private ArrayList<Pote> pote;

	public Bar(String nombre, int idBar, String direccion, ArrayList<Pintxo> pintxo, ArrayList<Pote> pote){
		this.nombre=nombre;
		this.idBar=idBar;
		this.direccion=direccion;
		this.pintxo=pintxo;
		this.pote=pote;
	}

	public String getNombre(){

		return this.nombre;
	}

	public void setNombre(String nombre){

		this.nombre = nombre;
	}

	public int getIdBar(){

		return this.idBar;
	}

	public void setIdBar(int idBar){

		this.idBar = idBar;
	}

	public String getDireccion(){

		return this.direccion;
	}

	public void setDireccion(String direccion){

		this.direccion = direccion;
	}

	public ArrayList<Pintxo> getPintxo(){

		return this.pintxo;
	}

	public void setPintxo(ArrayList<Pintxo> pintxo){

		this.pintxo = pintxo;
	}

	public ArrayList<Pote> getPote(){

		return this.pote;
	}

	public void setPote(ArrayList<Pote> pote){

		this.pote = pote;
	}

}
