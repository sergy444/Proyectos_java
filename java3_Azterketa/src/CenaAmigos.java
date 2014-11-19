import java.util.*;
import java.io.*;

public class CenaAmigos{

	public static void main(String[] args) throws IOException {
	
	int numRecetas;

	int numIngred;


		Scanner sc = new Scanner(System.in);

		System.out.print("\nBuenas querido cliente.\n");

		System.out.print("\nPor favor introduzca el número de recetas que quiera utilizar: ");

		numRecetas = sc.nextInt();

		ArrayList<Receta> recetas = new ArrayList<Receta>();

		for(int s=1; s<=numRecetas; s++){

			String nombreReceta=null;

			String preparacion=null;

			ArrayList<Ingrediente> ingredientes = new ArrayList<Ingrediente>();



			Receta receta1 = new Receta(nombreReceta, preparacion, ingredientes);

			System.out.print("\nIntroduzca el nombre de la receta: ");
			nombreReceta = sc.next();
			receta1.setNombreReceta(nombreReceta);

			System.out.print("\nIntroduzca el numero de ingredientes: ");
			numIngred = sc.nextInt();


			for(int i=1; i<=numIngred; i++){

				String nombreIngrediente= null;

				int cantidadGramos = 0;

				int cantidadUnidad = 0;

				boolean enGramos = false;

				Ingrediente ing = new Ingrediente(nombreIngrediente, cantidadGramos, cantidadUnidad, enGramos);

				System.out.print("\n¿Cuál es el nombre del ingrediente? ");

				nombreIngrediente = sc.next();

				ing.setNombreIngrediente(nombreIngrediente);

				System.out.print("\n¿Se mide en gramos o en unidades? (escriba true para gramos, false para unidades) ");
				enGramos= sc.nextBoolean();

				ing.setEnGramos(enGramos);

				if(enGramos==true){

					System.out.print("\n¿Cuántos gramos necesita? ");

					cantidadGramos=sc.nextInt();

					ing.setCantidadGramos(cantidadGramos);

				}
				else if(enGramos==false){

					System.out.print("\n¿Cuántas unidades necesitas? ");

					cantidadUnidad=sc.nextInt();

					ing.setCantidadUnidad(cantidadUnidad);

				}
			
				ingredientes.add(ing);


			}
				System.out.print("\nCómo se prepara? ");

				preparacion=sc.next();

				receta1.setPreparacion(preparacion);

				recetas.add(receta1);
			}

		





	}

}