/*
  * programa que pide un número por teclado y calcula si es par o impar
  */
import java.util.*;
public class Codigo10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;      
        System.out.println("Introduzca numero: ");
        num = sc.nextInt();
	//Dividiendo el número en dos si el resto es iguala 0 lo dedclara par, sino, impar
        System.out.println((num%2)==0 ? "PAR" : "IMPAR");
    }
}
