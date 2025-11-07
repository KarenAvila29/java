package com.krakedev.test;
/*
 * Comentraio varias lineas
 * 
 * */

import com.krakedev.Persona;

public class TestPersona {

	public static void main(String[] args) {
		Persona p;// Declaro una variable llamada p tipo persona
		Persona p2 = new Persona();
		//Persona p3 = new Persona("Pablo");
		Persona p4 = new Persona("Pablo",43,1.60);
		
		System.out.println("Nombre: " + p4.getNombre());
		System.out.println("Edad: " + p4.getEdad());
		System.out.println("Estatura: " + p4.getEstatura());
		
		p = new Persona();// Instanciar un objeto persona,referenciarlo con p
		// 3 Accedo a los atributos
		System.out.println("Nombre: " + p.getNombre());
		System.out.println("Edad: " + p.getEdad());
		System.out.println("Estatura: " + p.getEstatura());
		// Modificar atributos
		p.setNombre("Mario");
		p.setEdad(45);
		p.setEstatura(1.56);

		System.out.println("------------------");
		// 5.Acceso a los atributos
		System.out.println("Nombre: " + p.getNombre());
		System.out.println("Edad: " + p.getEdad());
		System.out.println("Estatura: " + p.getEstatura());

		p2.setNombre("Angeline");

		System.out.println("***********************");

		System.out.println("p.nombre: " + p.getNombre());
		System.out.println("p2.nombre: " + p2.getNombre());

		// 4Modificar los atributos
		p.setNombre("Mario");
		p.setEdad(45);
		p.setEstatura(1.56);
		
		System.out.println("-------------------------");
		//acceder a datos
		System.out.println("Nombre: " + p.getNombre());
		System.out.println("Edad: " + p.getEdad());
		System.out.println("Estatura: " + p.getEstatura());
	}

}
