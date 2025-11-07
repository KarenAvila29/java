package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Estudiante;

public class TestEstudiante {

	public static void main(String[] args) {
		
		Estudiante estudiante=new Estudiante("MARIA");
		
		estudiante.Calificar(11);
		System.out.println("Estudiante: " + estudiante.getNombre());
		System.out.println("Calificaion: " + estudiante.getResultado());
	}

}
