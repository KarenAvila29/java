package com.krakedev.evaluacion;

import java.util.ArrayList;

public class Contacto {
	private String cedula;
	private String nombre;
	private String apellido;
	private Direccion direccion;
	private Telefono telefono;
	ArrayList<Telefono> t = new ArrayList<Telefono>();
	
	
	public Contacto(String cedula, String nombre, String apellido) {
		
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	
	public Telefono getTelefono() {
		return telefono;
	}


	public void setTelefono(Telefono telefono) {
		this.telefono = telefono;
	}


	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	
	public void imprimir() {
		
		System.out.println("*******" + nombre+apellido +"*******");
		if(direccion !=null) {
		System.out.println("Direccion:" + direccion.getCallePrincipal() + direccion.getCalleSecundaria());
		}else {
			System.out.println("No tiene asociada una direccion");
		}
		
	}
	
	public void agregarTelefono(Telefono telefono) {
		t.add(telefono);
	}
	
	public void mostrarTelefonos() {
		System.out.println("Telefono con Estado: "+ " C ");
		for(int i=0;i<t.size();i++) {
			 Telefono telefono = t.get(i);
			if(telefono!=null &&  (telefono.getEstado().equals("C")) ) {
			System.out.println("Numero: " + telefono.getNumero() + ",   Tipo " + telefono.getTipo());
					}
	}
		}
	
	public ArrayList<Telefono> recuperarIncorrectos() {
		ArrayList<Telefono> telefonosIncorrectos = new ArrayList<Telefono>();
		for(int i=0;i<t.size();i++) {
			 Telefono telefono = t.get(i);
			if(("E".equals(telefono.getEstado())) ) {
				telefonosIncorrectos.add(telefono);
			}
		}
		return telefonosIncorrectos;
		}
}
