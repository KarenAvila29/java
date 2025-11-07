package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Telefono;

import com.cmc.directorio.entidades.AdminTelefono;
public class TestTelefono3 {

	public static void main(String[] args) {
		int contador=0;
		Telefono t1=new Telefono("movi" , "098234234",20);
		Telefono t2=new Telefono("claro" , "098234234",5);
		Telefono t3=new Telefono("movi" , "098234234",10);
		
		AdminTelefono  re= new AdminTelefono();
		contador=re.contarMovi(t1,t2,t3);
		
		System.out.println("Existe " + contador + " numeros movi");


	}

}
