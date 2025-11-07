package com.krakendev.test;

import com.krakedev.composicion.Direccion;
import com.krakedev.composicion.Persona;

public class TestPersona {

	public static void main(String[] args) {
		Persona p1=new Persona();
		p1.setNombre("Karen");
		p1.setApellido("Avila");
		Direccion dir=new Direccion();
		dir.setCallePrincipal("av.siempre viva");
		dir.setCalleSecundaria("la que cruza");
		dir.setNumero("n-45-85");
		p1.setDireccion(dir);
		
		String nombre=p1.getNombre();
		Direccion d1=p1.getDireccion();
		System.out.println(nombre);
		//
		System.out.println(d1.getCallePrincipal());
		
		p1.Imprimir();
		
		Persona p2=new Persona();
		Direccion d2=new Direccion("av. de los srys", "eloy alfaro", "s/n");
		p2.setNombre("Mario");
		p2.setDireccion(d2);
		p2.Imprimir();
		
		Persona p3=new Persona();
		p3.setDireccion(new Direccion("vvvvv","xxxxx","125"));
		p3.Imprimir();
	}

}
