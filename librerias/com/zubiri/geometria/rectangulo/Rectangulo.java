package com.zubiri.geometria;

public class Rectangulo {

	
	private double altura;
	private double base;

	
	public double perimetro() {

		double result;

		
		result = 2*this.getBase()+2*this.getAltura();

		return result;
	}

	
	public double area() {

		double result;

		result = this.getBase()*this.getAltura();

		return result;
	}

	public double getBase() {

		return base;
	}	

	public void setBase(double bas) {

		base = bas;
	}
	
	public double getAltura() {

		return altura;
	}	

	public void setAltura(double alt) {

		altura = alt;
	} 
}

























