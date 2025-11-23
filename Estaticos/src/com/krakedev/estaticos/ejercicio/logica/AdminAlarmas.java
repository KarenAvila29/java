package com.krakedev.estaticos.ejercicio.logica;

import java.util.ArrayList;

import com.krakedev.estaticos.ejercicio.entidades.Alarma;

public class AdminAlarmas {
	
	 private ArrayList<Alarma> alarmas;
	 
	 
	 
	 public AdminAlarmas() {
	        alarmas = new ArrayList<>();  
	    } 
	 public AdminAlarmas(ArrayList<Alarma> alarmas) {
		super();
		this.alarmas = alarmas;
	}


	 public void agregarAlarma(Alarma alarma) {
		 	alarmas.add(alarma);
	 }


	 public ArrayList<Alarma> getAlarmas() {
		 return alarmas;
	 }
	 
	 

}
