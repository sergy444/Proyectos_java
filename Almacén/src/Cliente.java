import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public final class Cliente extends Persona{
//propiedades

private Direccion direccion;
private Double num_socio;
private Double dto;

//constructores

public Cliente(){}

public Cliente(Direccion direccion, Double num_socio, Double dto){
	super();
	this.direccion=direccion;
	this.num_socio=num_socio;
	this.dto=dto;
}

//getters y setters


	public Direccion getDireccion(){

		return this.direccion;
	}

	public void setDireccion(Direccion direccion){

		this.direccion = direccion;
	}

	public Double getNum_socio(){

		return this.num_socio;
	}

	public void setNum_socio(Double num_socio){

		this.num_socio = num_socio;
	}

	public Double getDto(){

		return this.dto;
	}

	public void setDto(Double dto){

		this.dto = dto;
	}
	
	public static void readClie(){
	
		try {
			//creamos el ArrayList de tipo distribuidor y los contructores necesarios para la lectura del archivo
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		FileInputStream fis1 = new FileInputStream("./clientes.txt");
		InputStreamReader fsr1 = new InputStreamReader(fis1, "UTF8");
		BufferedReader bf1 = new BufferedReader(fsr1);

		String lineas = bf1.readLine();
		String [] sp4zie = null;
		//leemos el archivo clientes.txt
	while(lineas != null) {

		Cliente cliente = new Cliente();
		Direccion direccion = new Direccion();
		sp4zie = lineas.split("#");
		String clientito = sp4zie[0];
		String [] doooitz = clientito.split(",");
		cliente.setNombre(doooitz[0]);
		cliente.setApellidos(doooitz[1]);
		cliente.setDni(doooitz[2]);
		clientito = sp4zie[1];
		doooitz = clientito.split(",");
		direccion.setCiudad(doooitz[0]);
		direccion.setCalle(doooitz[1]);
		int integer = Integer.parseInt(doooitz[2]);
		direccion.getPiso();
		char [] array = (doooitz[3]).charToArray();
		direccion.getLetra();
		cliente.setDireccion(direccion);
		clientito = sp4zie[2];
		doooitz = clientito.split(",");
		double dou = Double.parseDouble(sp4zie[3]);
		cliente.getNum_socio();
		double doub = Double.parseDouble(sp4zie[4]);
		cliente.getDto();
		clientes.add(cliente);
		lineas = bf1.readLine();

		//Los datos del cliente aparecen en la pantalla del terminal
	for(int ioe=0; ioe < clientes.size(); ioe++) {

			Direccion direccion2 = new Direccion();

			System.out.print("\nCliente num: " + (ioe + 1));
			System.out.print("Nombre: " + (clientes.get(ioe).getNombre()));
			System.out.print("Apellidos: " + (clientes.get(ioe).getApellidos()));
			System.out.print("DNI: " + (clientes.get(ioe).getDni()));
			direccion2 = clientes.get(ioe).getDireccion();
			System.out.print("Direccion: ");
			System.out.print("\tCiudad: " + direccion2.getCiudad());
			System.out.print("\tCalle: " + direccion2.getCalle());
			System.out.print("\tPiso: " + direccion2.getPiso());
			System.out.print("\tLetra: " + direccion2.getLetra());
			System.out.print("Número de socio: "+ (clientes.get(ioe).getNum_socio()));
			System.out.print("Descuento: "+ (clientes.get(ioe).getDto()));
			
			
	}
}
} catch(Exception ioa) {

		System.out.print("Error en: " + ioa);
}
	}
	}
}