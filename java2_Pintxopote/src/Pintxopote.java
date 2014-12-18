import java.util.ArrayList;

public class Pintxopote{

	private ArrayList<Pintxo> pintxo;
	private ArrayList<Pote> pote;
	private double precio;


	public Pintxopote(ArrayList<Pintxo> pintxo, ArrayList<Pote> pote, double precio){
		this.pintxo=pintxo;
		this.pote=pote;
		this.precio=precio;
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

	public double getPrecio(){

		return this.precio;
	}

	public void setPrecio(){

		this.precio = precio;
	}
}