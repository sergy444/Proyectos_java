/*
 * Clase para obtener resultados de distintas operaciones aritméticas.
 */
public class Arithmetic {


 //Método que suma dos números enteros y devuelve el resultado.
 public int sum (int num1, int num2) {

	int result = 0;
	result = num1 + num2;
	return result;
 }



 //Método que resta dos números enteros y devuelve el resultado.
 public int rest (int num1, int num2) {

	int result = 0;
	result = num1 - num2;
	return result;
 }
//Método para multiplicar
public int mult (int num1, int num2) {

	int result = 0;
	result = num1 * num2;
	return result;
 }

//Método para dividir
public int div (int num1, int num2) {
	int result = 0;
	result = num1 / num2;
	return result;
 }
}

