package com.krakedev.persinstencia.test;

import java.math.BigDecimal;
import java.util.Date;

import com.krakedev.persistencia.entidades.EstadoCivil;
import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersona;
import com.krakedev.persistencia.utils.Convertidor;


public class TestAdminPersona {

	public static void main(String[] args) {
		EstadoCivil ec=new EstadoCivil("U","Union Libre");
		Persona p=new Persona("1715225489","Julio","Jaramillo",ec);
		try {
			Date fechaNac=Convertidor.ConvertirFecha("2020/12/23");
			Date horaNac=Convertidor.ConvertirHora("12:23:00");
			p.setFechaNacimiento(fechaNac);
			p.setHoraNacimiento(horaNac);
			p.setCantidadAhorrada(new BigDecimal(1230.45));
			p.setNumeroHijos(50);
			AdminPersona.insertar(p);
			
		} catch (Exception e) {
			
			//e.printStackTrace();
			System.out.println("error en el sistema "+e.getMessage());
		}
		
	
	
		
	}

}
