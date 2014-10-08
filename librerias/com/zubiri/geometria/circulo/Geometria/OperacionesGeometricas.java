package Geometria;


import java.util.Scanner;


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


	
	

	
	Scanner sc = new Scanner(System.in);
	System.out.print("\n¿Quieres realizar operaciones con circulos o con rectangulos?");
		resp = sc.toString();

	
		if (resp.equals("circulos")){
			
		
			double resultadoArea, resultadoCircunferencia;
			OperacionesCirculo operaciones = new OperacionesCirculo();

			Scanner scanner = new Scanner(System.in);
				System.out.print("\nMete el radio del círculo: ");
				radio = scanner.nextFloat();

			
			resultadoArea = operaciones.area(radio, n);
			resultadoCircunferencia = operaciones.circun(radio, n);

			System.out.println("\nEl resultado del Area es: " + resultadoArea);
			System.out.println("\nEl resultado de la Circunferencia es: " + resultadoCircunferencia);

			
		}
		else {
			System.out.print("\nNo es una respuesta válida");
		}
		
		if (resp.equals("rectangulos")) {

			 Rectangulo rectangulo = new Rectangulo();

	 		 Scanner scaner = new Scanner(System.in);
          			System.out.print("\ningresa la base: ");
          			bas = scaner.nextDouble();
          
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
	else {
		System.out.print("\nNo es una respuesta válida");
}	
	}
}
