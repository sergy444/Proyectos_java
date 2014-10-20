 /*
 * programa que pide un número por teclado y calcula si es par o impar
 */
import java.util.*;
public class Codigo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;      
        System.out.println("Introduzca numero: ");
        num = sc.nextInt();
	//Secuencia if en la que se divide el número en dos y si el resto es 0 lo declara como par
        if ((num%2)==0)
           System.out.println("PAR");
        else
            System.out.println("IMPAR");
    }
}
