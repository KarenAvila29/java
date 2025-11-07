package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContacto1 {

	public static void main(String[] args) {
		Telefono telf=new Telefono("movi" , "098234234",20);
		
		Contacto c=new Contacto("Karen",telf,10.8);
		c.Imprimir();
		
	}

}
