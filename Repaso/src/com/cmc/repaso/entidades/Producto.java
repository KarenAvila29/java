package com.cmc.repaso.entidades;

public class Producto {
	private String nombre;
	private double precio;
	private double productoDescuento;
	
	public Producto(String nombre, double precio) {
		this.nombre=nombre;
		this.precio=precio;
	}
	
	public double calcularPrecioPromo(double productoDescuento) {
			this.productoDescuento=productoDescuento;
			 precio=(precio-(precio*productoDescuento)/100);
			return precio;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		if(precio<0) {
			precio=precio*-1;
		}
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	

}
