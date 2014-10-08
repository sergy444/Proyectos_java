package com.zubiri.geometria;

public class Circulo {

private double radio = 0;
//Constructor
public Circulo(double rad){

	this.radio=rad;

}


//Metodo para calcular el Área
 public double area (double n){

	double result = 0;
	result = n * this.getRadio() * this.getRadio();
	return result;
 }
//Metodo para calcular la circunferencia
 public double circun (double n){

	double result = 0;
	result = 2*this.getRadio()*n;
	return result;
 }


public double getRadio() {

		return radio;
	}	

	public void setRadio(double rad) {

		radio = rad;
	}
}
