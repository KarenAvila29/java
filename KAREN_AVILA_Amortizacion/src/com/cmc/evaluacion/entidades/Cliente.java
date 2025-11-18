package com.cmc.evaluacion.entidades;

import java.util.ArrayList;

public class Cliente {
	private String cedula;
	private String nombre;
	private String apellido;
	private ArrayList<Prestamo> prestamos = new ArrayList<>();

    
	
	
	
	public Cliente(String cedula, String nombre, String apellido) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
	}



	public Cliente(String cedula, String nombre, String apellido, ArrayList<Prestamo> prestamos) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.prestamos = new ArrayList<>();
	}



	public Cliente() {
		 this.prestamos = new ArrayList<>();
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
	
	


   
    
	public void mostrarCliente() {
		System.out.println("Cliente Registrado:  " + nombre+" " +apellido +"  [Cedula= " + cedula +"  Nombre= "+ nombre +"  Apellido= "+apellido) ;
	}

	
	public ArrayList<Prestamo> getPrestamos() {
	    return prestamos;
	}


	
}
