package com.krakedev.conexionbdd;

import java.util.Date;

import com.krakedev.persistencia.utils.Convertidor;

public class TestConeccionEstudiantesActualizar {

	public static void main(String[] args) {
		ProfesorEntidades p=new ProfesorEntidades(21,"Francisco");
		EstudianteEntidades est=new EstudianteEntidades();
			
		try {
			
			Date fechaNac=Convertidor.ConvertirFecha("1993/12/23");
			est.setNombre("Karen");
			est.setApellido("Avila");
			est.setEmail("tartha@papapa.com");
			est.setFechaNacimiento(fechaNac);
			est.setCodigo_profesor(p);
			est.setCedula("1717171717");
			
			AdminEstudiante.actualizar(est);
			
		} catch (Exception e) {
			
			//e.printStackTrace();
			System.out.println("error en el sistema "+e.getMessage());
		}

	}

}
