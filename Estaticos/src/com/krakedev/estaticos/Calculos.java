package com.krakedev.estaticos;

public class Calculos {
	//final determina la constante no se puede cambiar(variable se vuelve constante)
	private final double IVA=12;
	
	public double calcularIva(double monto) {
		return monto*IVA/100;
	}
		
}
