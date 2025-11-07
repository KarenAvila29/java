package com.krakedev;

public class TestCuadrado {

	public static void main(String[] args) {
		Cuadrado l1=new Cuadrado();
		Cuadrado l2=new Cuadrado();
		Cuadrado l3=new Cuadrado();
		
		double area1;
		double area2;
		double area3;
		
		double perimetro1;
		double perimetro2;
		double perimetro3;
		
		//asignacion de valores
		l1.setLado(5);
		l2.setLado(4);
		l3.setLado(3);
		
		//calcular resultados
		area1=l1.calcularArea();
		perimetro1=l1.calcularPerimetro();
		System.out.println("Area lado 1: " + area1);
		System.out.println("Perimetro lado 1: " + perimetro1);
		
		area2=l2.calcularArea();
		perimetro2=l2.calcularPerimetro();
		System.out.println("Area lado 2: " + area2);
		System.out.println("Perimetro lado 2: " + perimetro2);
		
		area3=l3.calcularArea();
		perimetro3=l3.calcularPerimetro();
		System.out.println("Area lado 3: " + area3);
		System.out.println("Perimetro lado 3: " + perimetro3);
		
		
		
		
	}

}
