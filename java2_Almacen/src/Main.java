import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader; 		//importamos las clases de sus respectivos paquetes
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		System.out.print("\nBienvenido al menú de este programa.");
		System.out.print("\nPor favor, elija una opción: \n");
		System.out.print("\t1: Leer el fichero con los distribuidores.");
		System.out.print("\t2: Crear y guardar una lechuga.");
		System.out.print("\t3: Crear y guardar un litro de leche.");
		System.out.print("\t4: Crear y guardar un kilo de manzanas.");
		System.out.print("\t5: Leer el fichero de clientes.");
		System.out.print("\t6: Hacer la cesta de la compra.");
		System.out.print("\t0:Salir del programa.");



		int op = sc.nextInt();


		switch(op) {
		
		case 1:

		try {
				//creamos el ArrayList de tipo distribuidor y los contructores necesarios para la lectura del archivo
			ArrayList<Distribuidor> distribuidores = new ArrayList<Distribuidor>();
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
		 break;

		 case 2:

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
			System.out.print("código de barras: " + (leches.get(m).getCod_barras()));
			Distribuidor distribuidor = lechugas.get(m).getDistribuidor();
			System.out.print("Distribuidor: ");
			System.out.print("\tNombre: " + distribuidor.getNombre());
			System.out.print("\tCIF: " + distribuidor.getCIF());
			System.out.print("\tContacto: ");
			System.out.print("\t\tNombre: " + (distribuidor.getContacto()).getNombreContacto());
			System.out.print("\t\tApellido: " + (distribuidor.getContacto()).getApellidoContacto());
			System.out.print("\t\tE-mail: " + (distribuidor.getContacto()).getEmail());
			System.out.print("\t\tTelefono: " + (distribuidor.getContacto()).getNumTelefono());
			System.out.print("\tDirección: ");
			System.out.print("\t\tCiudad: " + (distribuidor.getDireccion()).getCiudad());
			System.out.print("\t\tCalle: " + (distribuidor.getDireccion()).getCalle());
			System.out.print("\t\tPiso: " + (distribuidor.getDireccion()).getPiso());
			System.out.print("\t\tLetra: " + (distribuidor.getDireccion()).getLetra());
			
		}
		break;
		case 3:

		ArrayList<Leche> leches = new ArrayList<Leche>();
		System.out.print("\n¿Cuanta leche quieres registrar?: ");
		int opcion1 = sc.nextInt();
		//Creamos el objeto leche
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
			System.out.print("introduce el código de barras: ");
			leche.setCod_barras(sc.nextInt());
		leches.add(leche);
		}

			System.out.print("\nLa leche: \n");
			//Se imprime por pantalla
		for(int l = 0; l < leche.size(); l++) {

			System.out.print("Leche num" + (l + 1));
			System.out.print("Tipo de leche: "+ (leches.get(l).getTipoLeche()));
			System.out.print("Procedencia: "+ (leches.get(l).getProcedencia()));
			System.out.print("euros por litro: "+ (leches.get(l).getEurosLitro()));
			System.out.print("código de barras: "+ (leches.get(l).getCod_barras()));
			Distribuidor distribuidor = leches.get(l).getDistribuidor();
			System.out.print("Distribuidor: ");
			System.out.print("\tNombre: "+ distribuidor.getNombre());
			System.out.print("\tCIF: "+ distribuidor.getCIF());
			System.out.print("\tContacto: ");
			System.out.print("\t\tNombre: " + (distribuidor.getContacto()).getNombreContacto());
			System.out.print("\t\tApellido: " + (distribuidor.getContacto()).getApellidoContacto());
			System.out.print("\t\tE-mail: " + (distribuidor.getContacto()).getEmail());
			System.out.print("\t\tTelefono: " + (distribuidor.getContacto()).getNumTelefono());
			System.out.print("\tDirección: ");
			System.out.print("\t\tCiudad: " + (distribuidor.getDireccion()).getCiudad());
			System.out.print("\t\tCalle: " + (distribuidor.getDireccion()).getCalle());
			System.out.print("\t\tPiso: " + (distribuidor.getDireccion()).getPiso());
			System.out.print("\t\tLetra: " + (distribuidor.getDireccion()).getLetra());	
		}
		break;
		case 4:

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
		for(int x = 0; x < leche.size(); x++) {

			System.out.print("Manzana num" + (x + 1));
			System.out.print("Tipo de manzana: "+(manzanas.get(x).getTipoLeche()));
			System.out.print("Procedencia: "+(manzanas.get(x).getProcedencia()));
			System.out.print("euros por litro: "+(manzanas.get(x).getEurosKilo()));
			System.out.print("código de barras: "+(leches.get(x).getCod_barras()));
			Distribuidor distribuidor = manzanas.get(x).getDistribuidor();
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
			System.out.print("\t\tPiso: "+(distribuidor.getDireccion()).getPiso());
			System.out.print("\t\tLetra: "+(distribuidor.getDireccion()).getLetra());	
		}

		break;

		case 5:

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
			direccion.setPiso();
			char [] array = (doooitz[3]).charToArray();
			direccion.setLetra();
			cliente.setDireccion(direccion);
			clientito = sp4zie[2];
			doooitz = clientito.split(",");
			double dou = Double.parseDouble(sp4zie[3]);
			cliente.setNum_Socio();
			double doub = Double.parseDouble(sp4zie[4]);
			cliente.setDto();
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
		 break;
		}
	}
}