package com.krakedev;

public class Cuadrado {
	public double lado;
	
	
	public double calcularArea() {
		double resultado=lado*lado;
		return resultado;
	}
	
	public double calcularPerimetro() {
		double resultado=lado*4;
		return resultado;
	}
	//get and set

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	
}
