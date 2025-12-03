package com.krakedev.conexionbdd;

public class TestConeccionEstudiantesEliminar {

	public static void main(String[] args) {
		EstudianteEntidades es=new EstudianteEntidades();
		
		 es.setCedula("1717171717");
		 try {
			AdminEstudiante.eliminar(es);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}
