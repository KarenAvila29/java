package com.cmc.evaluacion.servicios;



import com.cmc.evaluacion.entidades.Cuota;
import com.cmc.evaluacion.entidades.Prestamo;
import com.cmc.evaluacion.evaluacion.Utilitario;

public class CalculadoraAmortizacion {

	
		public static double calcularCuota(Prestamo prestamo) {
			
			double interesMensual = prestamo.getInteres() / 100 / 12;
		    int n = prestamo.getPlazo(); // 
		    double P = prestamo.getMonto();

		    double cuota = (P * interesMensual) / (1 - Math.pow(1 + interesMensual, -n));
		    return cuota;
		}
		public static void generarTabla(Prestamo prestamo) {
			
			double cuotaConstante = calcularCuota(prestamo);
	        double saldoInicial = prestamo.getMonto();
	        Cuota cuotaAnterior = null;

	        for (int i = 0; i < prestamo.getPlazo(); i++) {

	            Cuota actual = new Cuota(i + 1);
	            actual.setCuota(cuotaConstante);
	            actual.setSaldo(saldoInicial);

	            calcularValoresCuota(prestamo.getInteres(), cuotaAnterior, actual);

	            prestamo.getCuotas().add(actual);

	            saldoInicial = actual.getSaldo();
	            cuotaAnterior = actual;
	        }

	        // Ajustar última cuota
	        Cuota ultima = prestamo.getCuotas().get(prestamo.getCuotas().size() - 1);

	        if (ultima.getSaldo() != 0) {
	            ultima.setAbonoCapital(ultima.getAbonoCapital() + ultima.getSaldo());
	            ultima.setSaldo(0);
	        
			       
		}
		}
		public static   void calcularValoresCuota(double interesAnual, Cuota anterior, Cuota actual) {
			
			double interesMensual = interesAnual / 100 / 12;

	        double saldo = anterior == null ? actual.getSaldo() : anterior.getSaldo();

	        double valorInteres = saldo * interesMensual;
	        double abonoCapital = actual.getCuota() - valorInteres;
	        double saldoFinal = saldo - abonoCapital;

	        actual.setInteres(valorInteres);
	        actual.setAbonoCapital(abonoCapital);
	        actual.setSaldo(saldoFinal);
		    
		        
		}
		
		
		
		public void mostrarTabla(Prestamo prestamo) {
			 System.out.println("N° | CUOTA   | INICIO  | INTERES  | ABONO  | SALDO");

		        for (Cuota c : prestamo.getCuotas()) {
		        	System.out.println(Utilitario.redondear(c.getNumero())+" | "    +Utilitario.redondear(c.getCuota())+" | "  +    Utilitario.redondear(c.getSaldo()+c.getAbonoCapital()) +" | "
		    				+Utilitario.redondear(c.getInteres()) +" | "+ Utilitario.redondear(c.getAbonoCapital())+" | "+Utilitario.redondear(c.getSaldo()));
		                    
		             
		                 
		                   
		        }
		}
}
