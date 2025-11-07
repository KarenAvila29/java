package com.krakedev;

public class Calculadora {
	//funcion sumar
	 public int sumar(int valor1, int valor2) {
		int resultado;//declarar variable
		resultado=valor1+valor2;
		return resultado;
	}
	//funcion restar
	public double restar(int valor1, int valor2) {
		double resultado;
		resultado=valor1-valor2;
		return resultado;
	}	
	//funcion multiplicar
	public double multiplicar(double valor1, double valor2) {
		double resultado;
		resultado=valor1*valor2;
		return resultado;
	}
	//funcion dividir
	public double dividir (double dividendo,double divisor) {
		double resultado;
		resultado=dividendo/divisor;
		return resultado;
	}
	//funcion promediar
	public double promediar(double valor1,double valor2,double valor3) {
		double resultado;
		resultado=(valor1+valor2+valor3)/3;
		return resultado;
	}
	//funcion mostrar resultado
	public void mostrarResultado() {
		System.out.println("Ahorita no joven,Sali al almuerzo.Regreso en 15 minutos");	
	}
	
	
}
