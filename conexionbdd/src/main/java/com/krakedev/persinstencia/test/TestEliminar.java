package com.krakedev.persinstencia.test;




import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersona;


public class TestEliminar {
	public static void main(String[] args) {
		Persona p=new Persona();
		try {
			p.setCedula("1716225489");   
			AdminPersona.eliminar(p);
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println("error en el sistema "+e.getMessage());
		}
	}
}
