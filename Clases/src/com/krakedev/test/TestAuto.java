package com.krakedev.test;

import com.krakedev.Auto;

public class TestAuto {

	public static void main(String[] args) {
		//instanciar dos autos y referenciarlos con las variables auto1 y auto1
		Auto auto1=new Auto("FERRARI",1999,12563.25);
		Auto auto2=new Auto("Toyota",2025,12547.00);
		/*
		//modificar atributos de cada uno 
		auto1.setMarca("FERRARI");
		auto1.setAnio(1999);
		auto1.setPrecio(12563.25);
		
		auto2.setMarca("Toyota");
		auto2.setAnio(2025);
		auto2.setPrecio(12547.00);
		*/
		//mostrar los valores de los atributos de los 2 autos en consola
		System.out.println("****************AUTO A******************* ");
		
		System.out.println("Marca: " + auto1.getMarca());
		System.out.println("Año: " + auto1.getAnio());
		System.out.println("Precio: " + auto1.getPrecio());
		
		System.out.println("***************AUTO B******************** ");
		
		System.out.println("Marca: " + auto2.getMarca());
		System.out.println("Año: " + auto2.getAnio());
		System.out.println("Precio: " + auto2.getPrecio());
				

	}

}
