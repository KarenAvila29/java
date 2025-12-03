package com.krakedev.persinstencia.test;

import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersona;

public class TestBuscarPorCedula {

	public static void main(String[] args) {
		try {
			Persona per=AdminPersona.buscarPorCedula("1306573428");
			System.out.println(per);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
