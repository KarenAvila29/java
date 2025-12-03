package com.krakedev.conexionbdd;

import java.util.Date;

import com.krakedev.persistencia.utils.Convertidor;

public class TestConeccionEstudiantesIngresar {

	public static void main(String[] args) {

ProfesorEntidades p=new ProfesorEntidades(21,"Marcos");
EstudianteEntidades es=new EstudianteEntidades();
	
try {
	
	Date fechaNac=Convertidor.ConvertirFecha("2019/12/23");
	
	es.setCedula("1717171717");
	es.setNombre("MARTHA");
	es.setApellido("PEREZ");
	es.setEmail("martha@papapa.com");
	es.setFechaNacimiento(fechaNac);
	es.setCodigo_profesor(p);
	AdminEstudiante.insertar(es);
	
} catch (Exception e) {
	
	//e.printStackTrace();
	System.out.println("error en el sistema "+e.getMessage());
}


	}
}
