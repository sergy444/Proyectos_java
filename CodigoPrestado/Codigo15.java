 /*
 * Programa que lee un número entre 1 y 10 ambos incluidos
 */
import java.util.*;
public class Codigo15 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner( System.in );
        do {
            System.out.print("Escribe un número entre 1 y 10: ");
            n = sc.nextInt();
	//Dentro de la secuencia while se encuentra el operador lógico OR
        }while (n<1 || n >10);
        System.out.println("Ha introducido: " + n);
    }
}
