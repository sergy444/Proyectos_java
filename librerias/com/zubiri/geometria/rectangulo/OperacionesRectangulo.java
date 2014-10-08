package src;
import java.util.Scanner;

public class OperacionesRectangulo {

	public static void main (String[] args) {
	
		  double bas;
	      double alt;
          double result;
	  Rectangulo rectangulo = new Rectangulo();

	  Scanner sc = new Scanner(System.in);
          System.out.print("\ningresa la base: ");
          bas = sc.nextDouble();
          
          Scanner scanner = new Scanner(System.in);
          System.out.print("\ningresa la altura: ");
          alt = scanner.nextDouble();
	  
	  rectangulo.setBase(bas);
	  rectangulo.setAltura(alt);

	
	  result =  rectangulo.perimetro();
	  System.out.println("El perimetro es: " + result); 
			
	  result =  rectangulo.area();
	  System.out.println("El area es: " + result); 
	}

}
