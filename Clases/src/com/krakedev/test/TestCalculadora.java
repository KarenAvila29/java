package com.krakedev.test;

import com.krakedev.Calculadora;

public class TestCalculadora {

	public static void main(String[] args) {
		Calculadora calcu;
		int resultadoSuma;
		double resultadoResta;
		double resultadoMultiplicacion;
		double resultadoDividir;
		double resultadoPromediar;
		
		
		calcu=new Calculadora();
		
		resultadoSuma=calcu.sumar(5,3);
		System.out.println("RESULTADO SUMA: "+resultadoSuma);
		
		resultadoResta=calcu.restar(10, 3);
		System.out.println("RESULTADO RESTA: "+resultadoResta);
		
		resultadoMultiplicacion=calcu.multiplicar(10, 5);
		System.out.println("RESULTADO DE LA MULTIPLICACION: " + resultadoMultiplicacion);
		
		resultadoDividir=calcu.dividir(10, 2);
		System.out.println("RESULTADO DE LA DIVISION: " + resultadoDividir);
		
		resultadoPromediar=calcu.promediar(10, 8, 9);
		System.out.println("RESULTADO DEL PROMEDIO: " + resultadoPromediar);
		
		calcu.mostrarResultado();
		
	}
}
