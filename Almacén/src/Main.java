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

		ArrayList<Distribuidor> distribuidores = new ArrayList<Distribuidor>();
		switch(op) {
		
		case 1:

		Distribuidor.readDist();
			
		 break;

		 case 2:

		Lechuga.lechugita();
		
		break;
		case 3:

		Leche.lechecita();
		break;
		case 4:

		Manzana.manzanita();

		break;

		case 5:

		Cliente.readClie();
		 break;
		}
	}
}