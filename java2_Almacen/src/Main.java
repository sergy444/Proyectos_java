import java.io.File;
import java.io.FileImputStream;
import java.io.ImputStreamReader;
import java.io.BufferedReader; 		//importamos las clases de sus respectivos paquetes
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		try {
				//creamos el ArrayList de tipo distribuidor y los contructores necesarios para la lectura del archivo
			ArrayList<Distribuidor> distribuidores = new ArrayList<Distribuidor>();
			FileImputStream fis = new FileImputStream("./distribuidor.txt");
			ImputStreamReader fsr = new ImputStreamReader(fis, "UTF8");
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
			direccion.setPiso();
			char [] array = (dooitz[4]).charToArray();
			direccion.setLetra();
			distribuidor.setDireccion(direccion);

			distribuido = spazie[2];
			dooitz = distribuido.split(",");
			contacto.setNombreContacto(dooitz[0]);
			contacto.setApellidoContacto(dooitz[1]);
			int tfl = Integer.parseInt(dooitz[2]);
			contacto.setNumTelefono(tfl);
			contacto.setEmail(dooitz[3]);
			distribuidor.setContacto(contacto);
			distribuidores.add(distribuidor);
			linea = bf.readLine();

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
				System.out.print("\tNúmero: " + direccion1.getNumero());
				System.out.print("\tPiso: " + direccion1.getPiso());
				System.out.print("\tLetra: " + direccion1.getLetra());
				contacto1 = distribuidores.get(i).getContacto();
				System.out.print("\tNombre del contacto: " + contacto1.getNombreContacto());
				System.out.print("\tApellido del contacto: " + contacto1.getApellidoContacto());
				System.out.print("\tE-mail: " + contacto1.getEmail());
				System.out.print("\tNúmero Telefónico: " + contacto1.getNumTelefono());
				
		}
		}
		} catch(Exception io) {
			System.out.print("Error en: " + io);
		 }


		ArrayList<Lechuga> lechugas = new ArrayList<Lechuga>();
		Scanner sc = new Scanner(System.in);
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
		lechugas.add(lechuga);
		}

		 System.out.print("\nLas lechugas: \n");

		for(int m = 0; m < lechugas.size(); m++) {

			System.out.print("Lechuga num" + (m + 1));
			System.out.print("Tipo de lechuga: "+(lechugas.get(m).getTipoLechuga()));
			System.out.print("Procedencia: "+(lechugas.get(m).getProcedencia()));
			System.out.print("Color: "+(lechugas.get(m).getColor()));
			System.out.print("euros por unidad: "+(lechugas.get(m).getEurosUnidad()));
			Distribuidor distribuidor = lechugas.get(m).getDistribuidor();
			System.out.print("Distribuidor: ");
			System.out.print("\tNombre: "+distribuidor.getNombre());
			System.out.print("\tCIF: "+distribuidor.getCIF());
			System.out.print("\tContacto: ");
			System.out.print("\t\tNombre: "+(distribuidor.getContacto()).getNombreContacto());
			System.out.print("\t\tApellido: "+(distribuidor.getContacto()).getApellidoContacto());
			System.out.print("\t\tE-mail: "+(distribuidor.getContacto()).getEmail());
			System.out.print("\t\tTelefono: "+(distribuidor.getContacto()).getNumTelefono());
			System.out.print("\tDirección: ");
			System.out.print("\t\tCiudad: "+(distribuidor.getDireccion()).getCiudad());
			System.out.print("\t\tCalle: "+(distribuidor.getDireccion()).getCalle());
			System.out.print("\t\tNumero: "+(distribuidor.getDireccion()).getNumero());
			System.out.print("\t\tPiso: "+(distribuidor.getDireccion()).getPiso());
			System.out.print("\t\tLetra: "+(distribuidor.getDireccion()).getLetra());
			
		}

		ArrayList<Leche> leches = new ArrayList<Leche>();
		Scanner sc = new Scanner(System.in);
		System.out.print("\n¿Cuanta leche quieres registrar?: ");
		int opcion1 = sc.nextInt();

		for(int e = 0; e < opcion1; e++) {
			Leche leche = new Leche();
			System.out.print("\nTipo de leche: ");
			leche.setTipoLeche(sc.next());
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
		leches.add(leche);
		}

			System.out.print("\nLa leche: \n");

		for(int l = 0; l < leche.size(); l++) {

			System.out.print("Leche num" + (l + 1));
			System.out.print("Tipo de leche: "+(leches.get(l).getTipoLeche()));
			System.out.print("Procedencia: "+(leches.get(l).getProcedencia()));
			System.out.print("euros por litro: "+(leches.get(l).getEurosLitro()));
			Distribuidor distribuidor = leches.get(l).getDistribuidor();
			System.out.print("Distribuidor: ");
			System.out.print("\tNombre: "+distribuidor.getNombre());
			System.out.print("\tCIF: "+distribuidor.getCIF());
			System.out.print("\tContacto: ");
			System.out.print("\t\tNombre: "+(distribuidor.getContacto()).getNombreContacto());
			System.out.print("\t\tApellido: "+(distribuidor.getContacto()).getApellidoContacto());
			System.out.print("\t\tE-mail: "+(distribuidor.getContacto()).getEmail());
			System.out.print("\t\tTelefono: "+(distribuidor.getContacto()).getNumTelefono());
			System.out.print("\tDirección: ");
			System.out.print("\t\tCiudad: "+(distribuidor.getDireccion()).getCiudad());
			System.out.print("\t\tCalle: "+(distribuidor.getDireccion()).getCalle());
			System.out.print("\t\tNumero: "+(distribuidor.getDireccion()).getNumero());
			System.out.print("\t\tPiso: "+(distribuidor.getDireccion()).getPiso());
			System.out.print("\t\tLetra: "+(distribuidor.getDireccion()).getLetra());	
		}


		ArrayList<Manzana> manzanas = new ArrayList<Manzana>();
		Scanner sc = new Scanner(System.in);
		System.out.print("\n¿Cuantas manzanas quieres registrar?: ");
		int opcion2 = sc.nextInt();

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
		manzanas.add(manzana);
		}


			System.out.print("\nLas manzanas: \n");

		for(int l = 0; l < leche.size(); l++) {

			System.out.print("Manzana num" + (l + 1));
			System.out.print("Tipo de manzana: "+(manzanas.get(l).getTipoLeche()));
			System.out.print("Procedencia: "+(manzanas.get(l).getProcedencia()));
			System.out.print("euros por litro: "+(manzanas.get(l).getEurosLitro()));
			Distribuidor distribuidor = manzanas.get(l).getDistribuidor();
			System.out.print("Distribuidor: ");
			System.out.print("\tNombre: "+distribuidor.getNombre());
			System.out.print("\tCIF: "+distribuidor.getCIF());
			System.out.print("\tContacto: ");
			System.out.print("\t\tNombre: "+(distribuidor.getContacto()).getNombreContacto());
			System.out.print("\t\tApellido: "+(distribuidor.getContacto()).getApellidoContacto());
			System.out.print("\t\tE-mail: "+(distribuidor.getContacto()).getEmail());
			System.out.print("\t\tTelefono: "+(distribuidor.getContacto()).getNumTelefono());
			System.out.print("\tDirección: ");
			System.out.print("\t\tCiudad: "+(distribuidor.getDireccion()).getCiudad());
			System.out.print("\t\tCalle: "+(distribuidor.getDireccion()).getCalle());
			System.out.print("\t\tNumero: "+(distribuidor.getDireccion()).getNumero());
			System.out.print("\t\tPiso: "+(distribuidor.getDireccion()).getPiso());
			System.out.print("\t\tLetra: "+(distribuidor.getDireccion()).getLetra());	
		}



		try {
				//creamos el ArrayList de tipo distribuidor y los contructores necesarios para la lectura del archivo
			ArrayList<Cliente> clientes = new ArrayList<Cliente>();
			FileImputStream fis1 = new FileImputStream("./cliente.txt");
			ImputStreamReader fsr1 = new ImputStreamReader(fis1, "UTF8");
			BufferedReader bf1 = new BufferedReader(fsr1);

			String lineas = bf1.readLine();
			String [] sp4zie = null;
			//
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
			int integer = Integer.parseInt(doooitz[3]);
			direccion.setPiso();
			char [] array = (doooitz[4]).charToArray();
			direccion.setLetra();
			cliente.setDireccion(direccion);

			clientito = sp4zie[3];
			doooitz = clientito.split(",");
			double dou = Double.parseDouble(sp4zie[4]);
			cliente.setNum_Socio();
			double doub = Double.parseDouble(sp4zie[5]);
			cliente.setDto();
			clientes.add(cliente);
			lineas = bf1.readLine();


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
				System.out.print("\tNúmero: " + direccion2.getNumero());
				System.out.print("\tPiso: " + direccion2.getPiso());
				System.out.print("\tLetra: " + direccion2.getLetra());
				
				
		}
		}
		} catch(Exception ioa) {
			System.out.print("Error en: " + ioa);
		 }
	}
}