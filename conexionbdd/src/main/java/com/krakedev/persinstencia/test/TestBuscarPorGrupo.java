package com.krakedev.persinstencia.test;

import java.util.ArrayList;

import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersona;

public class TestBuscarPorGrupo {

	public static void main(String[] args) {
		try {
			ArrayList<Persona> personas=AdminPersona.buscarPorGrupoCedula("25");
			System.out.println(personas);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
