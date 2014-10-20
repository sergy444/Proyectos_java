 /*
 * programa que lee un número n y muestra n asteriscos
 */
import java.util.*;
public class Codigo12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, contador = 0;
        System.out.print("Introduce un número: ");
        n = sc.nextInt();
        while (contador < n){
               System.out.println(" * ");
		//Secuencia donde cada bucle le suma 1 a la variable contador
               contador++;
        }
    }
}
