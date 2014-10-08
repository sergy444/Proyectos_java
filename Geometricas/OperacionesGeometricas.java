import java.util.Scanner;
import com.zubiri.geometria.*;

public class OperacionesGeometricas {

	public static void main (String args[]) {

	double result;
	double bas;
	double alt;
	double radio;
	final double n = 3.1416;
	final String circulos = "circulos";
	final String rectangulos = "rectangulos";
	String resp;


	
	System.out.print("\n¿Quieres realizar operaciones con circulos o con rectangulos?");

	
	Scanner sc = new Scanner(System.in);
		resp = sc.next();

	
		if (resp.equals("circulos")) {
			
		
			
			Circulo op = new Circulo(4);

			Scanner scanner = new Scanner(System.in);
				System.out.print("\nMete el radio del círculo: ");
				radio = scanner.nextFloat();

			op.setRadio(radio);


			result = op.area(n);
			result = op.circun(n);

			System.out.println("\nEl resultado del Area es: " + result);
			System.out.println("\nEl resultado de la Circunferencia es: " + result);

			
		}
		else {
			System.out.print("\nNo es una respuesta válida");
		}
		
		if (resp.equals("rectangulos")) {

			 Rectangulo rect = new Rectangulo(0, 0);

	 		 Scanner scaner = new Scanner(System.in);
          			System.out.print("\ningresa la base: ");
          			bas = scaner.nextDouble();
          
         		 Scanner scanner = new Scanner(System.in);
          			 System.out.print("\ningresa la altura: ");
         			 alt = scanner.nextDouble();
	  
	 		rect.setBase(bas);
	  		rect.setAltura(alt);

	
	  		result =  rect.perimetro();
	  		System.out.println("El perimetro es: " + result); 
			
	  		result =  rect.area();
	  		System.out.println("El area es: " + result); 
	}
	else {
		System.out.print("\nNo es una respuesta válida");
}	
	}
}
