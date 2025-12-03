package com.krakedev.persinstencia.test;

import java.math.BigDecimal;
import java.util.Date;

import com.krakedev.persistencia.entidades.EstadoCivil;
import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersona;
import com.krakedev.persistencia.utils.Convertidor;


public class TestActualizar {

	public static void main(String[] args) {
		EstadoCivil ec=new EstadoCivil("U","Union Libre");
		Persona p=new Persona();
		try {
			Date fechaNac=Convertidor.ConvertirFecha("2023/11/22");
			Date horaNac=Convertidor.ConvertirHora("14:23:00");
			p.setCedula("1715225489");   
            p.setNombre("Karen");
            p.setApellido("Avila");
            p.setNumeroHijos(2);
            p.setEstatura(1.62);
            p.setCantidadAhorrada(new BigDecimal("150.50"));
            p.setEstadoCivil(ec); 
            p.setFechaNacimiento(fechaNac);
            p.setHoraNacimiento(horaNac);
            
			AdminPersona.actualizar(p);
			
		} catch (Exception e) {
			
			//e.printStackTrace();
			System.out.println("error en el sistema "+e.getMessage());
		}
		

	}

}
