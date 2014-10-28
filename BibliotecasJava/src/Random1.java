import java.util.*;

public class Random1 {

public static void main (String args[]){


int a;
int b;
int c;
System.out.print("\nImprimira en pantalla un número pseudoaleatorio y se sumará a otro número");




Random random = new Random ();

a= random.nextInt();	

System.out.print("\n el número creado pseudoaleatoriamente: "+ a + " ");



Random random2 = new Random ();

b= random2.nextInt();	

System.out.print("\n el segundo número creado pseudoaleatoriamente: "+ b + " ");

c=a+b;

System.out.print("\nLa suma es: "+ c + " ");
System.out.print("\n");





}

}