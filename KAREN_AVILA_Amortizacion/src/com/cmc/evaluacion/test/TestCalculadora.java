package com.cmc.evaluacion.test;



import com.cmc.evaluacion.entidades.Prestamo;
import com.cmc.evaluacion.servicios.CalculadoraAmortizacion;
public class TestCalculadora {
	public static void main(String[] args) {
		Prestamo p = new Prestamo(5000, 12, 12); // monto, plazo, interés
		CalculadoraAmortizacion calc = new CalculadoraAmortizacion();

		calc.generarTabla(p);
		calc.mostrarTabla(p);
}
}
