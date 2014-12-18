public class Pote {

	private int id;
	private int clase;
	private String nombre;

	public Pote (int id, int clase, String nombre){
		this.id=id;
		this.clase=clase;
		this.nombre=nombre;
	}

	public int getId(){

		return this.id;
	}

	public void setId(int id){

		this.id = id;
	}

	public int getClase(){

		return this.clase;
	}

	public void setClase(int clase){

		this.clase = clase;
	}

	public String getNombre(){

		return this.nombre;
	}

	public void setNombre(String nombre){

		this.nombre = nombre;
	}
}
}