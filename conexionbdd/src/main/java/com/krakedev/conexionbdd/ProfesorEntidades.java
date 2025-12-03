package com.krakedev.conexionbdd;

public class ProfesorEntidades {
	private int codigo;
	 private String nombre;
	 
	 
	 
	 public ProfesorEntidades() {
		super();
	}
	 public ProfesorEntidades(int codigo, String nombre) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
	}
	 public int getCodigo() {
		 return codigo;
	 }
	 public void setCodigo(int codigo) {
		 this.codigo = codigo;
	 }
	 public String getNombre() {
		 return nombre;
	 }
	 public void setNombre(String nombre) {
		 this.nombre = nombre;
	 }
	 
	 

}
