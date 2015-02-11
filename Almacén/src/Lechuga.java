import java.util.ArrayList;
import java.util.Scanner;

public final class Lechuga extends Producto {
//propiedades
private String tipoLechuga;
private Double eurosUnidad;
private Distribuidor distribuidor;
private int cod_barras;

public Lechuga(){}

public Lechuga(String tipoLechuga, Double eurosUnidad, Distribuidor distribuidor, int cod_barras){
	super();
	this.tipoLechuga=tipoLechuga;
	this.eurosUnidad=eurosUnidad;
	this.distribuidor=distribuidor;
	this.cod_barras=cod_barras;


}
//métodos getter y setter
	public String getTipoLechuga() {

		return this.tipoLechuga;
	}	

	public void setTipoLechuga(String tipoLechuga) {

		this.tipoLechuga = tipoLechuga;
	}
	
	
	public Double getEurosUnidad() {

		return this.eurosUnidad;
	}	

	public void setEurosUnidad(Double eurosUnidad) {

		this.eurosUnidad = eurosUnidad;
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
	
	public static void lechugita(){
		ArrayList<Lechuga> lechugas = new ArrayList<Lechuga>();
		System.out.print("\n¿Cuantas lechugas quieres registrar?: ");
		int opcion = sc.nextInt();
//creamos el objeto lechuga
		for(int a = 0; a < opcion; a++) {

			Lechuga lechuga = new Lechuga();
			System.out.print("\nTipo de lechuga: ");
			lechuga.setTipoLechuga(sc.next());
			System.out.print("Procedencia de la lechuga: ");
			lechuga.setProcedencia(sc.next());
			System.out.print("Color de la lechuga: ");
			lechuga.setColor(sc.next());
			System.out.print("Euros por unidad: ");
			lechuga.setEurosUnidad(sc.nextDouble());
			System.out.print("Nombre del distribuidor: ");
			Distribuidor distribuidor = new Distribuidor();
			distribuidor.setNombre(sc.next());

			for(int d = 0; d < distribuidores.size(); d++) {

				if((distribuidores.get(d).getNombre()).equalsIgnoreCase(distribuidor.getNombre())) {
				lechuga.setDistribuidor(distribuidores.get(d));
				}
			}
			System.out.print("introduce el código de barras: ");
			lechuga.setCod_barras(sc.nextInt());
		lechugas.add(lechuga);
		}
		//Y lo imprimimos por pantalla

		 System.out.print("\nLas lechugas: \n");

		for(int m = 0; m < lechugas.size(); m++) {

			System.out.print("Lechuga num" + (m + 1));
			System.out.print("Tipo de lechuga: "+ (lechugas.get(m).getTipoLechuga()));
			System.out.print("Procedencia: " + (lechugas.get(m).getProcedencia()));
			System.out.print("Color: " + (lechugas.get(m).getColor()));
			System.out.print("euros por unidad: " + (lechugas.get(m).getEurosUnidad()));
			System.out.print("código de barras: " + (lechugas.get(m).getCod_barras()));
			Distribuidor distribuidor = lechugas.get(m).getDistribuidor();
			System.out.print("Distribuidor: ");
			System.out.print("\tNombre: " + distribuidor.getNombre());
			System.out.print("\tCIF: " + distribuidor.getCIF());
			System.out.print("\tContacto: ");
			System.out.print("\t\tNombre: " + (distribuidor.getPersonaContacto()).getNombre());
			System.out.print("\t\tApellido: " + (distribuidor.getPersonaContacto()).getApellidos());
			System.out.print("\t\tE-mail: " + (distribuidor.getPersonaContacto()).getEmail());
			System.out.print("\t\tTelefono: " + (distribuidor.getPersonaContacto()).getNumTelefono());
			System.out.print("\tDirección: ");
			System.out.print("\t\tCiudad: " + (distribuidor.getDireccion()).getCiudad());
			System.out.print("\t\tCalle: " + (distribuidor.getDireccion()).getCalle());
			System.out.print("\t\tPiso: " + (distribuidor.getDireccion()).getPiso());
			System.out.print("\t\tLetra: " + (distribuidor.getDireccion()).getLetra());
			
		}
	}
}
