import java.io.*;
import java.util.*;
public class ReaderProba {

public static void main (String args[]) {
int [] anArray;
int n;
anArray = new int[5];
anArray[0]=1;
anArray[1]=2;
anArray[2]=3;
anArray[3]=4;
anArray[4]=5;

Scanner sc = new Scanner(System.in);
	n = sc.nextInt();
anArray.read(anArray[n]);
System.out.println(anArray[n]);



}

}
