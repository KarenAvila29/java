package com.cmc.evaluacion.evaluacion;

public class Utilitario {
	
	public static double redondear(double numero ) {
		double r = Math.round(numero * 100.0) / 100.0;
		return r;
		
	}

}
