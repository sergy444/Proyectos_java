import java.util.ArrayList;
import java.util.Scanner;

public final class Leche extends Producto{

//propiedades
private String tipo;
private Double eurosLitro;
private Distribuidor distribuidor;
private int cod_barras;

public Leche(){}

public Leche(String tipo, Double eurosLitro, Distribuidor distribuidor, int cod_barras){
	super();
	this.tipo=tipo;
	this.eurosLitro=eurosLitro;
	this.distribuidor=distribuidor;
	this.cod_barras=cod_barras;


}
//métodos getter y setter
	public String getTipo() {

		return this.tipo;
	}	

	public void setTipo(String tipo) {

		this.tipo = tipo;
	}
	
	public Double getEurosLitro() {

		return this.eurosLitro;
	}	

	public void setEurosLitro(Double eurosLitro) {

		this.eurosLitro = eurosLitro;
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
	
	public static void lechecita(){
		
		ArrayList<Leche> leches = new ArrayList<Leche>();
		System.out.print("\n¿Cuanta leche quieres registrar?: ");
		int opcion1 = sc.nextInt();
		//Creamos el objeto leche
		for(int e = 0; e < opcion1; e++) {

			Leche leche = new Leche();
			System.out.print("\nTipo de leche: ");
			leche.setTipo(sc.next());
			System.out.print("Procedencia de la leche: ");
			leche.setProcedencia(sc.next());
			System.out.print("Euros por litro: ");
			leche.setEurosLitro(sc.nextDouble());
			System.out.print("Nombre del distribuidor: ");
			Distribuidor distribuidor = new Distribuidor();
			distribuidor.setNombre(sc.next());

			for(int p = 0; p < distribuidores.size(); p++) {

				if((distribuidores.get(p).getNombre()).equalsIgnoreCase(distribuidor.getNombre())) {
				leche.setDistribuidor(distribuidores.get(p));
				}
			}
			System.out.print("introduce el código de barras: ");
			leche.setCod_barras(sc.nextInt());
		leches.add(leche);
		}

			System.out.print("\nLa leche: \n");
			//Se imprime por pantalla
		for(int l = 0; l < leches.size(); l++) {

			System.out.print("Leche num" + (l + 1));
			System.out.print("Tipo de leche: "+ (leches.get(l).getTipo()));
			System.out.print("Procedencia: "+ (leches.get(l).getProcedencia()));
			System.out.print("euros por litro: "+ (leches.get(l).getEurosLitro()));
			System.out.print("código de barras: "+ (leches.get(l).getCod_barras()));
			Distribuidor distribuidor = leches.get(l).getDistribuidor();
			System.out.print("Distribuidor: ");
			System.out.print("\tNombre: "+ distribuidor.getNombre());
			System.out.print("\tCIF: "+ distribuidor.getCIF());
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
