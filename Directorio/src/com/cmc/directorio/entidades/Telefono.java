package com.cmc.directorio.entidades;

public class Telefono {
	private String operadora;
	private String numero;
	private int codigo;
	private boolean tieneWhatsapp;
	
	public Telefono() {
		
	}
	//Crear un Constructor que reciba codigo, operadora y numero y los asigne a los atributos respectivos,
		//el valor inicial del atributo tieneWhatsapp debe ser false
		
	public Telefono(String operadora, String numero, int codigo) {
		this.operadora = operadora;
		this.numero = numero;
		this.codigo = codigo;
		this.tieneWhatsapp=false;
		
	}
	
	//get and set

	public String getOperadora() {
		return operadora;
	}

	public void setOperadora(String operadora) {
		this.operadora = operadora;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public boolean isTieneWhatsapp() {
		return tieneWhatsapp;
	}

	public void setTieneWhatsapp(boolean tieneWhatsapp) {
		this.tieneWhatsapp = tieneWhatsapp;
	}
	
	//imprimir
	public void Imprimir() {
		System.out.println("Operadora: " + operadora);
		System.out.println("Numero: " + numero);
		System.out.println("Codigo: " + codigo);
		System.out.println("Whatsapp: " + tieneWhatsapp);
	}
	
	
	

}
