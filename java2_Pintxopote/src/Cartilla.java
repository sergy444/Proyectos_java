public class Cartilla {

	private boolean [] sellos;

	public Cartilla(boolean [] sellos){
		this.sellos=sellos;
	}

	public boolean [] getSellos(){

		return this.sellos;
	}

	public void setSellos(boolean [] sellos){

		this.sellos = sellos;
	}

	public boolean [] sellar (boolean [] sellos, int idBar){
		
		cartilla.idBar = true;
	}

	public int dto(){

		for (int i = 0; i < cartilla.length; i++){
			int cuenta = 0;
			int descuento;
			if (cartilla(i) = true){
				cuenta++;
			}
		}
		if (cuenta >= 6 && cuenta < 8){

			descuento = 25;

		}
		else if (cuenta >= 8 && cuenta <= 10){

			descuento = 50; 

		}
		else if (cuenta > 10){

			descuento = 100;
		}
	}
}