public final class Contacto extends Persona {
	
	private int numTelefono;
	

	public Contacto(){}

	public Contacto(int numTelefono){
		super();
		this.numTelefono=numTelefono;
		
	}
	//metodos getter y setter
	
	public int getNumTelefono() {

		return this.numTelefono;
	}	

	public void setNumTelefono(int numTelefono) {

		this.numTelefono = numTelefono;
	}
	
}