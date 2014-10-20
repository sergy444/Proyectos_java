
/*
 * Programa que pide un número de mes y muestra el nombre correspondiente
 */
import java.util.*;
public class Codigo8 {
    public static void main(String[] args) {
        int mes;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un numero de mes: ");
        mes = sc.nextInt();
	//La estructura de control switch, con la que se dan diferentes casos
        switch (mes)
        {
		//La secuencia case, parte de la secuencia switch
                case 1: System.out.println("ENERO");
			//Comando necesario para salir de la secuencia case
                           break;
                case 2: System.out.println("FEBRERO");
                           break;
                case 3: System.out.println("MARZO");
                           break;
                case 4: System.out.println("ABRIL");
                           break;
                case 5: System.out.println("MAYO");
                           break;
                case 6: System.out.println("JUNIO");
                           break;
                case 7: System.out.println("JULIO");
                           break;
                case 8: System.out.println("AGOSTO");
                           break;
                case 9: System.out.println("SEPTIEMBRE");
                           break;
                case 10: System.out.println("OCTUBRE");
                             break;
                case 11: System.out.println("NOVIEMBRE");
                             break;
                case 12: System.out.println("DICIEMBRE");
                             break;
                default : System.out.println("Mes no válido");                       
        }
    }
}

