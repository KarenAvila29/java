package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestActivos {

	public static void main(String[] args) {
		Telefono telf=new Telefono("claro" , "098234234",20);
		Contacto c1=new Contacto("Karen",telf,10.5);
		
		AdminTelefono  at= new AdminTelefono();
		at.activarMensajeria(telf);
		telf.Imprimir();
		
		AdminContactos r=new AdminContactos();
		r.activarUsuario(c1);
		c1.Imprimir();
	}

}
