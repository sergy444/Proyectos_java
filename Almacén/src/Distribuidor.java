import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Distribuidor extends Persona{
//propiedades

private String CIF;
private Direccion direccion;
private Contacto personaContacto;

public Distribuidor(){}

public Distribuidor(String CIF, Direccion direccion, Contacto personaContacto){
	super();
	this.CIF=CIF;
	this.direccion=direccion;
	this.personaContacto=personaContacto;


}

//métodos getter y setter
	
	public String getCIF() {

		return this.CIF;
	}	

	public void setCIF(String CIF) {

		this.CIF = CIF;
	}
	
	public Direccion getDireccion() {

		return this.direccion;
	}	

	public void setDireccion(Direccion direccion) {

		this.direccion = direccion;
	}
	public Contacto getPersonaContacto() {

		return this.personaContacto;
	}	

	public void setPersonaContacto(Contacto personaContacto) {

		this.personaContacto = personaContacto;
	}
	public static void readDist(){
		
		try {
			//creamos el ArrayList de tipo distribuidor y los contructores necesarios para la lectura del archivo
		
		FileInputStream fis = new FileInputStream("./distribuidor.txt");
		InputStreamReader fsr = new InputStreamReader(fis, "UTF8");
		BufferedReader bf = new BufferedReader(fsr);

		String linea = bf.readLine();
		String [] spazie = null;
		//leemos el archivo en cuestión
	while(linea != null) {

		Distribuidor distribuidor = new Distribuidor();
		Direccion direccion = new Direccion();
		Contacto contacto = new Contacto();
		spazie = linea.split("#");
		String distribuido = spazie[0];
		String [] dooitz = distribuido.split(",");
		distribuidor.setNombre(dooitz[0]);
		distribuidor.setCIF(dooitz[1]);
		distribuido = spazie[1];
		dooitz = distribuido.split(",");
		direccion.setCiudad(dooitz[0]);
		direccion.setCalle(dooitz[1]);
		int integer = Integer.parseInt(dooitz[3]);
		direccion.getPiso();
		char [] array = (dooitz[4]).charToArray();
		direccion.getLetra();
		distribuidor.setDireccion(direccion);
		distribuido = spazie[2];
		dooitz = distribuido.split(",");
		contacto.setNombre(dooitz[0]);
		contacto.setApellidos(dooitz[1]);
		int tfl = Integer.parseInt(dooitz[2]);
		contacto.setNumTelefono(tfl);
		contacto.setEmail(dooitz[3]);
		distribuidor.setPersonaContacto(contacto);
		distribuidores.add(distribuidor);
		linea = bf.readLine();

		//Con este for imprimimos el archivo en la pantalla del terminal
	for(int i=0; i < distribuidores.size(); i++) {

			Direccion direccion1 = new Direccion();

			Contacto contacto1 = new Contacto();

			System.out.print("\nDistribuidor num: " + (i + 1));
			System.out.print("Nombre: " + (distribuidores.get(i).getNombre()));
			System.out.print("Cif: " + (distribuidores.get(i).getCIF()));
			direccion1 = distribuidores.get(i).getDireccion();
			System.out.print("Direccion: ");
			System.out.print("\tCiudad: " + direccion1.getCiudad());
			System.out.print("\tCalle: " + direccion1.getCalle());
			System.out.print("\tPiso: " + direccion1.getPiso());
			System.out.print("\tLetra: " + direccion1.getLetra());
			contacto1 = distribuidores.get(i).getPersonaContacto();
			System.out.print("\tNombre del contacto: " + contacto1.getNombre());
			System.out.print("\tApellido del contacto: " + contacto1.getApellidos());
			System.out.print("\tE-mail: " + contacto1.getEmail());
			System.out.print("\tNúmero Telefónico: " + contacto1.getNumTelefono());
			
	}
	}
	} catch(Exception io) {
		System.out.print("Error en: " + io);
	 }
	}
}
