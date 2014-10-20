
/*
 * Programa que pide dos números y un operador y muestra el resultado
 */
import java.util.*;
import java.io.*;
public class Codigo9 {
    public static void main(String[] args) throws IOException{
        int A,B, Resultado = 0 ;
        char operador;
        boolean calculado = true;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un numero entero:");
        A = sc.nextInt();
        System.out.print("Introduzca otro numero entero:");
        B = sc.nextInt();
        System.out.print("Introduzca un operador (+,-,*,/):");
        operador = (char)System.in.read();
        switch (operador) {
                case '-' : Resultado = A - B;
                           break;
                case '+' : Resultado = A + B;
                           break;
                case '*' : Resultado = A * B;
                           break;
		//La secfuencia If usada dentro de un case
                case '/' : if(B!=0)
                              Resultado = A / B;
                           else{
                              System.out.println("\nNo se puede dividir por cero");
                              calculado = false;
                           }
                           break;
		//En caso de que la variable cambiase, se usa el default para dar el mensaje de error.
                default : System.out.println("\nOperador no valido");
                          calculado = false;
                         
        }
        if(calculado){
            System.out.println("\nEl resultado es: " + Resultado);
        }
    }
}

