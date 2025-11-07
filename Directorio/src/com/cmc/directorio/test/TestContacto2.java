package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContacto2 {

	public static void main(String[] args) {
		Telefono telf1=new Telefono("movi" , "098234234",20);
		Contacto c1=new Contacto("Karen",telf1,10.5);

		Telefono telf2=new Telefono("claro" , "098234234",20);
		Contacto c2=new Contacto("Karen",telf2,3.5);
		
		AdminContactos rc1 =new AdminContactos();
		 Contacto mc=rc1.buscarMasPesado(c1,c2);
		 if(mc==c1) {
			 c1.Imprimir();
		 }else if (mc==c2){
			 c2.Imprimir();
		 }
		 //copara operadoras
		 AdminContactos rc2 =new AdminContactos();
		 boolean r=rc2.compararOperadora(telf1,telf2);
		 if(r==true) {
			 System.out.println("true");
		 }else if (r==false){
			 System.out.println("false");
		 }

	}

}
