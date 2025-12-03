package com.krakedev.persinstencia.test;

import java.util.ArrayList;

import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersona;

public class TestConsultaPersonas {

	public static void main(String[] args) {
		try {
			ArrayList<Persona> personas=AdminPersona.buscarPorNombre("Karen");
			System.out.println(personas);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			
		}

	}

}
