import java.util.ArrayList;

public final class Manzana extends Producto{
//propiedades
private String tipoManzana;
private Double eurosKilo;
private Distribuidor distribuidor;
private int cod_barras;

public Manzana(){}

public Manzana(String tipoManzana, Double eurosKilo, Distribuidor distribuidor, int cod_barras){
	super();
	this.tipoManzana=tipoManzana;
	this.eurosKilo=eurosKilo;
	this.distribuidor=distribuidor;
	this.cod_barras=cod_barras;


}
//métodos getter y setter
	public String getTipoManzana() {

		return this.tipoManzana;
	}	

	public void setTipoManzana(String tipoManzana) {

		this.tipoManzana = tipoManzana;
	}
	
	public Double getEurosKilo() {

		return this.eurosKilo;
	}	

	public void setEurosKilo(Double eurosKilo) {

		this.eurosKilo = eurosKilo;
	}
	public Distribuidor getDistribuidor() {

		return this.distribuidor;
	}	

	public void setDistribuidor(Distribuidor distribuidor) {

		this.distribuidor = distribuidor;
	}

	public int getCod_barras() {

		return this.cod_barras;
	}	

	public void setCod_barras(int cod_barras) {

		this.cod_barras = cod_barras;
	}
	
	public static void manzanita() {
		
		ArrayList<Manzana> manzanas = new ArrayList<Manzana>();
		System.out.print("\n¿Cuantas manzanas quieres registrar?: ");
		int opcion2 = sc.nextInt();
		//Creamos el objeto de la clase manzana
		for(int e = 0; e < opcion2; e++) {

			Manzana manzana = new Manzana();
			System.out.print("\nTipo de Manzana: ");
			manzana.setTipoManzana(sc.next());
			System.out.print("Procedencia de la manzana: ");
			manzana.setProcedencia(sc.next());
			System.out.print("Color de la manzana");
			manzana.setColor(sc.next());
			System.out.print("Euros por kilo: ");
			manzana.setEurosKilo(sc.nextDouble());
			System.out.print("Nombre del distribuidor: ");
			Distribuidor distribuidor = new Distribuidor();
			distribuidor.setNombre(sc.next());

			for(int w = 0; w < distribuidores.size(); w++) {

				if((distribuidores.get(w).getNombre()).equalsIgnoreCase(distribuidor.getNombre())) {
				manzana.setDistribuidor(distribuidores.get(w));
				}
			}
			System.out.print("introduce el código de barras: ");
			manzana.setCod_barras(sc.nextInt());
		manzanas.add(manzana);
		}


			System.out.print("\nLas manzanas: \n");
				//Se imprime por pantalla
		for(int x = 0; x < manzanas.size(); x++) {

			System.out.print("Manzana num" + (x + 1));
			System.out.print("Tipo de manzana: "+(manzanas.get(x).getTipoManzana()));
			System.out.print("Procedencia: "+(manzanas.get(x).getProcedencia()));
			System.out.print("euros por litro: "+(manzanas.get(x).getEurosKilo()));
			System.out.print("código de barras: "+(leches.get(x).getCod_barras()));
			Distribuidor distribuidor = manzanas.get(x).getDistribuidor();
			System.out.print("Distribuidor: ");
			System.out.print("\tNombre: "+distribuidor.getNombre());
			System.out.print("\tCIF: "+distribuidor.getCIF());
			System.out.print("\tContacto: ");
			System.out.print("\t\tNombre: "+(distribuidor.getPersonaContacto()).getNombre());
			System.out.print("\t\tApellido: "+(distribuidor.getPersonaContacto()).getApellidos());
			System.out.print("\t\tE-mail: "+(distribuidor.getPersonaContacto()).getEmail());
			System.out.print("\t\tTelefono: "+(distribuidor.getPersonaContacto()).getNumTelefono());
			System.out.print("\tDirección: ");
			System.out.print("\t\tCiudad: "+(distribuidor.getDireccion()).getCiudad());
			System.out.print("\t\tCalle: "+(distribuidor.getDireccion()).getCalle());
			System.out.print("\t\tPiso: "+(distribuidor.getDireccion()).getPiso());
			System.out.print("\t\tLetra: "+(distribuidor.getDireccion()).getLetra());	
		}
	}
}
