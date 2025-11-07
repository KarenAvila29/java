package com.cmc.directorio.entidades;



public class Contacto {
	private String apellido;
	private boolean activo;
	private Telefono Telefono;
	private double peso;
	
	//contructor
	public Contacto(String apellido, com.cmc.directorio.entidades.Telefono telefono, double peso) {
		this.apellido = apellido;
		Telefono = telefono;
		this.peso = peso;
	}
	public Contacto() {
		
	}
	private Telefono telefono;
	
	//get and set
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public boolean isActivo() {
		return activo;
	}
	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	public Telefono getTelefono() {
		return Telefono;
	}
	public void setTelefono(Telefono telefono) {
		Telefono = telefono;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
	public void Imprimir() {
		System.out.println("APELLIDO: " + apellido);
		System.out.println("Operadora: " + Telefono.getOperadora());
		System.out.println("Numero: " + Telefono.getNumero());
		System.out.println("Peso: " + peso);
		System.out.println("Activo " + activo);
	}
	
	
	
	

}
