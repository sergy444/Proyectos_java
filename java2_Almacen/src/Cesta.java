import java.util.ArrayList;
public class Cesta {

//propiedades
	private Cliente cliente;
	private ArrayList<Manzana> manzanas;
	private ArrayList<Lechuga> lechugas;
	private ArrayList<Leche> leches;

	public Cesta(){}

	public Cesta(Cliente cliente, ArrayList<Manzana> manzanas, ArrayList<Lechuga> lechugas, ArrayList<Leche> leches){
		this.cliente=cliente;
		this.manzanas=manzanas;
		this.lechugas=lechugas;
		this.leches=leches;
	}

	//métodos

	public Cliente getCliente(){

		return this.cliente;
	}

	public void setCliente(Cliente cliente){

		this.cliente = cliente;

	}

	public ArrayList<Manzana> getManzanas(){

		return this.manzanas;
	}

	public void setManzanas(ArrayList<Manzana> manzanas){

		this.manzanas = manzanas;
	}

	public ArrayList<Lechuga> getLechugas(){

		return this.lechugas;
	}

	public void setLechugas(ArrayList<Lechuga> lechugas){

		this.lechugas = lechugas;
	}

	public ArrayList<Leche> getLeches(){

		return this.leches;
	}

	public void setLeches(ArrayList<Leche> leches){

		this.leches = leches;
	}

}