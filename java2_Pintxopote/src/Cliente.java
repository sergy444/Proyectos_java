public class Cliente{

	private String nombre;
	private int id;
	private Cartilla cartilla; 

	public Cliente(String nombre, int id, Cartilla cartilla){
		this.nombre=nombre;
		this.id=id;
		this.cartilla=cartilla;
	}

	public String getNombre(){

		return this.nombre;
	}

	public void setNombre(String nombre){

		this.nombre = nombre;
	}

	public int getId(){

		return this.id;
	}

	public void setId(int id){

		this-id = id;
	}

	public Cartilla getCartilla(){

		return this.id;
	}

	public void setCartilla(Cartilla cartilla){

		this.cartilla = cartilla;
	}
}
