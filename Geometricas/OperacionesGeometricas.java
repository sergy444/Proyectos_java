import java.util.Scanner;
import com.zubiri.geometria.*;

public class OperacionesGeometricas {

	public static void main (String args[]) {

	double result;
	double bas;
	double alt;
	double radio;
	final double n = 3.1416;
	char resp;
	


	
	System.out.print("\n¿Quiére realizar operaciones con Circulos o con Rectangulos? Seleccione C para circulos, R para rectangulos o S para salir del programa.");

	
	Scanner sc = new Scanner(System.in);
		resp = sc.next().charAt(0);

	while ((resp != 'S')&&(resp != 's')){
	
		if ((resp == 'C')||(resp == 'c')) {
			
		
			
			Circulo op = new Circulo(0);

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
		
		if ((resp == 'R')||(resp == 'r')) {

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
System.out.print("\n¿Quiére realizar operaciones con Circulos o con Rectangulos? Seleccione C para circulos, R para rectangulos o S para salir del programa.");


	Scanner scanner = new Scanner(System.in);
		resp = scanner.next().charAt(0);	
	}
		
	
	}
}
