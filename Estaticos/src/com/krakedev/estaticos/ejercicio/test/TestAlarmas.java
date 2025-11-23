package com.krakedev.estaticos.ejercicio.test;


import java.util.ArrayList;

import com.krakedev.estaticos.ejercicio.entidades.Alarma;
import com.krakedev.estaticos.ejercicio.logica.AdminAlarmas;
import com.krakedev.estaticos.ejercicio.utils.DiasSemana;

public class TestAlarmas {

	public static void main(String[] args) {
			Alarma alarma1=new Alarma(DiasSemana.LUNES, 5, 45);
			Alarma alarma2=new Alarma(DiasSemana.MARTES, 7, 20);
			Alarma alarma3=new Alarma(DiasSemana.MIERCOLES, 4, 45);
			AdminAlarmas admin=new AdminAlarmas();
		    admin.agregarAlarma(alarma1);
		    admin.agregarAlarma(alarma2);
		    admin.agregarAlarma(alarma3);
			ArrayList<Alarma> alarmasActuales=admin.getAlarmas();
			System.out.println(alarmasActuales);

	}



}
